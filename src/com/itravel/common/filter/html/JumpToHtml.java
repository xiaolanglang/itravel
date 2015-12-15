package com.itravel.common.filter.html;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class JumpToHtml implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
			ServletException {
		File file = new File("C:\\Users\\Administrator\\Desktop\\1.html");
		FileInputStream inputStream = new FileInputStream(file);

		HttpServletResponse response = (HttpServletResponse) res;

		MyHttpServletResponseWrapper wrapper = new MyHttpServletResponseWrapper(response);
		chain.doFilter(req, wrapper);

		byte[] bs = wrapper.getResponseData();
		inputStream.read(bs);
		inputStream.close();

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	private class MyHttpServletResponseWrapper extends HttpServletResponseWrapper {
		public static final int OT_NONE = 0, OT_WRITER = 1, OT_STREAM = 2;
		private int outputType = OT_NONE;
		private ServletOutputStream output = null;
		private PrintWriter writer = null;
		private ByteArrayOutputStream buffer = null;

		public MyHttpServletResponseWrapper(HttpServletResponse resp) throws IOException {
			super(resp);
			buffer = new ByteArrayOutputStream();
		}

		public PrintWriter getWriter() throws IOException {
			if (outputType == OT_STREAM)
				throw new IllegalStateException();
			else if (outputType == OT_WRITER)
				return writer;
			else {
				outputType = OT_WRITER;
				writer = new PrintWriter(new OutputStreamWriter(buffer, getCharacterEncoding()));
				return writer;
			}
		}

		public ServletOutputStream getOutputStream() throws IOException {
			if (outputType == OT_WRITER)
				throw new IllegalStateException();
			else if (outputType == OT_STREAM)
				return output;
			else {
				outputType = OT_STREAM;
				output = new WrappedOutputStream(buffer);
				return output;
			}
		}

		public void flushBuffer() throws IOException {
			if (outputType == OT_WRITER)
				writer.flush();
			if (outputType == OT_STREAM)
				output.flush();
		}

		public void reset() {
			outputType = OT_NONE;
			buffer.reset();
		}

		public byte[] getResponseData() throws IOException {
			flushBuffer();
			return buffer.toByteArray();

		}

		class WrappedOutputStream extends ServletOutputStream {
			private ByteArrayOutputStream buffer;

			public WrappedOutputStream(ByteArrayOutputStream buffer) {
				this.buffer = buffer;
			}

			public void write(int b) throws IOException {
				buffer.write(b);
			}

			@SuppressWarnings("unused")
			public byte[] toByteArray() {
				return buffer.toByteArray();
			}
		}
	}

}
