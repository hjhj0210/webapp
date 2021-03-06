<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script>
window.onload = function () {

//Better to construct options first and then pass it as a parameter
var options = {
	title: {
		text: "**구 평균 아파트 가격 증감 예측"
	},
	animationEnabled: true,
	exportEnabled: true,
	data: [
	{
		type: "spline", //change it to line, area, column, pie, etc
		dataPoints: [
			{ x: 1, y: 0.10 },
			{ x: 2, y: 0.12 },
			{ x: 3, y: 0.8 },
			{ x: 4, y: 0.14 },
			{ x: 5, y: 0.6 },
			{ x: 6, y: 0.24 },
			{ x: 7, y: -0.4 },
			{ x: 8, y: 0.10 },
			{ x: 9, y: 0.11 },
			{ x: 10, y: -0.10 },
			{ x: 11, y: 0.20 },
			{ x: 12, y: 0.51 },
		]
	}
	]
};
$("#chartContainer").CanvasJSChart(options);

}
</script>
<script async defer
src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBjN-9kl-3kJ8Ul5jwDG3QfX4hWYWfSpKQ&callback=initMap">
</script>
<script type="text/javascript" src="geocoder.js"></script>
<title>Untitled Document</title>
</head>

<body>
	<nav class="navbar navbar-default navbar-inverse">
    	<div class="'navbar-header">
        	<a class="navbar-brand" href="home.do">부동산</a>
        </div>
        <div class="collapse navbar-collapse">
        	<ul class="nav navbar-nav">
            	<li><a href="#">아파트별 예측<span class="sr-only">(current)</span></a></li>
            	<li><a href="gu.do">구별 예측</a></li>
                <li><a href="#">연구과제</a></li>
            </ul>


            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                    <button type="submit" class="btn btn-success">
                        <i class="glyphicon glyphicon-search"></i>
                    </button>
                </div>

            </form>
		</div>
    </nav>

	<div class="container">
    	<div class="panel panel-default">
        	<div class="panel-heading">아파트 주변정보</div>
            	<div class="panel-body">
                    <table class="table">
                    	<thead>
                          <tr>
                            <th>가격</th>
                            <th>가격</th>
                            <th>가격</th>
                          </tr>
                        </thead>
                       <tbody>
                          <tr>
                            <td>1234</td>
                            <td>1234</td>
                            <td>1234</td>
                          </tr>
                        </tbody>
                    </table>
                </div>
            </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">구 예측</h3>

            </div>
            <div class="panel-body">
                <div class="card-body">
                  <div id="chartContainer" style="height: 370px; width: 100%;"></div>
                </div>

            </div>
        </div>
				<div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">지도</h3>

            </div>
            <div>
							<p>지도가들어갑니당.</p>
						</div>
        </div>
    </div>
	<script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
	<script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
</body>
</html>
