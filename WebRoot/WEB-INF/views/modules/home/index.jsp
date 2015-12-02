<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/tags.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Love Travel</title>
<%@include file="/WEB-INF/views/include/header.jsp"%>
<!-- tempCss -->
<link rel="stylesheet" type="text/css" href="<%=cssPath%>common/jquery.hoverdir.css">
<link rel="stylesheet" type="text/css" href="<%=cssPath%>common/jquery.slides.css">
<!-- pageCss -->
<link rel="stylesheet" type="text/css" href="<%=cssPath%>modules/index/index.css">
</head>
<body>
	<!-- 导入头部元素 -->
	<div id="index_top">
		<%@include file="/WEB-INF/views/modules/home/top/top.jsp"%>
	</div>
	<!-- 导入header元素 -->
	<div id="index_header">
		<%@include file="/WEB-INF/views/modules/home/header/header.jsp"%>
	</div>
	<!-- 导入column -->
	<div id="index_column">
		<%@include file="/WEB-INF/views/modules/home/column/column.jsp"%>
	</div>
	<!-- 导入图片墙 -->
	<div id="index_photo_wall">
		<%@include file="/WEB-INF/views/modules/home/photo_wall/photo_wall.jsp"%></div>
	<!-- 主体内容部分 -->
	<div id="index_content">
		<!-- 限时优惠 -->
		<div id="index_content_1">
			<%@include file="/WEB-INF/views/modules/home/content/xsyh.jsp"%></div>
		<div id="index_content_2">
			<%@include file="/WEB-INF/views/modules/home/content/zbss.jsp"%></div>
		<div id="index_content_3">
			<%@include file="/WEB-INF/views/modules/home/content/cyhw.jsp"%></div>
		<div id="index_content_4">
			<%@include file="/WEB-INF/views/modules/home/content/ztdj.jsp"%></div>
		<div id="index_content_5">
			<%@include file="/WEB-INF/views/modules/home/content/kzxx.jsp"%></div>
		<div id="index_content_6">
			<%@include file="/WEB-INF/views/modules/home/content/cxzn.jsp"%></div>
	</div>
	<!-- 底部部分 -->
	<div id="index_footer">
		<%@include file="/WEB-INF/views/modules/home/footer/footer.jsp"%>
	</div>
</body>
<script type="text/javascript" src="<%=jsPath%>modules/common/lt.js"></script>
<script type="text/javascript" src="<%=jsPath%>common/requirejs_2.1.11.js"
	data-main="<%=jsPath%>modules/index/main.js"></script>
</html>
