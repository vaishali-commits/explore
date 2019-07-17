
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>View Details</title>
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="welcomeAdmin.jsp">Go Back</a></section><h1>DETAILS</h1>
</header>
<form action="view" method="post">
<table border="5" cellpadding="5" cellspacing="5" bgcolor="Lavender" bordercolor="black">
<caption><b>DETAILS</b></caption>
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