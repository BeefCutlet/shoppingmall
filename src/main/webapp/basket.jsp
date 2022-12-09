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
</style>
</head>
<body>
	<h1>Shopping Mall - My Basket</h1>
	<hr>
	<div class="container">
		<div class="basketList">
			<table>
			<c:forEach items=${ param.basketList } var="basket">
			<tr>
				<td><input type="checkbox" id="${ param.basketList }" name="${ param.basketList }"></td>
				<td>
					<ul>
						<li>${ param.basketList.name }</li>
						<li><input type="text" value="${ param.basketList.amount }" readonly><button type="button" id="increase">수량증가</button></li>
					</ul>
				</td>
			</tr>
			</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>