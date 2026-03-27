<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DEPT Detail Page</h1>
	
	<h4>${detail.departmentId}</h4>
	<h4>${detail.departmentName}</h4>
	<h4>${detail.managerId}</h4>
	<h4>${detail.locationId}</h4>
	<a href="/dept/update?departmentId=${detail.departmentId}">수정</a>
	<a href="/dept/delete?departmentId=${detail.departmentId}">삭제</a>
	<form action="/dept/delete" method="get">
		<input type="hidden" name="departmentId" readonly value="${detail.departmentId}">
		<button>DELETE</button>
	</form>
</body>
</html>