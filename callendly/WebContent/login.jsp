<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>log into the contest</title>

</head>
<body>
<h1>Log in to book your schedule</h1>
<form action="RegServlet" method="GET">
<input type="hidden" name="command" value="ADD" />
<table style ="width: 50%">

<td> username name</td>
<td><input type="text" name="user_name"/></td>
</tr>
<tr>
<td> password</td>
<td><input type="password" name="password"/></td>
</tr>

</table>
<input type="submit" value="submit"/>
</form>

</body>
</html>