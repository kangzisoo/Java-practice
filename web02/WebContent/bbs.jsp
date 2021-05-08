<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
       <%
    //클라이언트가 입력한 정보를 서버에서 받아주는 클래스
    
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    /* db에 넣을 수 있는 부품을 만들어서, 데이터를 주고, 넣으라고 하는 처리 */
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>입력한 내용을 확인하세요.!</h3>
<hr>
당신이 입력한 no: <%= no %> <br>
당신이 입력한 title: <%= title %> <br>
당신이 입력한 content: <%= content %> <br>
당신이 입력한 writer: <%= writer %> <br>
<a href="bbs.html">처음 화면으로 돌아가기</a>
</body>
</html>