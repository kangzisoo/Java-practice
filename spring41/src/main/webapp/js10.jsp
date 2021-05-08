<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
//document.ready() : body부분을 브라우저가 먼저 읽고와서
//body안에 있는 요소들을 브라우저가 인식한 수에 설정을 하게 됨.
	$(function() {
		//body부분을 브라우저가 먼저 읽고와서
		//Ram에 트리구조로 body부분을 만들어서 포함관계를 일
		//부모, 자식간의 관계가 성립
		//Document Object Model(DOM) Tree
		//실행할 내용을 이름 함수에 바로 넣어준다.
		alert('body태그 안에 있는 요소들을 모두 읽어서 브라우저가 인식하고 있음')
		//$() 콜백함수 (위에 설정하고 아래에 있는 애가 실행되는 것)
//		$('button').click(function() { //태그이름 button
		$('#button1').click(function() { //태그이름 button
			//button태그를 클릭했을 때 입력값으로 들어온
			//함수 부분을 실행해주세요.!!
//				data = $('input').val() //태그이름 input
				data = $('#data2').val() //input이 여러개라서 #id로 써줌
				alert('입력된 값은 ' + data)
		})
		$('#button2').click(function() {
			data3 = $('#data3').val()
			alert('입력된 값은 '+ data3)
		})
	})
</script>
</head>
<body>
<input id="data" value="밥먹으러 가자.!!!">
<input id="data2">
<button id="button1">뭐할꺼니??</button>
<hr color="green">
<input id="data3">
<button id="button2">어디로 갈꺼니??</button>
<hr>
</body>
</html>