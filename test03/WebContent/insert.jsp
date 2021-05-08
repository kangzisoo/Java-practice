<%@page import="pack03.BookVO"%>
<%@page import="pack03.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//책등록.jsp에서 입력 -> 전송된 데이터를 받아옴
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String story = request.getParameter("story");
		String company = request.getParameter("company");
		
		//가방 만들기
		BookVO bag = new BookVO();
		
		//가방에 데이터 넣기
		bag.setId(id);
		bag.setTitle(title);
		bag.setStory(story);
		bag.setCompany(company);
		
		//db전담하는 부품에 db에 넣어달라고 요청
		BookDAO db = new BookDAO();
		db.create(bag);
	%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
책 등록이 완료되었습니다.
</body>
</html>