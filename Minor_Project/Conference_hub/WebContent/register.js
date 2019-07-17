/**
 * 
 */
function formValidation()  
{ 
	var uname = document.registration.t1; 
	var fname = document.registration.t3;
	var lname = document.registration.t4; 
	var uemail = document.registration.t5;
	var ufieldofcanditate = document.registration.s1;

	if(allLetter_u(uname))  
	{  
			if(allLetter_f(fname))  
			{ 
				if(allLetter_l(lname))  
				{ 
					if(ValidateEmail(uemail))  
					{
						if(fieldofcandidateselect_foc(ufieldofcandidate))
							{
							
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


function fieldofcandidateselect_foc(ufieldofcandidate)  
{  
if(ufieldofcandidate.value == "Default")  
{  
alert('Select your field from the list');  
ufieldofcandidate.focus();  
return false;  
}  
else  
{  
return true;  
}  
} 




	
	