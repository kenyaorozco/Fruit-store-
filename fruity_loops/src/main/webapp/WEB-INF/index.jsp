<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUY YA FRUITS here</title>
</head>
<body>
	<h2>Fruit Store</h2>

	<p>
	
		<c:forEach items="${fruitsName}" var="fruit" >
			<p>
				<c:out value="${fruit.name }"/>
				<c:out value="${fruit.price}"/>
			</p>
		</c:forEach>
		
	</p>


</body>
</html>