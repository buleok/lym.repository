<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>userinfo</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
</head>
<body>
	<form action="#" id="searchForm">
		<input type="text" name="userName" />
		<input type="text" name="password" />
	</form>
	<input type="button" name="" value="查询" id="search" />
	<div id="list"></div>
	
</body>
<script type="text/javascript">
	$(function() {

		$('#search').click(function() {
			$.ajax({
				url : "${pageContext.request.contextPath}/user/list",
				data : $("#searchForm").serialize(),
				type : 'POST',
				dataType : 'html',
				success : function(XMLHttpRequest, textStatus) {
					$("#list").html(XMLHttpRequest);
				},
			})
		});

	})
</script>
</html>