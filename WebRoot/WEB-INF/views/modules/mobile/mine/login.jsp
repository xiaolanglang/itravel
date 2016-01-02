<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/mobile/tags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>用户登录</title>
	<%@include file="/WEB-INF/views/include/mobile/header.jsp"%>
	<link rel="stylesheet" type="text/css" href="<%=mCss %>mine/login.css">
</head>
<body>
	<div class="contain width">
		<div class="select width">
			<div class="width zhanghao selected col-5">帐号登录</div>
			<div class="col-5 dongtai">动态密码登录</div>
		</div>
		<div class="form">
			<form action="<%=basePath %>login" method="post">
				<div class="form-bk">
					<div class="form-group row">
						<input type="text" class="form-control input-border-none" placeholder="用户名">
						<span class="glyphicon glyphicon-user icon"></span>
					</div>
					<div class="line-top width"></div>
					<div class="form-group row">
						<input type="password" class="form-control input-border-none" placeholder="密码">
						<span class="icon-lock icon"></span>
					</div>
				</div>
				<div class="form-group row">
					<a href="##" class="find">找回密码</a>
				</div>
				<div class="form-group row">
					<input type="submit" class="form-control input-border-none" value="登录">
				</div>
				<div class="form-group row">
					<input type="button" class="form-control input-border-none add" value="注册新用户">
				</div>
			</form>
		</div>
	</div>
</body>
	<%@include file="/WEB-INF/views/include/mobile/js.jsp"%>
</html>