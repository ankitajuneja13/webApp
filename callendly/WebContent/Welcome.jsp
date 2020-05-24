<%@ page import="bean.Userbean" %>  <% // BEAN is package name %>
 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome User
<%
	Userbean object =(Userbean)request.getAttribute("obj"); 
	out.print("User Name"+object.getName());
	out.print("<br>User Email"+object.getEmail());
	
%>

<a href="login.jsp"> LOGIN HERE</a>
</body>
</html>