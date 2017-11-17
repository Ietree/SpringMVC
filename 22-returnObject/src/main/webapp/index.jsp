<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index</title>
	<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<script type="text/javascript">
		$(function(){
			$("button").click(function(){
				$.ajax({
					url:"test/myAjax.do",
					data:{
						name:"张三",
						age:23
					},
					success:function(data){
						alert(data);
					}
				});
			});
		});
	</script>
</head>
<body>
	<button>提交AJAX请求</button>
</body>
</html>