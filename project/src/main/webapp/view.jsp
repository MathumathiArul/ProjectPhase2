<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#FEF5E7";>
<div align="center">
<form action="search">
<style>
h2{
  color:#D35400;
  }
  input
  {
    color:brown;
  }

</style>
<h2>Select a ClassName to view report</h2>
<input type="radio" name="cname" value="1A">
<label for="1A">1A</label><br>
<input type="radio" name="cname" value="1B">
<label for="1B">1B</label><br>
<input type="radio" name="cname" value="2A">
<label for="2A">2A</label><br>
<input type="radio" name="cname" value="2B">
<label for="2B">2B</label><br>
<input type="radio" name="cname" value="3A">
<label for="3A">3A</label><br>
<input type="radio" name="cname" value="3B">
<label for="3B">3B</label><br>
<input type="radio" name="cname" value="4A">
<label for="4A">4A</label><br>
<input type="radio" name="cname" value="4B">
<label for="4B">4B</label><br>
<input type="submit" value="View">
</form>
<%if(request.getAttribute("error")!=null){ %>
		<span style="color:red;"><%= request.getAttribute("error")%></span>
		<%} %>
</div>
</body>
</html>