<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Document</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>sort/index.css">
</head>
<body>
	<div class="top width img-line">
		<img src="<%=mImg%>sort/cache/top.png" class="width">
		<form action="<%=basePath %>search" class="form">
			<input type="text" class="search form-control input-border-none" placeholder="搜索目的地、国家、城市">
		</form>
	</div>
	<div class="column width">
		<iframe id="a" src="<%=basePath %>sort/iframepage/left" class="col-2" frameborder="0" scrolling="yes"></iframe>
		<iframe id="b" src="<%=basePath %>sort/iframepage/right" class="col-8" frameborder="0" scrolling="yes"></iframe>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
	<script type="text/javascript" src="<%=mJs%>modules/sort/index.js"></script>
</html>