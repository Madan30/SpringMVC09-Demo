<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.errors {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<h2 align="center">Welcome to Register Page</h2>
	<div align="center">
		<form:form action="register-success" method="GET"
			modelAttribute="userReg">

			<label>First Name</label>
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="errors"/>
			<br>

			<label>Last Name</label>
			<form:input path="lastName" />
			<br>

			<label>Username</label>
			<form:input path="userName" />
			<form:errors path="userName" cssClass="errors" />
			<br>

			<label>Password</label>
			<form:input path="passWord" />
			<br>

			<label>Country</label>
			<form:select path="countryName">
				<form:option value="Npl" label="Nepal"></form:option>
				<form:option value="Ind" label="India"></form:option>
				<form:option value="Usa" label="United States"></form:option>
				<form:option value="Pak" label="Pakistan"></form:option>
				<form:option value="Kor" label="Korea"></form:option>
				<form:option value="Jap" label="Japan"></form:option>
			</form:select>
			<br>
			<label>Hobbies</label>
                 Music : <form:checkbox path="hobbies" value="music" />
                 Football : <form:checkbox path="hobbies"
				value="football" />
                 Reading : <form:checkbox path="hobbies" value="reading" />
                 Travel : <form:checkbox path="hobbies" value="travel" />
                 Programming : <form:checkbox path="hobbies"
				value="programming" />
			<br>
			<label>Gender</label>
                Male <form:radiobutton path="gender" value="male" />
               Female <form:radiobutton path="gender" value="female" />
			<br>
			<label>Age</label>
			<form:input path="age" />
			<form:errors path="age" cssClass="errors"/>
			<br>
			<input type="submit" value="Register">
			<br>
			<h3>Communication</h3>
			<label>Email</label>
			<form:input path="communicationDTO.email" />
			<form:errors path= "communicationDTO.email" cssClass="errors"/>
			<label>Phone</label>
			<form:input path="communicationDTO.phone" />

		</form:form>
	</div>











</body>
</html>