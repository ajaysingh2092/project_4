<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
 

<script >

$("body").on('click', '.toggle-password', function() {
	  $(this).toggleClass("fa-eye fa-eye-slash");
	  var input = $("#pass_log_id");
	  if (input.attr("type") === "password") {
	    input.attr("type", "text");
	  } else {
	    input.attr("type", "password");
	  }

	});
	</script>

<script>
$(document).on('click', '.toggle-password', function() {

    $(this).toggleClass("fa-eye fa-eye-slash");
    
    var input = $("#pass_log_id");
    input.attr('type') === 'password' ? input.attr('type','text') : input.attr('type','password')
});
</script>

</head>
<body>

<!-- <span toggle="#password-field" class="fa fa-fw fa-eye field_icon toggle-password">Show/Hide</span>
<input type="password" id="pass_log_id"/> -->


<input id="pass_log_id" type="password" name="pass" value="MySecretPass">
<span toggle="#password-field" class="fa fa-fw fa-eye field_icon toggle-password"></span>
</body>
</html>