<%@page import="lol.DB전담2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 1. 입력한 값 서버에서 받아와야 함. -->
<%
//HttpWervletRequest request = new HttpWervletRequest();
//톰캣이 해주니까 입력할 필요 업음.!

%>
<!-- 2. 입력한 값 db처리 전담하는 클래스한테 read 하라고 명령해야함. -->
<%
	DB전담2 db = new DB전담2();
	db.read();
%>
<!-- 3. 회원가입처리 결과 알려줌. 클라이언트: html밖에 몰라. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>챔피언 정보 조회 값을 확인해주세요.</h3>
<hr color="red">
<%-- 당신이 입력한 id : <%= id %> <br>
당신이 입력한 pw : <%= pw %> <br>
당신이 입력한 name : <%= name %> <br>
당신이 입력한 tel : <%= tel %> <br>
당신이 입력한 company : <%= company %> <br>
당신이 입력한 gender : <%= gender %> <br>
당신이 입력한 hobby : <%= result %> <br>
당신이 입력한 word : <%= word %> <br> --%>

</body>
</html>