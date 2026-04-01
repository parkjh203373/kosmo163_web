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
					<h5>부서ID : ${detail.departmentId}</h5>
					<h5>부서명 : ${detail.departmentName}</h5>
					<h5>관리자 ID : ${detail.managerId}</h5>
					<h5>지역 코드 : ${detail.locationId}</h5>
					<div class="text-start">
					<a class="btn btn-outline-primary" href="/dept/update?departmentId=${detail.departmentId}" role="button" style="width: 90px;">부서 수정</a>
					<a class="btn btn-outline-primary" href="/dept/delete?departmentId=${detail.departmentId}" role="button" style="width: 90px;">부서 삭제</a>
					</div>
					<!-- 
					<form action="/dept/delete" method="get">
						<input type="hidden" name="departmentId" readonly value="${detail.departmentId}">
						<button>DELETE</button>
					</form>
					-->

				</div>
			</div>
		</section>
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>