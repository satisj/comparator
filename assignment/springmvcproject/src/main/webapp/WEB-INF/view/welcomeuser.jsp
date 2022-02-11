<%@page import="com.springmvcproject.base.dto.MyEmployeeDetails"%>
<%@page import="org.springframework.security.core.userdetails.UserDetails"%>
<%@page import="com.springmvcproject.base.dto.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="./navbar.jsp" %>
    <%UserDetails details=(UserDetails)request.getAttribute("key"); %>
    <%String err=(String)request.getAttribute("err"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome user</title>
</head>
<body style="background-color: olive;">
<%if(err != null && !err.isEmpty()){ %>
<h1 style="color: red;"></h1>
<%=err %>
<%} %>
<h1 style="text-align:  center;">WELCOME USER TO HOME PAGE</h1>
</body>
</html>