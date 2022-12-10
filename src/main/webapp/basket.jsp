<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Shopping Mall</title>
<style type="text/css">
.container {
	width: 1280px;
	margin: 0 auto;
}

.basketList {
	width: 600px;
	margin: 0 auto;
}
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</style>
</head>
<body>
	<h1>Shopping Mall - My Basket</h1>
	<hr>
	<div class="container">
		<div class="basketList">
			<form method="post">
				<table>
				<c:choose>
					<c:when test="${ empty basketList }">
						<tr>
							<td>장바구니가 비었습니다.</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${ basketList }" var="basketList" varStatus="status">
							<tr>
								<td><input type="checkbox" id="select" class="select" name="basketNo" value="${ basketList.basketNo }"/></td>
								<td>${ basketList.productName }</td>
								<td>
									<input type="text" id="amount-${ status.count }" class="select" name="amount" value="${ basketList.amount }"/>
									<button type="button" id="edit" class="edit">수정</button>
								</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="3"><button type="submit" id="pay">결제페이지로 이동</button></td>
						</tr>
					</c:otherwise>
				</c:choose>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
	$(".edit").click(function() {
		if ($("#amount").val() == null || $("#amount").val() <= 0) {
			alert("1 이상의 숫자를 입력하세요.");
			return;
		} else {
			$(this).parent().find("input:eq(0)").prop("checked", true);
		}
	});
	</script>
</body>
</html>