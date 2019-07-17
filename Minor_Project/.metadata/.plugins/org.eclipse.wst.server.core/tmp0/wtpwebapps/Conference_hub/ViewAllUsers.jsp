<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>ViewAll</title>
</head>
<body>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="welcomeAdmin.jsp"><img src="back.png"></a></section><h1>LIST OF ALL USERS</h1>
</header>
<form action="view" method="post">
<table border="5" cellpadding="5" cellspacing="5" bgcolor="Lavender" bordercolor="black">
<caption><b>User's List</b></caption>
<tr>
			<th>User Name</th>
			<th>Password</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			
		</tr>
		<c:forEach items="${sessionScope.userList}" var="obj">
			<tr>
				<td>${obj.uname}</td>
				<td>${obj.upass}</td>
				<td>${obj.fname}</td>
				<td>${obj.lname}</td>
				<td>${obj.email}</td>
						
			</tr>
		</c:forEach>
		</table>
		
		</form>
</div>
</center>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<footer>
Conference Hub
</footer>
</body>
</html>
