<%@page import="com.springmvcproject.base.dto.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="./navbar.jsp" %>
    <%EmployeeDetails details=(EmployeeDetails)request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./getdata" method="post">
<label >enter your id:</label>
<input type="number" name="empId">
<input type="submit" value="GET-DATA">
</form>
<%if(details != null) { %>
<h2>employee id is :
<%=details.getEmpId() %>
</h2>
<h2>employee name is :
<%=details.getEmpName() %>
</h2>
<h2>employee password is :
<%=details.getEmpPassword() %>
</h2>
<% } %>
</body>
</html>