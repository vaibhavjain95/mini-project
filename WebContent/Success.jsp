<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>	    
<style>
body {
		    /* The image used */
		    background-image: url("photo.jpg"); 
		    color:white;
		    font-size:25px;
		    /* Full height */
		    height: 100%; 
		
		    /* Center and scale the image nicely */
		    background-repeat: no-repeat;
		    background-size: cover;
		    }
a {    
    text-align: center;
	font-size:20px;
    color: white;
    padding: 14px 16px;
    text-decoration: none; }
    

a:hover {    background-color: green;  text-decoration: underline; }
</style>
</head>
<body>
<%
      	if(session.getAttribute("id") == null){
      		response.sendRedirect("Login.jsp");
      	}
      %>
        <div class="col-lg-3">
        <%
        	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
        
        	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
        	
        	response.setHeader("Expires", "0"); //Proxies
        
        %>
<center><br><br>
LOGIN SUCCESSFUL</center>
<br><br>
<center>
<a href="Search.jsp">Search</a>
<br><br>
<a href="DisplayServlet">Display</a>
<br><br><br><br>

<form action="LogoutServlet">
<input type="submit"  value="Logout" style="border-radius: 5px ;font-size: 18px; width:80px;background-color: red; box-shadow: 0px;">
</button>
</form>

</center>
</body>

</html>