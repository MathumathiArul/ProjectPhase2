<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color:#FEF5E7";>
<div align="center">
<h1 style="color:#C0392B;font-family:Cambria;"><u><b>Learner's Academy</b></u></h1>
<h3 style="color:#EC7063;"><b>ADMIN LOGIN</b></h3>
<form action="LoginControl" method="post">
<style>
table {
  border: 0px;
  color: #6E2C00;
}
tr,td
{
border: 1px
}
</style>
<table border="2px" color>
<tr>
<td><b>AdminID</b><input type="text" name="aid"></td>
</tr>
<tr>
<td><b>Password</b><input type="password" name="password"></td>
</tr>
<tr>
<td align="center"><input type="submit" value="Login"></td>
</tr>
</table>
</form>
<%if(request.getAttribute("error")!=null) {%>
<center><span style="color:red;"><%=request.getAttribute("error") %></span></center>
<%} %>
</div>
</body>
</html>