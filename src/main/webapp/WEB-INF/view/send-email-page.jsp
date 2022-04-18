<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HI ${userName}</h1>
	<h3>Send Result to your Email</h3>

	<form:form action="process-email" method="GET"
		modelAttribute="emailDTO">
		<label>Enter your Email</label>
		<form:input path="userEmail" />
		<input type="submit" value="send">
	</form:form>

</body>
</html>