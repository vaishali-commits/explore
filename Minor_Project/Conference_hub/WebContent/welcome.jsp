<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="welcome.js">
</script>
<link rel="stylesheet" type="text/css" href="welcome.css"/>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>Welcome</title>
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<h1>User's Profile</h1>
</header>
<br/><br/>
Welcome : ${sessionScope.usname}<br/><br/><br/>


<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">X</a>
<a href="changepass.jsp">Change Password</a>
<a href="Conference2.jsp">Conferences</a>
<a href="imghub_welcome.jsp">Image Hub</a>
<a href="videohub_welcome.jsp">Video Hub
<a href="logout">Logout</a><br/>
</div>

<div id="main">
<center><font size="12" face="comic sans ms" color="navy" ><b><u><span style="font-size:30px;cursor:pointer" onclick="openNav()">Explore Hub</span></u></b></font></center>
</div>
<div class="imgcontainer">
    <img src="welcome.png"  alt="Avatar" class="avatar">
  </div>

</div>
</center>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<footer>
Conference Hub
</footer>
</body>
</html>