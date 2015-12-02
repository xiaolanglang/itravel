<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/tags.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Love Travel</title>
	<%@include file="/WEB-INF/views/include/header.jsp"%>
	<!-- commonCss -->
	<link rel="stylesheet"type="text/css"href="<%=cssPath %>modules/sale/myjquery.slides.css">
	<!-- pageCss -->
	<link rel="stylesheet" type="text/css" href="<%=cssPath %>modules/sale/sale.css">
</head>
<body>
	<!-- 导入头部元素 -->
	<div id="sale_top">
		<%@include file="/WEB-INF/views/modules/home/top/top.jsp"%>
	</div>
	<!-- 导入column -->
	<div id="sale_column">
		<%@include file="/WEB-INF/views/modules/home/column/column.jsp"%>
	</div>
	
	<div class="reservations sale_container">
		<div class="col-6">
			<!-- 导入图片墙 -->
			<div id="sale_photo_wall">
				<%@include file="/WEB-INF/views/modules/sale/photo_wall/photo_wall.jsp"%>
			</div>
			<!-- 导入日期选择 -->
			<div id="sale_date">
				<%@include file="/WEB-INF/views/modules/sale/date/date.jsp"%>
			</div>
		</div>
		<div class="col-6">
			<!-- 导入订购信息 -->
			<div id="sale_order">
				<%@include file="/WEB-INF/views/modules/sale/order/order.jsp"%>
			</div>
		</div>
	</div>
	<div class="more">
		<p>更多内容敬请期待........</p>
	</div>
	<!-- 底部部分 -->
	<div id="sale_footer">
		<%@include file="/WEB-INF/views/modules/home/footer/footer.jsp"%>
	</div>
</body>
	<script type="text/javascript" src="<%=jsPath%>modules/common/lt.js"></script>
	<script type="text/javascript" src="<%=jsPath %>common/requirejs_2.1.11.js"
	data-main="<%=jsPath %>modules/sale/main.js"></script>
</html>