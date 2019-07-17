/**
 * 
 */
function formValidation()  
{ 
	var ucategory = document.registration.s1;
	var uday = document.registration.s2;
	var umonth = document.registration.s3;
	var uyear = document.registration.s4;
	var utitle = document.registration.t1;
	var uvenue = document.registration.t2;
	var utype = document.registration.s6;
	var ustatus = document.registration.s5;
 
		if(categoryselect(ucategory))  
		{
			if(dayselect(uday))  
			{
				if(monthselect(umonth))  
				{
					if(yearselect(uyear))  
					{
						if(alphanumeric_t(utitle))  
						{
							if(alphanumeric_v(uvenue))  
							{
								if(typeselect_ty(utype))  
								{
									if(statusselect_s(ustatus))  
									{
										
									}
								}
								
							}
						}
					}
					
				}
				
			}
		}
	}
 	

function categoryselect(ucategory)  
{  
if(ucategory.value == "Default")  
{  
alert('Select your category from the list');  
ucategory.focus();  
return false;  
}  
else  
{  
return true;  
}  
}  

function dayselect(uday)  
{  
if(uday.value == "Default")  
{  
alert('Select your day from the list');  
uday.focus();  
return false;  
}  
else  
{  
return true;  
}  
}  


function monthselect(umonth)  
{  
if(umonth.value == "Default")  
{  
alert('Select your month from the list');  
umonth.focus();  
return false;  
}  
else  
{  
return true;  
}  
}  


function yearselect(uyear)  
{  
if(uyear.value == "Default")  
{  
alert('Select your year from the list');  
uyear.focus();  
return false;  
}  
else  
{  
return true;  
}  
}  

function alphanumeric_t(utitle)  
{   
var letters = /^[0-9a-zA-Z]+$/;  
if(utitle.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('Title must have alphanumeric characters only');  
utitle.focus();  
return false;  
}  
}  

function alphanumeric_v(uvenue)  
{   
var letters = /^[0-9a-zA-Z]+$/;  
if(uvenue.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('Venue must have alphanumeric characters only');  
uvenue.focus();  
return false;  
}  
}  

function typeselect_ty(utype)  
{  
if(utype.value == "Default")  
{  
alert('Select your type from the list');  
utype.focus();  
return false;  
}  
else  
{  
return true;  
}  
}


function statusselect_s(ustatus)  
{  
if(ustatus.value == "Default")  
{  
alert('Select your status from the list');  
ustatus.focus();  
return false;  
}  
else  
{  
return true;  
}  
}
