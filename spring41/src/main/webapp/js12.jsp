<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- $('div').html('체크한 결과') -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
//	$('button').click(function() { //클릭 시!
	$('#pw2').keyup(function() { //입력만 해도!
		pw1 = $('#pw1').val()
		pw2 = $('#pw2').val()
		div = $('div') //value는 input만 있음! 
		if(pw1==pw2){
//			div.html('<h3 style = color:blue>일치!</h3>') //html로 화면에 출력
			div.append('<h3 style = color:blue>일치!</h3>') //하나씩 계속 쌓임()
		}else{
//			div.html('<h3 style = color:red>일치하지 않음!</h3>')
			div.append('<h3 style = color:red>일치하지 않음!</h3>')
		}
	})
	$('#add').click(function() {
		re = $('#reply').val()
		div = $('div')
		div.append('-' + re + '<br>')
	})
	$('#도주').click(function() {
		도주 = $('#도주').val()
		div = $('div')
		img = '<img width=150 height=150 src=resources/img/'+ 도주 + '>'
		div.append(img+'<br>')
	})
	$('#프릳츠').click(function() {
		프릳츠 = $('#프릳츠').val()
		div = $('div')
		img = '<img width=150 height=150 src=resources/img/'+ 프릳츠 + '>'
		div.append(img+'<br>')
	})
})
</script>
</head>
<body>
비밀번호: <input type="text" id="pw1"><br>
비밀번호 확인: <input type="text" id="pw2"><br>
<button>일치하는지 확인하기</button>
<hr>
댓글: <input id='reply'>
<input type="button" value="댓글추가" id="add">
<hr color="pink" size="5">
<hr>
<!-- <button id="car" value="car.jpg">car</button> 똑같음. 그냥 버튼 id 따로 안만들려고.-->
<input id="도주" type="button" value="웰시코기도주.jpg">
<input id="프릳츠" type="button" value="프릳츠.jpg">
<div></div>
<hr>

</body>
</html>