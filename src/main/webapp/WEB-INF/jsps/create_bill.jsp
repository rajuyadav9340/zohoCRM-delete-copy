<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Page</title>
</head>
<body>
<h1>Enter Lead Data.....</h1>
<hr>
<hr>
<form action="saveBill"method="post">
<pre>
First Name <input type="text" name="firstName" value = "${contacts.firstName}">
Last Name <input type="text" name="lastName" value = "${contacts.lastName}">
Mobile <input type="number" name="mobile" value = "${contacts.mobile}">
Email <input type="text" name="email" value = "${contacts.email}">
Product Name <input type="text" name = "productName"/>
Amount <input type = "number" name = "amount"/>
<input type = "submit" value = "Billing"/>
</pre>
</form>
</body>
</html>