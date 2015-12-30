<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE jsp>
<html lang="en">
<head>
	<title>主页</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>index/index.css">
</head>
<body>
	<div class="top-img img-line">
		<img src="<%=mImg%>index/cache/1.png" ></div>
	<div class="column">
		<div class="subcolumn group-justified width">
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_group.png">
					<span class="text-response width">跟团游</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_drive.png">
					<span class="text-response width">自驾游</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_ship.png">
					<span class="text-response width">游轮</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_self_service.png">
					<span class="text-response width">自助游</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_ticket.png">
					<span class="text-response width">门票</span>
				</a>
			</div>
		</div>
		<div class="subcolumn group-justified">
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_hotel.png">
					<span class="text-response width">酒店</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_visa.png">
					<span class="text-response width">签证</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/ic_product_type_jipiao.png">
					<span class="text-response width">飞机票</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_train_ticket.png">
					<span class="text-response width">火车票</span>
				</a>
			</div>
			<div class="justified">
				<a href="<%=basePath %>search">
					<img src="<%=mImg%>index/icon_home_finance.png">
					<span class="text-response width">理财</span>
				</a>
			</div>
		</div>
	</div>
	<div class="guanggao group-justified line-top img-line">
		<div class="line-right justified">
			<a href="<%=basePath %>search">
				<img src="<%=mImg%>index/cache/column-top1.png"></a>
		</div>
		<div class="line-right justified">
			<a href="<%=basePath %>search">
				<img src="<%=mImg%>index/cache/column-top2.png"></a>
		</div>
		<div class="line-right justified">
			<a href="<%=basePath %>search">
				<img src="<%=mImg%>index/cache/column-top3.png"></a>
		</div>
	</div>
	<div class="width line-top"></div>
	<div class="width info">
		<a href="<%=basePath %>order">
			<div class="title">
				<span class="h">
					海南梦幻级度假，畅享海上风情
					<br>
					&nbsp;
					<small>【群岛】海滨国际度假酒店</small>
				</span>
			</div>
			<div class="info-round" >
				<div class="info-msg">
					<p>立省￥1000</p>
					<p class="middle"></p>
					<p class="strong">￥13000</p>
					<p class="decoration">￥14000</p>
				</div>
				<img src="<%=mImg%>index/round.png" alt="" class="width"></div>
			<div class=" product-info">
				<div class="product-extra">
					<span class="icon icon-team"></span>
					<span>跟团</span>
					<span class="separator">|</span>
					<span>上海出发</span>
				</div>
				<img src="<%=mImg%>index/cache/list1.png" class="width"></div>
		</a>
	</div>
	<div class="width info">
		<a href="<%=basePath %>order">
			<div class="title">
				<span class="h">
					海南梦幻级度假，畅享海上风情
					<br>
					&nbsp;
					<small>【群岛】海滨国际度假酒店</small>
				</span>
			</div>
			<div class="info-round" >
				<div class="info-msg">
					<p>立省￥1000</p>
					<p class="middle"></p>
					<p class="strong">￥13000</p>
					<p class="decoration">￥14000</p>
				</div>
				<img src="<%=mImg%>index/round.png" alt="" class="width"></div>
			<div class=" product-info">
				<div class="product-extra">
					<span class="icon icon-team"></span>
					<span>跟团</span>
					<span class="separator">|</span>
					<span>上海出发</span>
				</div>
				<img src="<%=mImg%>index/cache/list1.png" class="width"></div>
		</a>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>