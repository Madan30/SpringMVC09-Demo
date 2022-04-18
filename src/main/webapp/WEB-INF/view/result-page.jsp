<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Welcome to Home Page</h2>
	<hr>
<p> ${userInfo.userName } and ${userInfo.crushName} are</p>
<br/>
FRIEND
<br/>
<a href="/SpringMVC09DataBinding/sendEmail">Send result to Email</a>

</body>
</html>