<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Mypage</h2>
		
		<div>
   	    	<span>아이디 :</span>
   	    	<span>${dto.id}</span>
		</div>
		<div>
			<span>비밀번호 :</span>
   	    	<span>${dto.pw}</span>
		</div>
		<div>
			<span>이름 :</span>
   	    	<span>${dto.name}</span>
		</div>
		<div>
			<span>이메일 :</span>
   	    	<span>${dto.email}</span>
		</div>
		<a href="/home">홈으로</a>
	</body>
</html>