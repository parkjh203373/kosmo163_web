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
		<h3>나라 리스트</h3>
		
		<div>
			<table>
				<thead>
					<tr>
						<th>나라 아이디</th>
						<th>나라 이름</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${list}" var="c">
						<tr>
							<td>${c.countryId}</td>
							<td>${c.countryName}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>