<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() { //모든 코드를 이 안에 넣어줘야 한다.
		//바디태그 안부터 램에 읽어와라! -> DOM Tree
		$('#b2').click(function() {
			$.ajax({
				url : "money.jsp",
				data: {
					money: $('#money').val(),
					choice: $('#choice').val()
				},
				success: function(result) {
					alert('연결 성공! '+ result)
				}
			})
		})
		$('#b3').click(function() {
			$.ajax({
				url : "check.jsp",
				data: {
					id: $('#id').val()
				},
				success : function(result) {
					$('div').html(result)
				},
				error : function() {
					alert('test 연결 실패.!!')
				}
			})
		})
		$('#b4').click(function() {
			$.ajax({
				url : "tel.jsp",
				data: {
					tel: $('#tel').val()
				},
				success : function(result) {
					num2 = result;
					$('div').html(result)
				},
				error : function() {
					alert('test 연결 실패.!!')
				}
			})
		})
		$('#b5').click(function() {
			num = $('#num').val()
			if(num == num2){
				alert(num + "," + num2)
				$(div).html('본인인증 확인 성공')
			}else {
				alert(num + "," + num2)
				$(div).html('본인인증 확인 실패')
				}
			})
	})
</script>
</head>
<body>
결제금액:	<input id="money"><br>
결제수단: 1)계좌이체, 2)신용카드, 3)휴대폰결제 <input id="choice">
<button id="b2">결제하기(money.jsp)</button>
<hr color="red">
회원가입할 id입력: <input id="id">
	<button id="b3">id중복체크(check.jsp)</button>
	<button id="b4">인증번호 받기(tel.jsp)</button>
	<button id="b5">인증번호 확인</button>
</body>


</html>