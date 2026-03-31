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
		<h3>전달 사항 리스트</h3>
		
		<div>
			<a href="/comm/create">전달 사항 등록</a>
			<a href="/home">홈으로</a>
		</div>
		<div>
			<table>
				<thead>
					<tr>
						<th>글 번호</th>
						<th>제목</th>
						<th>작성자</th>
					</tr>
				<thead>	
			
				<tbody>
					<c:forEach items="${list}" var="c">
						<tr>
							<td>${c.num}</td>
							<td><a href="/comm/detail?num=${c.num}">${c.title}</a></td>
							<td>${c.name}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>