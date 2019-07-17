<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>ViewAll</title>
<style>
body{
background-image:url("p6.jpg");
background-size:100%;
}
</style>
</head>
<body>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="conference.jsp"><img src="back.png"></a></section><h1>LIST OF CONFERENCES</h1>
</header>

<table border="5" cellpadding="5" cellspacing="5" bgcolor="Lavender" bordercolor="black">
<caption><b>Conference's List</b></caption>
		<tr>
			<th>Category</th>
			<th>Day</th>
			<th>Month</th>
			<th>Year</th>
			<th>Title</th>
			<th>Venue</th>
			<th>Status</th>
			<th>Delete</th>
			<th>Update</th>
			<th>Type</th>
			<th>Registered Users</th>
		</tr>
		<c:forEach items="${sessionScope.userListNew}" var="obj">
			<tr>
				<td>${obj.category}</td>
				<td>${obj.day}</td>
				<td>${obj.month}</td>
				<td>${obj.year}</td>
				<td>${obj.title}</td>	
				<td>${obj.venue}</td>
				<td>${obj.flag}</td>
				
				<td><a href="delete?x=${obj.id}">Delete</a>
				<td><a href="update?x=${obj.id}">Update</a>
				<td>${obj.type}</td>
				<td><a href="viewRegisteredUser.jsp?cid=${obj.id}">View</a></td>
			</tr>
		</c:forEach>
		</table>
		
</div>
</center>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<footer>
Conference Hub
</footer>
</body>
</html>
