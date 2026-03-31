<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Index Page JH</h1>
		<a href="/dept/list">부서관리</a>
		<a href="/country/list">나라관리</a>
		
		<c:if test="${empty dto}">
			<a href="/emp/login">로그인</a>
		</c:if>
		<c:if test="${not empty dto}">
			<a href="/emp/logout">로그아웃</a>
		</c:if>
	</body>
</html>