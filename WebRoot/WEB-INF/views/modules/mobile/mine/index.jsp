<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>mine/index.css">
</head>
<body>
	<div class="top width img-line">
		<img src="<%=mImg%>/mine/bk.png" class="width bk">
		<div class="head">
			<a href="<%=basePath %>login" class="highlight-none">
				<img src="<%=mImg%>/mine/human.png" class="img">
			</a>
			<p>点击登录，体验更多精彩</p>
		</div>
	</div>
	<div class="column">
		<ul class="nav">
			<li class="line-bottom">
				<a href="##" class="order a-bk">我的订单</a>
			</li>
			<li class="line-bottom">
				<a href="##" class="like a-bk">我的收藏</a>
			</li>
			<li class="line-bottom">
				<a href="##" class="photo a-bk">我的相册</a>
			</li>
			<li class="line-bottom">
				<a href="##" class="safety a-bk">账户安全</a>
			</li>
		</ul>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>