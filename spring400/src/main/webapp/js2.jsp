<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
	<title>Insert title here</title>
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script type="text/javascript">
		google.charts.load('current', {'packages':['corechart']});
		google.charts.setOnLoadCallback(drawVisualization);
	
		function drawVisualization() { 
			var data = google.visualization.arrayToDataTable([
					['Month', '독일', '영국', '프랑스', '이탈리아', '스페인'],
					['2020/01',  246300,      149279,         134229,             155528,           86443],
					['2020/02',  239943,      79594,        167782,             162793,          94620],
					['2020/03',  215199,      254684,        62668,             28326,           37644],
				]);
			var options = {
					title : '2020년 1분기 유럽 시장 자동차 판매량 ',
					vAxis: {title: '자동차 판매량'},
					hAxis: {title: 'Month'}, 
					seriesType: 'bars',
					series: {5: {type: 'line'}}
				};
			
			var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
			chart.draw(data, options);
		}
	</script>
</head>
<body>
	<div id="chart_div" style="width:900px; height: 500px;"></div>
</body>
</html>