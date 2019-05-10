<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no"/>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
<title>Google Maps JavaScript API v3 Example: Geocoding Simple</title>
<link href="http://code.google.com/apis/maps/documentation/javascript/examples/default.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>

<script type="text/javascript">
  function codeAddress() {
   var geocoder = new google.maps.Geocoder();

    var address = document.getElementById("address").value;
    geocoder.geocode( { 'address': address}, function(results, status) {
      if (status == google.maps.GeocoderStatus.OK) {
        //alert(results[0].geometry.location.lat());
        //alert(results[0].geometry.location.lng());
        document.getElementById("lat").value = results[0].geometry.location.lat();
        document.getElementById("lng").value = results[0].geometry.location.lng();
      } else {
        alert("Geocode was not successful for the following reason: " + status);
      }
    });
  }

</script>
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBl1RQ7rB60dynJuZ7cslO8k-RbmrkDFOk&callback=initMap">
    </script>
</head>
<body">
  <div>
    <input id="address" type="textbox" value="서울시 영등포구 당산동">
    <input type="button" value="경도/위도 계산" onclick="codeAddress()">
  </div>
  <div>
    <input id="lat" type="text" value="">
    <input id="lng" type="text" value="">
  </div>

<div id="map_canvas" style="height:90%;top:30px"></div>
</body>
</html>
