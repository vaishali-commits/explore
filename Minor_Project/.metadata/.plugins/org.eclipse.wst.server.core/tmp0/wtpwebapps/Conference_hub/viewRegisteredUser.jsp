<%@page import="models.ConferenceModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

	<%
		out.println("<font face='comic sans ms' face=10><mark>No. of registered users: ");
		int id=Integer.parseInt(request.getParameter("cid"));
		ConferenceModel cm=new ConferenceModel();
		out.println(cm.count(id));
		out.println("</mark></font>");
	%>


</body>
</html>