<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>Change Password</title>
<style>
body{
background-image:url("p4.jpg");
background-size:110%;
}
</style> 
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="welcome.jsp"><img src="back.png"></a></section><h1>CHANGE PASSWORD</h1>
</header>
<fieldset>
		<form action="changepass" method="post">
		New Password : <br/><input type="password" placeholder="Enter New Password" name="new" required/><br/><br/>
		Confirm New Password :<br/> <input type="password" placeholder="Enter Confirm New Password"name="confirm" required/><br/><br/>
		<input type="submit" value="Change Password"><br><br>
		</form>
		</fieldset>
</div>
</center>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<footer>
Conference Hub
</footer>
</body>
</html>