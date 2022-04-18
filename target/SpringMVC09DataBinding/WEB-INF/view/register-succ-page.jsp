<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Registration success</h2>
<p> Your First Name : ${userReg.firstName} </p>
<p> Your Last Name : ${userReg.lastName} </p>
<p> Your Username : ${userReg.userName} </p>
<p> Your Password : ${userReg.passWord} </p>
<p> Your Country : ${userReg.countryName} </p>
<p> Your Hobbies : 

<c:forEach var="temp" items ="${userReg.hobbies}">
   ${temp}
</c:forEach>   </p>
<p> Your Gender : ${userReg.gender} </p>
<br>
<p> Your Age : ${userReg.Age} </p>
<br>
<p> Your Email :${userReg.communicationDTO.email}</p>
<br>




</body>
</html>