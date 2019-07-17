function requiredValidation(){
	
	var un=document.forms["form1"]["uname"];
	if(un.value=="") {
		//alert("User name is mandatory");
		un.focus();
		un.style.background="yellow";
		un.style.border="solid 3px red";
		document.getElementById("error1").innerHTML="User name cant be blank";
		return false;
	}
	if(un.value.length<5){
		//alert("User name must be greater then or equal to 5 letters");
		un.focus();
		un.style.border="solid 3px red";
		document.getElementById("error1").innerHTML="User name should have atleast 5 characters.";
		return false;
	}
	
	return true;
	var un=document.forms["form1"]["passid"];
	if(un.value=="") {
		//alert("Password is mandatory");
		un.focus();
		un.style.background="yellow";
		un.style.border="solid 3px red";
		document.getElementById("error1").innerHTML="User name cant be blank";
		return false;
}