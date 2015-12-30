<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/taglibs.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	String bpath = basePath + "/";
	String mCss = bpath + "static/mobile/css/";
	String mJs = bpath + "static/mobile/js/";
	String mImg = bpath + "static/mobile/img/";
	basePath = basePath + "/";
%>
<c:set var="basePath" value="<%=bpath%>" />
