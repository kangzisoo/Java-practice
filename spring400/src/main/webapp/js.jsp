<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
        	['활동', '시간'], // 항목 정의
    		['수업', 8],
    		['복습', 4],
    		['휴식', 2],
    		['운동', 2], // 항목, 값 (값은 숫자로 입력하면 그래프로 생성됨)
    		['식사', 2],
    		['수면', 6]
    	]);
        var options = {
            title: '나의 하루 활동 일정',
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart_material'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="piechart_material" style="width: 900px; height: 500px;"></div>
  </body>
</html>
    
