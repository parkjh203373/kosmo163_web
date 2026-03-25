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
		<h3>부서 리스트</h3>
		
		<div>
			<table>
				<thead>
					<tr>
						<th>부서 아이디</th>
						<th>부서명</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${list}" var="d">
					<!-- getter의 이름 : getter 메서드에서 get을 빼고 ()를 빼고 남은 첫글자를 소문자로 변경 -->
						<tr>
							<td>${d.departmentId}</td>
							<td><a href="/dept/detail?departmentId=${d.departmentId}">${d.departmentName}</a></td>
						</tr>
					</c:forEach>
				</tbody>
				
			</table>
		</div>
	</body>
</html>