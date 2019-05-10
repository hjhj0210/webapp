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
