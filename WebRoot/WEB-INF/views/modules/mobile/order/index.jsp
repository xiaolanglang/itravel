<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>商品详情</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>order/index.css">
</head>
<body>
	<div class="top width img-line">
		<img src="${tourismImg.url }" class="width"></div>
	<div class="title width">
		<p class="top">全国多地直飞三亚5天4晚自由行(入住五星级酒店)</p>
		<p class="bottom">
			<span class="bottom-right">
				<span class="product-price">
					<span class="price"><fmt:formatNumber type="number" value="${tourismImg.tourism.adultPrice*(tourismImg.tourism.discount/10) }"
							maxFractionDigits="0" /></span>
					元起
				</span>
			</span>
		</p>
	</div>
	<div class="product-info width">
		<div id="column-1" class="column width">
			<div class="left"></div>
			<div class="right strong">产品信息</div>
		</div>
		<div id="column-1-msg" class="column-msg width line-top">
			<p>1、豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店</p>
			<p>2、豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店</p>
			<p>3、豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店</p>
			<p>4、豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店</p>
			<p>5、豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店豪华酒店</p>
		</div>
		<div class="column width">
			<div class="left"></div>
			<div class="right strong">退款说明</div>
		</div>
		<div class="column width">
			<div class="left"></div>
			<div class="right strong">交通信息</div>
		</div>
		<div class="column width">
			<div class="left"></div>
			<div class="right strong">酒店信息</div>
		</div>
	</div>
	<div class="order-bottom width">
		<div class="col-7 pre-order"></div>
		<a href="<%=basePath %>order/second" class="col-3 order text-middle">
				<p class="text-content">立即预定</p>
		</a>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>