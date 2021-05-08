<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table>
	<tr>
		<td>영화제목</td>
		<td>영화관람료</td>
	</tr>
	<tr>
		<td>${vo.title}</td>
		<td>${vo.price}원</td>
	</tr>
	<tr>
		<td><a href="ajax3.jsp">문자인증받기</a></td>
	</tr>
</table>