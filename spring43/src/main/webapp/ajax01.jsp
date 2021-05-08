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
		$('#b1').click(function() {
			alert('b1버튼을 클릭함!')
			//		location.href="http://www.naver.com"
			//순서대로 네이버 페이지를 호출하는 대표적인 방법 (동기식)
			//		$.ajax()
			//원할때 아무때나 특정한 페이지를 호출하는 방법(비동기식)
			$.ajax({
				url : "test.jsp",
				success : function(result) {
					alert('test 연결 성공.!!')
					alert('test.jsp의 결과는 ' + result)
				},
				error : function() {
					alert('test 연결 실패.!!')
				}
			})
		})
		$('#b2').click(function() {
			alert('b2버튼을 클릭함!')
			$.ajax({
				url : "monday.jsp",
				success : function(result) {
					alert(result)
				},
				error : function() {
					alert('연결 실패!!')
				}
			})
		})
		$('#b3').click(function() {
			alert('b3버튼을 클릭함!')
			$.ajax({
				url : "sunday", //spring에서는 컨트롤러의 주소를 넣어준다.
				success : function(result) { //result(아무거나) 변수 추가
					alert('연결 성공.!!!')
					alert('결과는 : ' + result)
				},
				error : function() {
					alert('연결 실패.!!!')
				}
			})
		})

	})
</script>
</head>
<body>
	<button id="b1">ajax 테스트해보자.</button>
	<button id="b2">monday.jsp를 ajax 로 호출해서 "월요일이다."를 받아와보자.</button>
	<button id="b3">views 아래에 있는 sunday.jsp를 ajax로 호출</button>
</body>
</html>