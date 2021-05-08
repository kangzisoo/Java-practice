<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		//1. b1을 클릭했을때, 
		//2. tel에 입력한 값을 가지고 와야함.
		//3. mvc2에서는 controller에서 내가 넘긴 값을 받아서 다음 처리를 진행하게 함.
		//4. ajax의 url은 컨트롤로의 requestMapping과 동일해야함.
		$('#b1').click(function() {
			$.ajax({
				url: "movie",
				data: {
					title : $('#title').val(),
					price : $('#price').val()
				},
				success: function(x) {
					  $('#result').html(x)
				}
			}) //ajax
		})	//b1
	}) //start
</script>
<body>
영화 제목: <input id="title"><br>
영화 관람료: <input id="price"><br>
<input id="b1" type="button" value="영화 관람 확인"><br>
<hr color="red">
<div id="result"></div>
</body>
</html>