<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>전달 사항 세부 내용</h2>
	
		<h4>${detail.num}</h4>
		<h4>${detail.title}</h4>
		<h4>${detail.name}</h4>
		<h4>${detail.contents}</h4>
		<h4>${detail.createTime}</h4>
		<h4>${detail.star}</h4>

		<a href="/comm/update?num=${detail.num}">수정</a>
		<a href="/comm/delete?num=${detail.num}">삭제</a>
		<a href="/comm/list">뒤로</a>
	</body>
</html>