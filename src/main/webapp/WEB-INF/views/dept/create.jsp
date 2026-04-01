<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="py-5">
			<div class="container px-5 mb-5">
				<div class="text-center mb-5">
					<h1 class="display-5 fw-bolder mb-0">
						<span class="text-gradient d-inline">HOME</span>
					</h1>
				</div>

				<div class="row gx-5 justify-content-center">
					<form action="/dept/create" method="post">
						<div>
							<label>부서명</label>
							<!-- DTO의 setter의 이름과 동일하게 -->
							<input type="text" placeholder="부서명 입력" name="departmentName">
						</div>
						<div>
							<label>관리자 아이디</label>
							<input type="text" name="managerId">
						</div>
						<div>
							<label>지역 코드</label>
							<input type="text" name="locationId">
						</div>
						<button type="submit" class="btn btn-outline-primary">부서 등록</button>

					</form>

				</div>
			</div>
		</section>
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>