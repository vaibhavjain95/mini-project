<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
<body>
<div class="bg">
	<center><div class="col-md-6" style="padding: 5px; padding-bottom:310px; padding-top:50px; padding-right: 0px; padding-left: 80px;  margin: 5px; ">
	<h1 style="align:center;color:white">Login</h1>
<form action="LoginServLet">
<table style="text-align: center;">
<tr>
<th><i class="fas fa-id-card-alt"></i> Registration ID :</th>
<td> <input type="text" name="rid" autofocus placeholder="Enter Registration ID" style="border-radius:5px;font-size:18px;" required></td>
</tr>
<tr>
<th><i class="fas fa-unlock"></i> Password : </th>
<td><input type="password" name="pass" minlength="6" maxlength="15" placeholder="Enter Password" style="border-radius:5px;font-size:18px;" required></td>
</tr>
</table><br>
<input type="submit" name="submit" style="border-radius: 5px;font-size: 20px; width:80px;background-color: #4CAF50; box-shadow: 0px;">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
 <input type="reset" name="reset" style="border-radius: 5px;font-size: 20px; background-color:red; width:80px; box-shadow: 0px;">
</form></div>
</div>

</body>
</head>
</html>