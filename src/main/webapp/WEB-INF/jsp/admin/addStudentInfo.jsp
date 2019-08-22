<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Add Student Info</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/css/home.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/css/table.css"
	rel="stylesheet">

<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="container">
		<div class="row clearfix top">
			<div class="col-md-12 column">
				<h3 class="text-center">
					<strong>学生信息管理系统</strong>
				</h3>
			</div>
		</div>
		<div class="row clearfix date">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-8 column">
						<p>
							<script type="text/javascript">
								var date = new Date();
								document.write(date.getFullYear() + "年"
										+ (date.getMonth() + 1) + "月"
										+ date.getDate() + "日" + " 星期"
										+ "日一二三四五六".charAt(date.getDay()));
							</script>
						</p>
					</div>
					<div class="col-md-4 column text-right">
						<button type="button" class="btn btn-default" onclick="logout()">退出系统</button>
					</div>
				</div>
			</div>
		</div>
		<div class="row clearfix" style="height: 140vh;">
			<div class="col-md-2 column left" style="height: 140vh;">
				<ul class="nav nav-stacked nav-pills">
					<li><a href="../studentInfo/list">学生信息</a></li>
					<li><a href="../auditList/list">信息审核</a></li>
					<li class="active"><a href="../studentAccount/list">学生账号</a></li>
				</ul>
			</div>
			<div class="col-md-10 column right"
				style="padding-left: 0; padding-right: 0; margin-top: 20px;">
				<div class="row clearfix">
					<div class="col-md-2 column"></div>
					<form name="Form1" class="col-md-8"
						action="${pageContext.request.contextPath}/studentInfo/add"
						method="post">
						<table class="table table-hover">
							<tbody>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">学号</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="no" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">姓名</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="name" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">性别</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="sex" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">年级</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="grade" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">学院</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="college" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">专业</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="major" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">班级</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="class_" value=""></td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">身份证号</td>
									<td align="center" width="12%"><input type="text"
										class="form-control" name="id" value=""></td>
								</tr>


								<tr>
									<td colspan="2"><input type="submit"
										class="col-md-4 btn btn-default btn-sm" value="确定"> <input
										type="reset" class="col-md-4 btn btn-default btn-sm"
										value="重置"> <input type="button"
										class="col-md-4 btn btn-default btn-sm"
										onclick="history.go(-1)" value="返回" /></td>
								</tr>
							</tbody>
						</table>
					</form>
					<div class="col-md-2 column"></div>
				</div>
			</div>
		</div>
		<div class="row clearfix bottom">
			<div class="col-md-12 column">
				<p class="text-center">
					<strong>学生信息管理系统</strong>
				</p>
			</div>
		</div>
	</div>

	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/logout.js"></script>
</body>
</html>