<%@page import="com.project.model.Report"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="tvs" uri="WEB-INF/classTags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results Page</title>
</head>
<body style="background-color:#FEF5E7";>
<%
List<Report> repList=(List<Report>)session.getAttribute("repList");
%>
<div align="left">
<a href="logoff">Logout</a>
</div>
<div align="center">
<h2><u>Class Report</u></h2>
<tvs:results repList="<%=repList %>"/>
<a href="search">Click Here to View Other Class Report</a>
</div>

</br>


</div>
</body>
</html>