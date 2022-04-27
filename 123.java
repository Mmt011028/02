function validateform(){  
var First name=document.myform.First name.value;
var Last name=document.myform.Last name.value;
var E-mail=document.myform.E-mail.value;  
var ID password=document.myform.ID password.value;  
  
if (First name==null || First name==""){  
  alert("First name can't be blank");  
  return false;
}if (Last name==null || Last name==""){  
  alert("Last name can't be blank");  
  return false;
}if (E-mail==null || E-mail==""){  
  alert("English name can't be blank");  
  return false;   
}else if (ID password.length<6){  
  alert("ID Password must be at least 6 characters long.");  
  return false;  
  }  
}    