<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>회원가입 페이지</h2>
		<form action="/member/join" method="post">
			<div>
				<label>아이디</label>
				<input type="text" name="id">
			</div>
			<div>
				<label>비밀번호</label>
				<input type="text" name="pw">
			</div>
			<div>
				<label>이름</label>
				<input type="text" name="name">
			</div>
			<div>
				<label>이메일</label>
				<input type="text" name="email">
			</div>
			<button>회원가입</button>
			<a href="/home">홈으로</a>
		</form>
	</body>
</html>