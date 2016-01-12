<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>都市生活</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>sort/second.css">
</head>
<body>
	<div class="column width">
		<div class="title width">
			<p class="msg strong">热门地点</p>
		</div>
		<c:forEach items="${page.list }" var="tourismImg" varStatus="status">
			<c:if test="${status.index % 2 == 0 }">
				<div class="width img">
			</c:if>
			<a href="<%=basePath%>order?id=${tourismImg.tourism.id}">
				<div class="col-5 column-img-left img-line">
					<img class="width" src="${tourismImg.url}">
					<div class="msg width overflow-2">${tourismImg.tourism.subtitle}</div>
					<div class="line-top"></div>
					<div class="msg-bottom">
						<span class="decoration">￥<fmt:formatNumber type="number" value="${tourismImg.tourism.adultPrice}"
							maxFractionDigits="0" /></span>
						<span class="red"><fmt:formatNumber type="number" value="${tourismImg.tourism.adultPrice*(tourismImg.tourism.discount/10) }"
							maxFractionDigits="0" /></span>
						<span class="yuan">元</span>
					</div>
				</div>
			</a>
			<c:if test="${status.index % 2 == 1 }">
				</div>
			</c:if>
			<c:if test="${status.last && status.index % 2 == 0}">
				</div>
			</c:if>
		</c:forEach>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>