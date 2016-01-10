<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en" class="height">
<head>
	<title>Document</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>sort/index.css">
	<style type="text/css">
		body{min-width: inherit;}
	</style>
</head>
<body class="width height">
	<div class="column-left width">
		<ul class="nav" id="left-menu">
			<c:forEach items="${list}" var="sort" varStatus="status">
				<li my-data-selected="right-column${status.index + 1 }">
					<a href="javascript:void(0)">${sort.name }</a>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
	<script type="text/javascript" src="<%=mJs%>sort/left.js"></script>
</html>