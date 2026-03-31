<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>로그인 페이지</h2>
		
		<form action="/member/login" method="post">
			<div>
				<label>아이디</label>
				<input type="text" name="id">
			</div>
			<div>
				<label>비밀번호</label>
				<input type="text" name="pw">
			</div>
			<button>로그인</button>
			<a href="/home">홈으로</a>
		</form>
	</body>
</html>