<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<title>Update Conference</title>
<script src="update.js"></script>  
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="conference.jsp">Go Back</a></section><h1>UPDATE CONFERENCE</h1>
</header>
<fieldset>
<form action="update2" method="post" name='registration' onSubmit="return formValidation();">
<br/><br/>

Category :<select name="s1">
<option selected="" value="Default">(Please select a category)</option> 
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

Day:<select name="s2">
<option selected="" value="Default">(Please select a Day)</option> 
 <c:forEach begin="1" end="31" var="day">
 	<option value="${day}">${day}</option>
 </c:forEach>
 </select>
 
Month:<select name="s3">
<option selected="" value="Default">(Please select a Month)</option> 

  <option value="january">january</option>
  <option value="february">february</option>
  <option value="march">march</option>
  <option value="april">april</option>
<option value="may">may</option>
<option value="june">june</option>
<option value="july">july</option>
<option value="august">august</option>
<option value="september">september</option>
<option value="october">october</option>
<option value="november">november</option>
<option value="december">december</option>
</select>
Year:<select name="s4">
<option selected="" value="Default">(Please select a Year)</option> 

  <option value="2016">2016</option>
  <option value="2017">2017</option>
  <option value="2018">2018</option>
</select><br/><br/>
Title:<input type="text" placeholder="Enter Title" name="t1" /><br/><br/>
Venue:<input type="text" placeholder="Enter Venue" name="t2" /><br/><br/>
Type Of Category<select name="s6">
<option selected="" value="Default">(Please select a Category)</option> 
  <option value="National">National</option>
  <option value="Inter-National">Inter-National</option>
  </select><br/><br/>
Status:<select name="s5">
<option selected="" value="Default">(Please select a Status)</option> 
 <option value="approved">approved</option>
  <option value="rejected">rejected</option>
  </select><br/><br/>
<input type="submit" value="Update to database"/>
<input type="reset" value="Reset">
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