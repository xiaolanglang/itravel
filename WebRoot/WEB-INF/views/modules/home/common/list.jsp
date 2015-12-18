<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="info-list">
	<ul id="da-thumbs" class="da-thumbs">
		<c:forEach items="${tourismList }" var="tourism">
			<li>
				<a href="<%=basePath%>sale/123?id=${tourism.id}">
					<img data-original="<%=imgPath %>info_list/1.jpg" src="<%=imgPath %>jquery.imglazyload/loading.gif" class="photo_show imglazy" alt="图片大小300*200"/>
					<div>
						<span class="mask">Beautiful Scenery<br>Team:&nbsp;￥${tourism.adultPrice }&nbsp;For&nbsp;${tourism.days}&nbsp;Day</span>
					</div>
					<span class="discount-bg"></span>
					<span class="discount">${tourism.discount }折</span>
					<span class="new"></span>
					<span class="infos">
						<span class="price col-4">${tourism.adultPrice }元</span>
						<span class="msg col-8">${tourism.title }</span>
					</span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>