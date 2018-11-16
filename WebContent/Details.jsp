<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
<body>
<div class="bg">
	<center><div class="col-md-6" style="padding: 5px;padding-bottom:150px; padding-top:50px; padding-right: 0px; padding-left: 80px;  margin: 5px; ">
	<h1 style="align:center;color:white">Bank Details</h1>
<form action="DetailsServlet">
<table style="text-align: center;">
<tr>
<th><i class="fas fa-id-card-alt"></i> Registration ID :</th>
<td> <input type="text" name="rid" autofocus placeholder="Enter Registration ID" style="border-radius:5px;font-size: 15px;" required></td>
</tr>
<tr>
<th><i class="fas fa-unlock"></i> Password : </th>
<td><input type="password" name="pass"  maxlength="15" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="Enter Password" style="border-radius:5px;font-size: 15px;" required></td>
</tr><tr>
<th><i class="fas fa-map-marker-alt"></i> Nearest Branch :</th>
<td><input list="locations" name="location" placeholder="Select" style="border-radius:5px;font-size: 15px;" required>
  <datalist id="locations">
    <option value="Vashi">
    <option value="Thane">
    <option value="Dadar">
    <option value="Andheri">
    <option value="Chembur">
  </datalist>
 </td>
 </tr>
 <tr>
 <th>Account Type :</th>
 <td><input list="accounts" name="account" placeholder="Select" style="border-radius:5px;font-size: 15px;" required>
  <datalist id="accounts">
    <option value="Saving">
    <option value="Current">
	</datalist>
	</td></tr>
  <tr><th><i class="fas fa-money-check"></i> Account Number :</th>
  <td><input type="text" name="no" placeholder="Enter Account number" style="border-radius:5px;font-size: 15px;" required></td></tr>
 </table><br>
 <input type="submit" name="submit" style="border-radius: 5px;font-size: 18px; width:125px;background-color: #4CAF50; box-shadow: 0px;">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
 <input type="reset" name="reset" style="border-radius: 5px;font-size: 18px; background-color:red; width:125px; box-shadow: 0px;">
 </div>
 </form>
</body>
</html>

