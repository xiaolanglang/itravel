<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/taglibs.jsp"%>
<c:forEach var="tourismImg" items="${tourismImgList }">
	<div class="width info">
		<a href="<%=basePath %>order?id=${tourismImg.tourism.id }">
			<div class="title">
				<span class="h">${tourismImg.tourism.title }<br> &nbsp; <small>${tourismImg.tourism.title }</small>
				</span>
			</div>
			<div class="info-round">
				<div class="info-msg">
					<p>
						立省
						<fmt:formatNumber type="number"
							value="${tourismImg.tourism.adultPrice * (1-tourismImg.tourism.discount/10) }"
							maxFractionDigits="0" />
					</p>
					<p class="middle"></p>
					<p class="strong">
						￥
						<fmt:formatNumber type="number"
							value="${tourismImg.tourism.adultPrice * (tourismImg.tourism.discount/10) }"
							maxFractionDigits="0" />
					</p>
					<p class="decoration">￥ ${tourismImg.tourism.adultPrice }</p>
				</div>
				<img src="<%=mImg%>index/round.png" alt="" class="width">
			</div>
			<div class=" product-info">
				<img src="<%=mImg%>index/product.png" data-original="${tourismImg.url }" class="width imglazy">
			</div>
		</a>
	</div>
</c:forEach>