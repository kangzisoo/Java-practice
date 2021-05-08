<%@page import="shop.BoardVO"%>
<%@page import="shop.BoardDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//입력해서 전송된 데이터를 받아야 한다.
		String id = request.getParameter("id");
		
		//db전담하는 부품에 db에 넣어달라고 요청 예정.
		BoardDB bdb = new BoardDB();
		BoardVO bag = bdb.read(id);
	%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시물 조회가 완료되었습니다.
<hr>
검색된 id: <%= bag.getId() %><br>
검색된 title: <%= bag.getTitle() %><br>
검색된 content: <%= bag.getContent() %><br>
검색된 writer: <%= bag.getWriter() %><br>
</body>
</html>