<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Document</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>find/index.css">
</head>
<body>
	<div class="title width">发现<span>·</span>本周精选</div>
	<div class="width column img-line">
		<a href="<%=basePath %>search">
			<img src="<%=mImg%>/find/cache/hotel1.png" class="width">
			<div class="product-msg">
				<p>
					<span class="span-line strong">|</span>
					<span class="span strong">本地推荐</span>
					<span class="span-line strong">|</span>
				</p>
				<p>本周精选，吃喝玩乐</p>
			</div>
			<div class="product-position">
				<span>南京</span>
			</div>
		</a>
	</div>
	<div class="width" style="margin-top: 5px;"></div>
	<div class="width column img-line">
		<a href="<%=basePath %>search">
			<img src="<%=mImg%>/find/cache/hotel2.png" class="width">
			<div class="product-msg">
				<p>
					<span class="span-line strong">|</span>
					<span class="span strong">特惠酒店</span>
					<span class="span-line strong">|</span>
				</p>
				<p>精选高星低价酒店</p>
			</div>
			<div class="product-position">
				<span>南京</span>
			</div>
		</a>
	</div>
	<div class="width" style="margin-top: 5px;"></div>
	<div class="width column img-line">
		<a href="<%=basePath %>search">
			<img src="<%=mImg%>/find/cache/hotel3.png" class="width">
			<div class="product-msg">
				<p>
					<span class="span-line strong">|</span>
					<span class="span strong">周末狂欢</span>
					<span class="span-line strong">|</span>
				</p>
				<p>要玩就玩，玩到持久</p>
			</div>
			<div class="product-position">
				<span>南京</span>
			</div>
		</a>
	</div>
	<div class="width" style="margin-top: 5px;"></div>
	<div class="width column img-line">
		<a href="<%=basePath %>search">
			<img src="<%=mImg%>/find/cache/hotel4.png" class="width">
			<div class="product-msg">
				<p>
					<span class="span-line strong">|</span>
					<span class="span strong">周末狂欢</span>
					<span class="span-line strong">|</span>
				</p>
				<p>要玩就玩，玩到持久</p>
			</div>
			<div class="product-position">
				<span>南京</span>
			</div>
		</a>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>