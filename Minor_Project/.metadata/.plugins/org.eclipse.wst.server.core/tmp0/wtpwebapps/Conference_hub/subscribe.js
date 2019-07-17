/**
 * 
 */
function formValidation()  
{ 
	var uname = document.registration.t1; 
	var passid = document.registration.t2; 
	var fname = document.registration.t3;
	var lname = document.registration.t4; 
	var uemail = document.registration.t5;
	if(allLetter_u(uname))  
	{ 
		if(passid_validation(passid,7,12))  
		{  
			if(allLetter_f(fname))  
			{ 
				if(allLetter_l(lname))  
				{ 
					if(ValidateEmail(uemail))  
					{ 
						return true;
					}
				}
			}
		}
	}
	return false; 
}

function allLetter_u(uname)  
{   
var letters = /^[A-Za-z]+$/;  
if(uname.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('Username must have alphabet characters only');  
uname.focus();  
return false;  
}  
}  

function passid_validation(passid,mx,my)  
{  
var passid_len = passid.value.length;  
if (passid_len == 0 ||passid_len >= my || passid_len < mx)  
{  
alert("Password should not be empty / length be between "+mx+" to "+my);  
passid.focus();  
return false;  
}  
return true;  
}  

function allLetter_f(fname)  
{   
var letters = /^[A-Za-z]+$/;  
if(fname.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('First name must have alphabet characters only');  
fname.focus();  
return false;  
}  
}  

function allLetter_l(lname)  
{   
var letters = /^[A-Za-z]+$/;  
if(lname.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('Last name must have alphabet characters only');  
lname.focus();  
return false;  
}  
}  

function ValidateEmail(uemail)  
{  
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
if(uemail.value.match(mailformat))  
{  
return true;  
}  
else  
{  
alert("You have entered an invalid email address!");  
uemail.focus();  
return false;  
}  
}  

