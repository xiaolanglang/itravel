<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/tags.jsp"%>
<c:forEach var="tourism" items="${tourismList }">
	<div class="width info">
		<a href="../order/index.html">
			<div class="title">
				<span class="h">${tourism.title }<br> &nbsp; <small>${tourism.title }</small>
				</span>
			</div>
			<div class="info-round">
				<div class="info-msg">
					<p>立省${tourism.adultPrice * discount }</p>
					<p class="middle"></p>
					<p class="strong">￥${tourism.adultPrice }</p>
					<p class="decoration">￥${tourism.adultOriginalPrice }</p>
				</div>
				<img src="../../../img/index/round.png" alt="" class="width">
			</div>
			<div class=" product-info">
				<div class="product-extra">
					<span class="icon icon-team"></span> <span>跟团</span> <span class="separator">|</span> <span>上海出发</span>
				</div>
				<img src="../../../img/index/cache/list1.png" class="width">
			</div>
		</a>
	</div>
</c:forEach>