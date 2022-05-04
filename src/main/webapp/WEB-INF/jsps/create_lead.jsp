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
<form action="saveLead"method="post">
<pre>
First Name <input type="text" name="firstName"/>
Last Name <input type="text" name="lastName"/>
Mobile <input type="number" name="mobile"/>
Email <input type="text" name="email"/>
Lead Source:<select name="leadSource">
<option value="tv Ads">TV Ads</option>
<option value="radio Ads">Radio Ads</option>
<option value="news Ads">News Ads</option>
<option value="online Ads">Online Ads</option>
</select>
<input type = "submit" value = "Save"/>
</pre>
</form>
</body>
</html>