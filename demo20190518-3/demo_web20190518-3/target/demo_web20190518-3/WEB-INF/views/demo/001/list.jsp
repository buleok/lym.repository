<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
	<thead>
	<tr>
		<td>姓名</td><td>密码</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="userinfo" items="${list}"  >
	<tr>
		<td>${userinfo.userName}</td><td>${userinfo.password}</td>
	</tr>

    </c:forEach>
	</tbody>
</table>
