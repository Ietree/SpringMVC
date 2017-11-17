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
	<img alt="pic1" src="images/1.jpg">
	<img alt="pic2" src="images/2.jpg">
	<img alt="pic3" src="images/3.jpg">
</body>
</html>