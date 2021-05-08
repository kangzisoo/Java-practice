<%@page import="pack03.BookDAO"%>
<%@page import="pack03.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//책삭제.jsp에서 입력 -> 전송된 데이터를 받아옴
		String id = request.getParameter("id");
		
		//데이터가 하나이므로 가방에 넣을 필요 없음
		
		//db전담하는 부품에 db에 넣어달라고 요청
		BookDAO db = new BookDAO();
		db.delete(id);
	%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
책 삭제가 완료되었습니다.
</body>
</html>