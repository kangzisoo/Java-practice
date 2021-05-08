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
		re = $('#reply').val()
		프릳츠 = $('#프릳츠').val()
		div = $('div')
		img = '<img width=150 height=150 src=resources/img/'+ 프릳츠 + '>'
		div.append(img + " " + re + '<br>')
	})
})
</script>
</head>
<body>
댓글: <input id='reply'>
<button id="add">댓글추가</button>
<button id="도주" value="웰시코기도주.jpg">웰시코기이미지</button>
<button id="프릳츠" value="프릳츠.jpg">이미지+댓글</button>
<hr color="pink" size="5">
<div></div>
<hr>

</body>
</html>