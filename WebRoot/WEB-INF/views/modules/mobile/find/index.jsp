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
	<c:forEach items="${findList}" var="find">
		<div class="width column img-line">
			<a href="<%=basePath %>search?content=${find.title }">
				<img data-original="${find.image }" class="width imglazy" src="<%=mImg%>find/product.png">
				<div class="product-msg">
					<p>
						<span class="span-line strong">|</span>
						<span class="span strong">${find.title }</span>
						<span class="span-line strong">|</span>
					</p>
					<p>${find.subTitle }</p>
				</div>
				<div class="product-position">
					<span>南京</span>
				</div>
			</a>
		</div>
		<div class="width" style="margin-top: 5px;"></div>
	</c:forEach>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>