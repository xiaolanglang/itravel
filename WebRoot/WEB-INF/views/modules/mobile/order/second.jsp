<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>订购</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>order/second.css">
</head>
<body>
	<div class="top text-middle">
		<p class="text-content">
			<span class="arrow glyphicon glyphicon-chevron-left"></span>
			<span class="month">2015年12月</span>
			<span class="arrow glyphicon glyphicon-chevron-right"></span>
		</p>
	</div>
	<div class="content">
		<table class="table table-border2 table-condensed date">
			<tr>
				<th><div><p>日</p></div></th>
				<th><div><p>一</p></div></th>
				<th><div><p>二</p></div></th>
				<th><div><p>三</p></div></th>
				<th><div><p>四</p></div></th>
				<th><div><p>五</p></div></th>
				<th><div><p>六</p></div></th>
			</tr>
			<tr>
				<td><div><p></p></div></td>
				<td><div><p></p></div></td>
				<td><div><p>1</p></div></td>
				<td><div><p>2</p></div></td>
				<td><div><p>3</p></div></td>
				<td><div><p>4</p></div></td>
				<td><div><p>5</p></div></td>
			</tr>
			<tr>
				<td><div><p></p></div>
					<p></p>
				</td>
				<td><div class="enable"><p>7</p><p class="price">￥123</p></div></td>
				<td><div><p>8</p></div></td>
				<td><div><p>9</p></div></td>
				<td><div><p>10</p></div></td>
				<td><div><p>11</p></div></td>
				<td><div><p>12</p></div></td>
			</tr>
			<tr>
				<td><div><p>13</p></div></td>
				<td><div><p>14</p></div></td>
				<td><div><p>15</p></div></td>
				<td><div class="enable"><p>16</p><p class="price">￥123</p></div></td>
				<td><div><p>17</p></div></td>
				<td><div class="enable"><p>18</p><p class="price">￥123</p></div></td>
				<td><div><p>19</p></div></td>
			</tr>
			<tr>
				<td><div><p>20</p></div></td>
				<td><div><p>21</p></div></td>
				<td><div><p>22</p></div></td>
				<td><div><p>23</p></div></td>
				<td><div><p>24</p></div></td>
				<td><div><p>25</p></div></td>
				<td><div class="enable"><p>26</p><p class="price">￥123</p></div></td>
			</tr>
			<tr>
				<td><div><p>27</p></div></td>
				<td><div><p>28</p></div></td>
				<td class="select"><div class="enable"><p>29</p><p class="price">￥123</p></div></td>
				<td><div><p>30</p></div></td>
				<td><div><p>31</p></div></td>
				<td><div><p></p></div></td>
				<td><div><p></p></div></td>
			</tr>
		</table>
	</div>
	<div class="line-top" style="margin-top: 20px;"></div>
	<div class="column width line-bottom">
		<div class="width man">
			<p class="sort col-5">成人票</p>
			<div class="control">
				<div class="change disabled">-</div>
				<div class="col-3 num text-middle"><p class="text-content">0</p></div>
				<div class="change">+</div>
			</div>
		</div>
	</div>
	<div class="column width line-bottom">
		<div class="width man">
			<p class="sort col-5">儿童票</p>
			<div class="control">
				<div class="change">-</div>
				<div class="col-3 num text-middle"><p class="text-content">0</p></div>
				<div class="change">+</div>
			</div>
		</div>
	</div>
	<div class="order-bottom width">
		<div class="col-7 pre-order">
			<div class="text-middle">
				<p class="text-content">
					<span class="total">合计：</span>
					<span class="price">￥123</span>
				</p>
			</div>
		</div>
		<a href="javascript:void(0)" class="col-3 order text-middle">
			<p class="text-content">确认支付</p>
		</a>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>