<%@page import="shop.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.BoardDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	BoardDB db = new BoardDB();
    	ArrayList<BoardVO> list = db.list();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 0; i < list.size(); i++) {
		BoardVO bag2 = list.get(i); //꺼내기
	%>
	<%= bag2.getId() %>, <%= bag2.getTitle() %>, <%= bag2.getContent() %>, <%= bag2.getWriter() %>
		<br>
	<%
			}
	%>


</body>
</html>