<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search User</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<style type="text/css">
		body {
		    /* The image used */
		    background-image: url("photo.jpg"); 
		    
		    /* Full height */
		    height: 100%; 
		
		    /* Center and scale the image nicely */
		    background-repeat: no-repeat;
		    background-size: cover;
		    
		    padding: 150px;
		    padding-left: 150px;
		}
	</style>
</head>
<body>
	<div class="bg">
	<form action="SearchServlet">
		<table style="text-align: center;">
			<tr>
				<th style="color:white">Registration ID <i class="far fa-user"></i> : </th>
				<td><input type="text" class="form-control form-rounded" name="rid" maxlength="20" placeholder="Enter User Name" autofocus="autofocus" required></td>
			</tr>
			</table><br>
			<input type="submit" name="submit" value="Search" class="btn btn-success" style="border-radius: 10px; box-shadow: 0px; margin-left: 100px;">
	</form>
	</div>
</body>
</html>