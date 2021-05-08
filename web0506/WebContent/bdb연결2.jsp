<%@page import="shop.BoardDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//입력해서 전송된 데이터를 받아야 한다.
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		
		//db전담하는 부품에 db에 넣어달라고 요청 예정.
		BoardDB bdb = new BoardDB();
		bdb.delete(id, title);
	%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시물 삭제가 완료되었습니다.
</body>
</html>