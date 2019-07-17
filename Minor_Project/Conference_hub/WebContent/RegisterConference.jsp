<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>Register Conference</title>
<script src="register.js"></script>
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="ConferenceList2.jsp"><img src="back.png"></a></section><h1>REGISTER</h1>
</header>
<fieldset>
<form action="register2" method="post"  name='registration' onSubmit="return formValidation();">
<br/><br/>
User Name:<input type="text" placeholder="Enter Username" name="t1" /><br/><br/>
First Name:<input type="text" placeholder="Enter First Name" name="t3" /><br/><br/>
Last Name:<input type="text" placeholder="Enter Last Name" name="t4" /><br/><br/>
E-mail ID:<input type="text" placeholder="Enter E-mail Id" name="t5" /><br/><br/>
Field of Candidate<select name="s1">
<option selected="" value="Default">(Please select a Field)</option> 
  <option value="Student">Student</option>
  <option value="Faculty">Faculty</option>
  <option value="Industry Expert">Industry Expert</option>
  </select><br/><br/>
<input type="submit" value="Register"/>
<input type="reset" value="Reset"/>
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