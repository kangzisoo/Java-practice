<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
    <!-- 서버에서 실행되는 코드가 필요 -->
    <!-- 클라이언트가 입력한 정보를 받아주는 코드가 필요 -->
    <%
    //클라이언트가 입력한 정보를 서버에서 받아주는 클래스
    
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    /* db에 넣을 수 있는 부품을 만들어서, 데이터를 주고, 넣으라고 하는 처리 */
    
    %>
     
    <!-- html은 요청한 처리 결과를 클라이언트에게 알려주기 위한 html화면
    	=> html부분이 클라이언트로 전송되고 끝남.
     -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입이 완료되었습니다.!</h3>
<hr>
당신이 입력한 id: <%= id %> <br>
당신이 입력한 pw: <%= pw %> <br>
당신이 입력한 name: <%= name %> <br>
당신이 입력한 tel: <%= tel %> <br>
<a href="member.html">회원가입 화면으로 돌아가기</a>
</body>
</html>