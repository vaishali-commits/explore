<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>Conference</title>
<style>
body{
background-image:url("bg2.jpg");
background-size:90%;
}
</style>
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="Conference2.jsp"><img src="back.png"></a></section><h1>VIEW SECTION</h1>
</header>

<fieldset>
<form action="ViewConferenceController2" method="post">
<br/><br/>

Category :<select name="s1">
  <option value="computer software & applications">computer software & applications</option>
 <option value="biotechnology">biotechnology</option>
 <option value="artificial intelligence">artificial intelligence</option>
<option value="health">health</option>
<option value="medicine & medical science">medicine & medical science</option>
<option value="nursing">nursing</option>
<option value="tourism">tourism</option>
<option value="culture">culture</option>
<option value="globalization">globalization</option>
<option value="marketing">marketing</option>
<option value="management">management</option>
<option value="e-commerce">e-commerce</option>
<option value="null">null</option>
</select><br/><br/>

<input type="submit" value="View"/>
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