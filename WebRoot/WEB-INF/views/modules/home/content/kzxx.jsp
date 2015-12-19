<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="inn-to-rest content-msg">
	<div class="content-title title-1">
		<div class="title col-4">
			<h1>
				客栈休息
				<span class="exp">每日必看的特价精选</span>
			</h1>
		</div>
		<div class="content-column col-8">
			<ul class="nav navbar-nav col-10">
				<li>
					<a href="##" class="selected">一日游</a>
				</li>
				<li>
					<a href="##">景点门票</a>
				</li>
				<li>
					<a href="##">马尔代夫</a>
				</li>
				<li>
					<a href="##">美国</a>
				</li>
				<li>
					<a href="##">泰国</a>
				</li>
			</ul>
			<div class="more col-2">
				<a href="##">更多产品&nbsp;&gt;</a>
			</div>
		</div>
	</div>
	<div class="content-info row" id="content_info_kzxx">
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
	</div>
</div>