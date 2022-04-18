
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<style type="text/css">
.errors{
color:white;
position:fixed;
text-align:left;
margin-left:30px;

}


</style>

<%--
----client side form validation--

<script type="text/javascript">

function Validusername() {
	var userName = document.getElementsById('username').value;
	
	if(userName.length < 3){
		alert("username and crush name shoud be at least two character");
		return false;
		
	}
	
	else {
		return true;
	}
	
}
</script>



--%>





</head>
<body bgcolor="crimson">
	<h2 align="center">Welcome to Home Page</h2>
	<hr>

	<div align="center">
		<form:form action="process-homePage" method="GET" modelAttribute="userInfo" onsubmit = "return Validusername()">
			<p>
				<label>User Name : </label>
				 <form:input id="username" path= "userName"/>
				 <form:errors path= "userName" cssClass="errors"/>
			</p>
			<p>
				<label>Crush Name : </label> 
				<form:input id="crushname" path= "crushName"/>
				<form:errors path= "crushName" cssClass="errors"/>
			</p>
			<form:checkbox path="termAndCondition" id="check"/>
			<label>I am agreeing that this is for fun</label>
			<form:errors path="termAndCondition" cssClass="errors"/>
			<br>
			<button type="submit">Calculate</button>
		</form:form>

	</div>


</body>
</html>