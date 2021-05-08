<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<!-- 클라이언트가 입력하는 view -->
<h2>게시판 글 입력</h2>
<hr color="blue">
<form action="insert2.mega">
	아이디: <input type="text" name="id"><br>
	제목: <input type="text" name="title"><br>
	내용: <input type="text" name="content"><br>
	작성자: <input type="text" name="writer"><br>
	<input type="submit" value="저장하기">
</form>
</body>
</html>