<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원검색화면입니다.</h2>
	<hr color="red">
	<a href="memberList.jsp">전체 멤버 목록 가져오기</a>
	<!-- form태그는 값을 입력하고 싶을 때 사용 -->
	<!-- 입력값들은 모두 form들어가야 한다. -->
	<!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
	<form action="db연결4.jsp">
		아이디: <input name="id"><br> <!-- 값이 하나면 굳이 가방에 안넣어도 됨. -->
		<button>서버로 전송</button>
	</form>
</body>
</html>