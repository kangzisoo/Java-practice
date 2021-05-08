<%@page import="shop.계산기"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>계산기를 만들어보자.</h2>
	<hr>
	<h3>더하기 계산</h3>
	<form action="cal.jsp">
		숫자1 : <input name="n1"> <br> 
		숫자2 : <input name="n2"> <br>
		<!-- 연산종류 : <input> <br> -->
		<button type="submit">서버로 전송</button>
	</form>
	<hr>
	<h3>곱하기 계산</h3>
	<form action="cal2.jsp">
		숫자1 : <input name="n1"> <br> 
		숫자2 : <input name="n2"> <br>
		<!-- 연산종류 : <input> <br> -->
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>