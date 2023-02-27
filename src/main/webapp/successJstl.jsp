<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.servlet.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success JSTL</title>
</head>
<body>
<h1>Login Successful</h1>
Hello from request!<%= request.getAttribute("requestUserEmail")%>

<jsp:useBean id="userDetails" class="com.servlet.dto.User" scope="request"></jsp:useBean>

<h2>User Details:</h2>
User Code :<jsp:getProperty property="userCode" name="userDetails"/>
<br>User Name : <jsp:getProperty property="userName" name="userDetails"/>
</body>
</html>