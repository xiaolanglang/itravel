<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>error</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<style type="text/css">
		body,html,.height{height: 100%;}
		body{display: table;position: relative;}
		.content{text-align: center;position: absolute;left: 0px;right: 0px;
			top: 0px;bottom: 0px;margin: auto;display: inherit;}
		.content a{width: 100px;}
		.reload{background-color: transparent;border: 1px solid #ccc;color: #aaa}
		.wifi{width: 30%;}
	</style>
</head>
<body class="width">
	<div class="width content">
		<div class="width">
			<img src="<%=mImg%>/error/wifi.png" class="wifi">
		</div>
		<a type="button" class="btn btn-default reload" href="javascript:location.reload()">重新加载</a>
	</div>
</body>
</html>