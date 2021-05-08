<%@page import="shop.계산기"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 자동주석 : ctrl + shift + / -->

<!-- n1, n2값을 받아줘야 함. -->
<%
	String n1 = request.getParameter("n1");//"200"
	String n2 = request.getParameter("n2");//"100"
%>
<!-- n1, n2를 int로 바꿔줘야 함. -->
<%
	int s1 = Integer.parseInt(n1);
	int s2 = Integer.parseInt(n2);
%>
<!-- 계산기한테 두 값을 더해달라고 해야 함. -->
<%
	계산기 cal = new 계산기();
	int result = cal.add(s1, s2);
%>
<!-- 더한 반환 값을 받아와서 클라이언트에 전송 (html로 만든 후 전송해야한다.) -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력하신 두 수의 합은 <%= result %> <!-- 결과 값 가져올때 쓰는 태그 -->
</body>
</html>