<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Student Info List</title>

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
		<div class="row clearfix">
			<div class="col-md-2 column left">
				<ul class="nav nav-stacked nav-pills">
					<li class="active"><a href="../studentInfo/list">学生信息</a></li>
					<li><a href="../auditList/list">信息审核</a></li>
					<li><a href="../studentAccount/list">学生账号</a></li>
				</ul>
			</div>
			<div class="col-md-10 column right">
				<div style="padding-top: 12px;">
					<a class="btn btn-default"
						href="${pageContext.request.contextPath}/studentInfo/addForm">添加</a>
				</div>
				<div class="row clearfix">
					<div class="col-md-2 column"></div>
					<table class="col-md-8 table table-striped">
						<thead>
							<tr>
								<th style="text-align: center;">学号</th>
								<th style="text-align: center;">姓名</th>
								<th style="text-align: center;">性别</th>
								<th style="text-align: center;">年级</th>
								<th style="text-align: center;">学院</th>
								<th style="text-align: center;">专业</th>
								<th style="text-align: center;">班级</th>
								<th style="text-align: center;">身份证号</th>
								<th style="text-align: center;">编辑</th>
								<th style="text-align: center;">删除</th>
							</tr>
						</thead>
						<tbody align="center">
							<c:forEach items="${SIs }" var="n">
								<tr>
									<td>${n.no }</td>
									<td>${n.name }</td>
									<td>${n.sex }</td>
									<td>${n.grade }</td>
									<td>${n.college }</td>
									<td>${n.major }</td>
									<td>${n.class_ }</td>
									<td>${n.id }</td>
									<td><a
										href="${pageContext.request.contextPath}/studentInfo/findByNo?no=${n.no}">edit</a></td>
									<td><a
										href="${pageContext.request.contextPath}/studentInfo/delete?no=${n.no}">delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
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