<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>나라 등록 페이지</h1>
		
		<form action="/country/create" method="post">
			<div>
				<label>나라 아이디</label>
				<input type="text" name="countryId">
			</div>
			<div>
				<label>나라 이름</label>
				<input type="text" name="countryName">
			</div>
			<div>
				<label>지역 코드</label>
				<input type="text" name="regionId">
			</div>
			<input type="submit" value="등록">
		</form>
	</body>
</html>