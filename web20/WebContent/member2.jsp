<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		//아이디, 패스워드에 입력한 값을 가지고 와야 함.
		idTag = document.getElementById('id')  //태그추출
		idValue = idTag.value
		console.log('입력하신 id는 ' + idValue)
		
		pwTag = document.getElementById('pw')  //태그추출
		pwValue = pwTag.value
		console.log('입력하신 pw는 ' + pwValue)
		//글자 길이 체크
		
		
	}
</script>
</head>
<body>
아이디: <input type="text" name="id" id="id"><br> <!-- name은 서버용, id는 클라이언트용 -->
<button type="button" onclick="check()">아이디 체크</button><br>
패스워드: <input type="text" name="pw" id="pw"><br>
<button type="button" onclick="check()">패스워드 체크</button>
</body>
</html>