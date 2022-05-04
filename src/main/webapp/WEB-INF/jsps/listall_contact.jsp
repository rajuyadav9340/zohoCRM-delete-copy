<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact | Page</title>
</head>
<body>
<h1>List All Contacts.....</h1>
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
		<th>Billing</th>
	</tr>
<c:forEach items="${contacts}" var="contacts">
	<tr>
		<td>${contacts.id}</td>
		<td>${contacts.firstName}</td>
		<td>${contacts.lastName}</td>
		<td>${contacts.mobile}</td>
		<td>${contacts.email}</td>
		<td>${contacts.leadSource}</td>
		<td><a href="createBilling?id=${contacts.id}">Generate Bill</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>