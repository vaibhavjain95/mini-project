<%@page import="com.model.Details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>All Users</title>
</head>
<body>

<div class="bg" style="padding-left: 220px;">

<c:if test="${requestScope.DetailList !=null and
 not empty requestScope.DetailList}">
 <h1 style="padding-left: 300px;">All Users</h1><br>
<table class="table table-striped">
	<tr>
		<td>Registration ID</td>
		<td>Password</td>
		<td>Location</td>
		<td>Account Type</td>
		<td>Acc NO</td>
		
	</tr>
	<c:forEach items="${requestScope.DetailList}" var="e"> 		
	<tr>
		<td>${e.getRID()}</td>
		<td>${e.getPassword()}</td>
		<td>${e.getLocation()}</td>
		<td>${e.getAccount()}</td>
		<td>${e.getNo()}</td>
	</tr>
	</c:forEach>
</table></c:if>
</div>
</body>
</html>