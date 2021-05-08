<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
게시물 등록이 완료되었습니다.
<hr color="red">
<!-- 표현언어(Expression Languages:EL), 속성프린트 -->
내 아이디 : ${cartVO.mid} <br>
상품 아이디 : ${cartVO.pid}<br>           
상품 가격 : ${cartVO.price}<br>           
상품 수량 : ${cartVO.pcount}<br>
<hr color="red">
<a href="input.jsp">장바구니로 돌아가기</a>
<!-- 브라우저에서 요청할 수 있는 페이지만 들어갈 수 있음. webapp아래 파일만 -->
</body>
</html>