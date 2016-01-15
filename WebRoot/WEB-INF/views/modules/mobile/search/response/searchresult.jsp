<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
{
"content":
'
<c:forEach items="${page.list }" var="tourismImg">
	<a href="<%=basePath %>order?id=${tourismImg.tourism.id}" class="a-bk">
		<div class="column width">
			<img data-original="${tourismImg.url}" class="col-3 imglazy">
			<div class="msg">
				<div class="msg-top overflow-2">${tourismImg.tourism.subtitle}</div>
				<div class="msg-middle">
					<div>手机专享</div>
					<div>热门</div>
				</div>
				<div class="msg-bottom">月销32笔</div>
				<div class="msg-price strong">
					￥
					<fmt:formatNumber type="number"
						value="${tourismImg.tourism.adultPrice*(tourismImg.tourism.discount/10) }"
						maxFractionDigits="0" />
				</div>
			</div>
		</div>
	</a>
	<div class="line-top"></div>
</c:forEach>
',
"page":{"pageNum":"${page.pages}","pages":"${page.pageNum}"}
}