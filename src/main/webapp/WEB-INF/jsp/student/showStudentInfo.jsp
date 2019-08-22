<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Show Student Info</title>

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
					<li class="active"><a href="../studentInfo/show">基本信息</a></li>
					<li><a href="../auditList/addForm">修改信息</a></li>
				</ul>
			</div>
			<div class="col-md-10 column right"
				style="padding-left: 0; padding-right: 0; margin-top: 20px;">
				<div class="row clearfix">
					<div class="col-md-2 column"></div>
					<div class="col-md-8">
						<table class="table table-hover"
							style="border-right: 1px solid #ddd; border-bottom: 1px solid #ddd;">
							<tbody>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">学号</td>
									<td align="center" width="12%">${n.no }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">姓名</td>
									<td align="center" width="12%">${n.name }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">性别</td>
									<td align="center" width="12%">${n.sex }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">年级</td>
									<td align="center" width="12%">${n.grade }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">学院</td>
									<td align="center" width="12%">${n.college }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">专业</td>
									<td align="center" width="12%">${n.major }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">班级</td>
									<td align="center" width="12%">${n.class_ }</td>
								</tr>
								<tr>
									<td align="center" width="8%" class="table-left"
										style="vertical-align: middle;">身份证号</td>
									<td align="center" width="12%">${n.id }</td>
								</tr>


							</tbody>
						</table>
					</div>
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