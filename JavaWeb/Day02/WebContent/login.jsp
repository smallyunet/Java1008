<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录</title>
	<link rel="stylesheet" type="text/css" href="./resources/layui/css/layui.css"/>
</head>
	<body>
		<form class="layui-form" action="LoginServlet" method="get">
			<div class="layui-form-item">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-inline">
					<input class="layui-input" type="text" name="username" requierd placeholder="请输入用户名">
				</div>
				<span class="layui-form-mid" style="color:red">*</span>
			</div>
			<div class="layui-form-item">
				<label for="" class="layui-form-label">密码</label>
				<div class="layui-input-inline">
					<input class="layui-input" type="password" name="password">
				</div>
				<span class="layui-form-mid" style="color:red">*</span>
			</div>
			<div class="layui-nav-item">
				<div class="layui-input-block">
					<button class="layui-btn">登录</button>
				</div>
			</div>
		</form>
		<script src="./resources/layui/layui.js"></script>
	</body>
</html>