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
		$('#b1').click(function() {
			$.ajax({
				url : "resources/team/dataset (1).xml",
				success : function(xml) {
					alert('xml 연결 성공')
					list = $(xml).find('record')
					console.log('레코드의 개수 => ' + list.length)
					$(list).each(function(i, record) {
						console.log(i + ":" + $(record).find('pnum').text())
						console.log(i + ":" + $(record).find('pname').text())
						console.log(i + ":" + $(record).find('cname').text())
						console.log(i + ":" + $(record).find('fname').text())
						console.log(i + ":" + $(record).find('lname').text())
						console.log(i + ":" + $(record).find('phone').text())
					})
				}//success
			})//ajax
		})//b1
		$('#b2').click(function() {
			$.ajax({
				url : "resources/team/MOCK_DATA (1).json",
				success : function(json) { //파라메터 이름 마음대로
					alert('json 연결 성공 ==> ' + json.length)
					$(json).each(function(i, product) { //파라메터 이름 마음대로
						pnum = product.pnum
						pname = product.pname
						cname = product.cname
						fname = product.fname
						lname = product.lname
						phone = product.phone
						console.log(pnum, pname, cname, fname, lname, phone)
					})
				}//success
			})//ajax
		})//b2
		$('#b3').click(function() {
		    $.ajax({
		       type: 'POST',
	            beforeSend : function(xhr){
	                  xhr.setRequestHeader("Authorization", "KakaoAK ffff946539499b767c97bd1322151fc9");
	                  xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	              },
	            url: "https://dapi.kakao.com/v2/vision/multitag/generate",
	            data: {
	               image_url: "https://lh3.googleusercontent.com/proxy/1HwewgqNKjoEk-HkQqRHtg5Per7M9JyP_-MlXA46OEIgZ6Ft-3FVh5xAO62Tv_vl92-JHBdJzhImtr8X-wAP-me6SojG-Aq2Xr4QqYwMO9M8z8Z8tgxGq6pQNkk"
	            },
	            success: function(x) {
	               alert('kakao연결 성공.!!! ' + x.result.label_kr)
	            } //success
	         }) //ajax
	      })//b3
		$('#b4').click(function() {
		    $.ajax({
		       type: 'POST',
	            beforeSend : function(xhr){
	                  xhr.setRequestHeader("Authorization", "KakaoAK ffff946539499b767c97bd1322151fc9");
	                  xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	              },
	            url: "https://dapi.kakao.com/v2/vision/product/detect",
	            data: {
	               image_url: "http://thumbnail.egloos.net/460x0/http://pds26.egloos.com/pds/201308/11/86/f0385886_520787699d3b5.jpg"
	            },
	            success: function(x) {
	               list = x.result.objects
	            	items = []
	            	   $(list).each(function(i, item) {
	            	 		  items.push(item.class)
					})//each
	               alert('kakao연결 성공.!!!')
	               console.log(items)
/* 	               for (var i = 0; i < x.result.objects.length; i++) {
						console.log(x.result.objects[i].class)
					}//for */
	            } //success
	         }) //ajax
	      })//b4
	})//$fun
</script>
</head>
<body>
	<button id="b1">XML문서 받아오기</button>
	<button id="b2">JSON문서 받아오기</button>
	<button id="b3">멀티 태그</button>
	<button id="b4">상품 검색</button>
</body>
</html>