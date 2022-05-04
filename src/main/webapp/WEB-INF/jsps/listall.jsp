<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List | Page</title>
</head>
<body>
<h2><a href="new">Create New Lead</a></h2>
<h1>List All Leads....</h1>
<hr> 
<hr>
<table border=1>
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Mobile</th>
		<th>Email</th>
		<th>Lead Source</th>
	</tr>
	
<c:forEach items="${lead}" var="lead">
	<tr>
		<td>${lead.id}</td>
		<td><a href="leadById?id=${lead.id}">${lead.firstName}</a></td>
		<td>${lead.lastName}</td>
		<td>${lead.mobile}</td>
		<td>${lead.email}</td>
		<td>${lead.leadSource}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>