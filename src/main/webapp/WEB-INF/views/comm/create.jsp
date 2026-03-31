<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>전달 사항 등록 페이지</h1>
		
		<form action="/comm/create" method="post">
			<div>
				<label>제목</label>
				<!-- DTO의 setter의 이름과 동일하게 -->
				<input type="text" name="title">
			</div>
			<div>
				<label>작성자</label>
				<input type="text" name="name">
			</div>
			<div>
				<label>내용</label>
				<input type="text" name="contents">
			</div>
			<div>
				<label>중요도</label>
				<input type="text" name="star">
			</div>
			<button>등록</button>
					
		</form>
	</body>
</html>