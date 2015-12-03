<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.itravel.common.config.Global"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="msg" uri="http://tzj/message"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	String cssPath = basePath + "/" + "static/css/";
	String jsPath = basePath + "/" + "static/js/";
	String imgPath = basePath + "/" + "static/img/";
	String filePath = basePath + "/";
	basePath = basePath + Global.getTravelPath() + "/";
%>
<c:set var="basePath" value="<%=basePath%>" />