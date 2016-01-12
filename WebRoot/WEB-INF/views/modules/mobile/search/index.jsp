<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>搜索</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>search/index.css">
</head>
<body>
	<div class="search width">
		<form action="<%=basePath %>search" class="form form-search col-7" method="post">
			<a href="<%=basePath %>search/position">
				<div class="col-3 position text-middle">
					<p class="text-content">
						<span class="position">南京</span>
					</p>
				</div>
			</a>
			<div class="col-7 line-left search-line-left">
				<input type="text" placeholder="目的地\关键词" class="form-control input-border-none" name="content" value="${requestScope.content }">
				<span class="glyphicon glyphicon-search"></span>
			</div>
		</form>
	</div>
	<c:forEach items="${page.list }" var="tourismImg">
		<a href="<%=basePath %>order?id=${tourismImg.tourism.id}" class="a-bk">
			<div class="column width">
				<img src="${tourismImg.url}" class="col-3">
				<div class="msg">
					<div class="msg-top overflow-2">${tourismImg.tourism.subtitle}</div>
					<div class="msg-middle">
						<div>手机专享</div>
						<div>热门</div>
					</div>
					<div class="msg-bottom">月销32笔</div>
					<div class="msg-price strong">￥<fmt:formatNumber type="number" value="${tourismImg.tourism.adultPrice*(tourismImg.tourism.discount/10) }"
							maxFractionDigits="0" /></div>
				</div>
			</div>
		</a>
		<div class="line-top"></div>
	</c:forEach>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>