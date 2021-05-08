/**
 * 최종 수정 날짜: 2021. 2. 23
 * 작성자: 홍길동
 * 수정내역: 함수 추가함
 */
function site(name) {
	//자바스크립트는 변수를 선언하지 않아도 됨.
	//모든 변수는 var(생략 가능)
	//name = prompt('사이트 명을 입력하세요.')

	if(name == "naver"){
		location.href = "http://www.naver.com" /* 주소창에 해당 주소를 치고 엔터 치는 액션 */
	}else if(name == "daum"){
		location.href = "http://www.daum.net" /* 주소창에 해당 주소를 치고 엔터 치는 액션 */
	}else{
		alert('해당 사이트가 없습니다.')
	}
}
function data() {
	s1 = prompt('숫자1 입력')
	s2 = prompt('숫자2 입력')
	
	n1 = parseInt(s1)
	n2 = parseInt(s2)
	
	alert(n1 + n2)
}
