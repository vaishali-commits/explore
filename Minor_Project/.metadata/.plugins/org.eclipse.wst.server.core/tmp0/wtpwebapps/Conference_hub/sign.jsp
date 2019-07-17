<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>Sign in</title>
</head> 
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="homepage.jsp"><img src="h.png"></a></section><h1>SIGN IN</h1>
</header>
<center><h2>Sign In Form</h2></center>
<fieldset>
<form action="LoginController" method="post">
<div class="imgcontainer">
    <img src="user.png"  alt="Avatar" class="avatar">
  </div>
<br/><br/>
<div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="t1" required/>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="t2" required/>
        
   <center> <input type="submit" value="Sign In"/></center>
  </div>
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