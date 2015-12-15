package com.itravel.common.filter.html;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import com.bkweb.common.httpservlet.MyHttpServletResponseWrapper;
import com.bkweb.common.utils.FileUtils;

import com.bkweb.common.utils.FileUtils;

public class JumpToHtml implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
			ServletException {
		String filePath = "C:\\Users\\Administrator\\Desktop\\1.html";
		FileUtils.createFile(filePath);
		File file = new File(filePath);
		FileOutputStream outputStream = new FileOutputStream(file);

		HttpServletResponse response = (HttpServletResponse) res;

		MyHttpServletResponseWrapper wrapper = new MyHttpServletResponseWrapper(response);
		chain.doFilter(req, wrapper);

		byte[] bs = wrapper.getResponseData();
		outputStream.write(bs, 0, bs.length);
		outputStream.flush();
		outputStream.close();
		ServletOutputStream output = response.getOutputStream();
		String yes = "121212";
		output.write(yes.getBytes());
		output.flush();
		output.close();
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
