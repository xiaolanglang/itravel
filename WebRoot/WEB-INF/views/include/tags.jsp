<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.bktravel.common.config.Global"%>
<%@include file="/WEB-INF/views/include/taglibs.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	String bpath = basePath + "/";
	String cssPath = bpath + "static/css/";
	String jsPath = bpath + "static/js/";
	String imgPath = bpath + "static/img/";
	String filePath = bpath;
	basePath = basePath + Global.getPath() + "/";
%>
<c:set var="basePath" value="<%=basePath%>" />
