<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/out.js"></script> <!-- 링크 연결용 script 태그 사용 -->
<script type="text/javascript"> /* 소스 작성용 script 태그 따로 써줘야 함! */
	//data()
	//site('naver')
	function cal(){
	//alert('나는 계산기 기능이예요.')
	console.log('나는 계산기 기능이예요...')
	
}
</script>
</head>
<body>
<button type="button" onclick="site('naver')">네이버 사이트로 이동해보자.</button>
<button type="button" onclick="site('daum')">다음 사이트로 이동해보자.</button>
<button type="button" onclick="cal()">계산기 기능을 사용해보자.</button>
</body>
</html>