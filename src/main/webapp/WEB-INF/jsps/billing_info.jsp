<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill info | Page</title>
</head>
<body>
<h1>Billing Info.....</h1>
<hr>
<hr>
<pre>
Id : ${bill.id}
First Name : ${bill.firstName}
Last Name : ${bill.lastName}
Mobile : ${bill.mobile}
Email : ${bill.email}
Product Name : ${bill.productName}
Amount : ${bill.amount}
</pre>

<form action="composeEmail"method="post">
<input type="hidden" name="emailId" value="${bill.email}">
<input type="submit" value="Email"/>
</form>

</body>
</html>