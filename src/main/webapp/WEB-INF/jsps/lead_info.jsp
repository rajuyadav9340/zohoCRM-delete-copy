<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info | Page</title>
</head>
<body>
<h1>Lead Info.....</h1>
<hr>
<hr>
<pre>
Id : ${lead.id}
First Name : ${lead.firstName}
Last Name : ${lead.lastName}
Mobile : ${lead.mobile}
Email : ${lead.email}
Lead Source : ${lead.leadSource}
</pre>
<form action="composeEmail"method="post">
<input type="hidden" name="emailId" value="${lead.email}">
<input type="submit" value="Email"/>
</form>

<form action="convert"method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="Convert"/>
</form>
</body>
</html>