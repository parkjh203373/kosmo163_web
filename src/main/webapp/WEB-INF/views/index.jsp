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
		<a href="/comm/list">전달 사항 리스트</a>
		
		<c:if test="${empty dto}">
			<a href="/member/login">로그인</a>
			<a href="/member/join">회원가입</a>
		</c:if>
		
		<c:if test="${not empty dto}">
			<a href="/member/logout">로그아웃</a>
			<a href="/member/mypage">Mypage</a>
		</c:if>
	</body>
</html>