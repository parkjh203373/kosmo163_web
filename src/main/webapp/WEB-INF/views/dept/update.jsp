<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>부서 정보 수정</h2>
		
		<form action="/dept/update" method="post">
			<input type="hidden" value="${dto.departmentId}" name="departmentId">
			<div>
				<label>부서명</label>
				<!-- DTO의 setter의 이름과 동일하게 -->
				<input type="text" value="${dto.departmentName}" placeholder="부서명 입력" name="departmentName">
			</div>
			<div>
				<label>관리자 아이디</label>
				<input type="text" value="${dto.managerId}" name="managerId">
			</div>
			<div>
				<label>지역 코드</label>
				<input type="text" value="${dto.locationId}" name="locationId">
			</div>
			<button>button</button>
			<input type="submit" value="create">
			<input type="button" value="등록">
			<input type="reset" value="reset">
					
		</form>
	</body>
</html>