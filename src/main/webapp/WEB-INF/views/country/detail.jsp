<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>COUNTRY Detail Page</h1>
	
	<h4>${detail.countryId}</h4>
	<h4>${detail.countryName}</h4>
	<a href="/country/delete?countryId=${detail.countryId}">삭제</a>
	<form action="/country/delete" method="get">
		<input type="hidden" name="countryId" readonly value="${detail.countryId}">
		<button>DELETE</button>
	</form>
</body>
</html>