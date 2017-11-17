<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- base标签会自动在当前页面的不以斜杠开头的路径前加上basePath路径，使其变为绝对路径 -->
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index</title>
</head>
<body>
	<!-- 
	这个路径出现在jsp页面，所以是前台路径。
	前台路径的参照路径是：当前web服务器的根，即http://127.0.0.1:8080
	因为 绝对路径 = 参照路径 + 相对路径，所以当前超链接所提交的请求绝对路径是：
	http://localhost:8080/welcome
	<a href="/welcome.html">跳转到欢迎页面</a>
	 -->
	<!-- 
	<a href="welcome.html">跳转到欢迎页面</a>
	这个路径没有以斜杠开头，所以其参照路径是当前的访问路径： http://localhost:8080/springmvc/
	因为 绝对路径 = 参照路径 + 相对路径，所以当前超链接所提交的请求绝对路径是：
	http://localhost:8080/springmvc/welcome.html
	 -->
	<a href="welcome.html">跳转到欢迎页面</a>
</body>
</html>