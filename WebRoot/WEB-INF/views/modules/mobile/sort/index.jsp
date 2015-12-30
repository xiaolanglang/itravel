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
		<img src="<%=mImg%>/sort/cache/top.png" class="width">
		<form action="" class="form">
			<input type="text" class="search form-control input-border-none" placeholder="搜索目的地、国家、城市">
		</form>
	</div>
	<div class="column width">
		<div class="column-left col-2">
			<ul class="nav">
				<li class="active"><a href="##">热门</a></li>
				<li><a href="##">海岛</a></li>
				<li><a href="##" class="a-bk">国内</a></li>
				<li><a href="##" class="a-bk">亚洲</a></li>
				<li><a href="##" class="a-bk">欧洲</a></li>
				<li><a href="##" class="a-bk">非洲</a></li>
				<li><a href="##" class="a-bk">大洋洲</a></li>
				<li><a href="##" class="a-bk">北美洲</a></li>
				<li><a href="##" class="a-bk">南美洲</a></li>
				<li><a href="##" class="a-bk">南极洲</a></li>
			</ul>
		</div>
		<div class="column-right col-8">
			<div class="width right-img">
				<a href="<%=basePath %>sort/second">
					<img src="<%=mImg%>/sort/cache/dj.png">
					<div class="msg1"><p class="text"><span class="strong">东京</span><br>Japan</p></div>
					<img src="<%=mImg%>/sort/cache/xg.png">
					<div class="msg2"><p class="text"><span class="strong">香港</span><br>HongKong</p></div>
				</a>
			</div>
			<div class="width right-img">
				<a href="<%=basePath %>sort/second">
					<img src="<%=mImg%>/sort/cache/dj.png">
					<div class="msg1"><p class="text"><span class="strong">东京</span><br>Japan</p></div>
					<img src="<%=mImg%>/sort/cache/xg.png">
					<div class="msg2"><p class="text"><span class="strong">香港</span><br>HongKong</p></div>
				</a>
			</div>
			<div class="width right-img">
				<a href="<%=basePath %>sort/second">
					<img src="<%=mImg%>/sort/cache/dj.png">
					<div class="msg1"><p class="text"><span class="strong">东京</span><br>Japan</p></div>
					<img src="<%=mImg%>/sort/cache/xg.png">
					<div class="msg2"><p class="text"><span class="strong">香港</span><br>HongKong</p></div>
				</a>
			</div>
			<div class="width right-img">
				<a href="<%=basePath %>sort/second">
					<img src="<%=mImg%>/sort/cache/dj.png">
					<div class="msg1"><p class="text"><span class="strong">东京</span><br>Japan</p></div>
					<img src="<%=mImg%>/sort/cache/xg.png">
					<div class="msg2"><p class="text"><span class="strong">香港</span><br>HongKong</p></div>
				</a>
			</div>
		</div>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>