<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>전달 사항 정보 수정</h2>
		
		<form action="/comm/update" method="post">
			<input type="hidden" value="${dto.num}" name="num">
			<div>
				<label>제목</label>
				<!-- DTO의 setter의 이름과 동일하게 -->
				<input type="text" value="${dto.title}" name="title">
			</div>
			<div>
				<label>작성자</label>
				<input type="text" value="${dto.name}" name="name">
			</div>
			<div>
				<label>내용</label>
				<input type="text" value="${dto.contents}" name="contents">
			</div>
			<div>
				<label>중요도</label>
				<input type="text" value="${dto.star}" name="star">
			</div>
			<button>button</button>
					
		</form>
	</body>
</html>