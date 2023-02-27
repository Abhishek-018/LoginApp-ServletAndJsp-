<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.servlet.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h1>Login Successful</h1>

Hello from session!<%= session.getAttribute("savedSessionEmailId")%>
<br>Hello from application!<%=application.getAttribute("savedApplicationEmailId")%>
<!-- Hello from application! getServeltContext().getAttribute("savedApplicationEmailId") -->


<!-- User user = (User) request.getSession().getAttribute("userDetails");  -->
<% User user = (User) request.getAttribute("userDetails"); %>   


<h2>User Details:</h2>
    User code: <%=user.getUserCode() %>
<br>User Name: <%=user.getUserName() %>
<br>User Email: <%=user.getUserEmail() %>
<br>User Designation: <%=user.getUserDesignation() %>
<br>User Country: <%=user.getUserCountry() %>
</body>
</html>