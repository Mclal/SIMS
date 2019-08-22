<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">

<title>登录页面</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/bootstrap/css/login.css"
	rel="stylesheet">


</head>

<body>

	<div class="container">

		<form class="form-signin"
			action="${pageContext.request.contextPath}/login/login" method="post">
			<h2 class="form-signin-heading text-center">学生信息管理系统</h2>
			<label for="inputAccount" class="sr-only">账号</label> <input
				type="text" id="inputAccount" name="account" class="form-control"
				placeholder="账号" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" name="password"
				class="form-control" placeholder="密码" required>
			<div class="radio">
				<label class="col-md-2"></label> <label class="col-md-4 text-left"><input
					type="radio" name="Radio" value="admin" />管理员 </label> <label
					class="col-md-4 text-right"><input type="radio"
					name="Radio" value="student" checked="checked" />学生</label> <label
					class="col-md-2"></label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>

	</div>
	<!-- /container -->
	<div class="alert alert-danger text-center" role="alert">${message!=null ? message : "请登录系统" }</div>


	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
