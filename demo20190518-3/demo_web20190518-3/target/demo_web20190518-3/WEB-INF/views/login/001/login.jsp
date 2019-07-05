<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
</head>
<body>
	<form action="#" id="loginForm">
		<input type="text" name="userName" /> <input type="password"
			name="password" />
	</form>
	<input type="button" name="" value="登录" id="login" />
</body>
<script type="text/javascript">
	$(function() {

		$('#login').click(function() {
			$.ajax({
				url : "${pageContext.request.contextPath}/dologin",
				data : $("#loginForm").serialize(),
				type : 'POST',
				dataType : 'html',
				success : function(XMLHttpRequest, textStatus) {
					console.log(XMLHttpRequest);
				},
			})
		});

	})
</script>
</html>