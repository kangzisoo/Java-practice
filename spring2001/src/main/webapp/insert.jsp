<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="gold">
<!-- 클라이언트가 입력하는 view -->
<h2>회원 가입</h2>
<hr color="blue">
<form action="insert.mega">
	아이디: <input type="text" name="id"><br>
	패스워드: <input type="text" name="pw"><br>
	이름: <input type="text" name="name"><br>
	전화번호: <input type="text" name="tel"><br>
	<input type="submit" value="회원가입 처리">
</form>
</body>
</html>