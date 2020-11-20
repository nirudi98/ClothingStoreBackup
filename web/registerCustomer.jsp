<%-- 
    Document   : registerCustomer
    Created on : Oct 7, 2020, 5:53:43 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Register</title>

    <!-- Icons font CSS-->
    <link href="register/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="register/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="register/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="register/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="register/css/main.css" rel="stylesheet" media="all">
    
    
<script> 
function CheckPassword()
{
    var p = document.forms["form1"]["pass"].value;
    var cp = document.forms["form1"]["confirm"].value;
    var dropdown = document.forms["form1"]["gender"].value;
   var valid = "none";
var passw=  /^[A-Za-z]\w{7,14}$/;
if(p.length < 8)
{ 
    alert('password must be more than 8 characters')

return false;
}
 if (p.search(/[a-z]/i) < 0) {
        alert("Your password must contain at least one letter.")
        return false;
    }
    if (p.search(/[0-9]/) < 0) {
        alert("Your password must contain at least one digit.")
        return false;
    }
    if(dropdown === valid)
{
    alert('Please select gender')
        return false;
}

 if(!document.getElementById('email').value.trim().length){
            isValid = false;
            alert('Please enter email');
            return false;
        }
}




</script> 
    

<script> 
    function verifyNull(){
        var isValid = true;
        if(!document.getElementById('user').value.trim().length){
            isValid = false;
            alert('Please enter username');
        }
        else if(!document.getElementById('pass').value.trim().length){
        isValid = false;
            alert('Please enter password');
        }
      return isValid;
    }
    
    
function CheckPasswordMatch()
{
    var p = document.forms["form1"]["pass"].value;
    var cp = document.forms["form1"]["confirm"].value;

if(p!=cp)
{ 
    alert('passwords should match')

return false;
}
}
</script> 

<script>
    function ValidateEmail() 
{
 var x = document.getElementById('email').value;
        var atpos = x.indexOf("@");
        var dotpos = x.lastIndexOf(".");
        if (atpos< 1 || dotpos<atpos+2 || dotpos+2>=x.length) {
            alert("Not a valid e-mail address");
        return false;
        }
       return true;
}
    

    
</script>   

<script>
    function ValidateGender() 
{
   var dropdown = document.forms["form1"]["gender"].value;
   var valid = "none";
   
    
 
    if(dropdown != valid){
        alert('Please select gender')
        return false;
    }
}
    

    
</script>  


    
<script>
    function myFunc() 
{
    
 CheckPasswordMatch();
 if(CheckPasswordMatch() === false)
 {
     return false;
 }
 if(CheckPassword() === false) 
 {
     return false;
 }
 if(ValidateEmail() === false) 
 {
     return false;
 }
 if(ValidateGender() === false)
 {
     return false;
 }
 
 
    
}
    
</script> 


<style>
    #link { color: #ffffff; } /* CSS link color */
  </style>
    
    
    
    
</head>

<body>
    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registration Info</h2>
                    <form method="POST" name="form1" action="register_Customer" onsubmit="return myFunc();">
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Full Name" name="full" required="">
                        </div>
                        
                       
                        <div class="input-group">
                            <input class="input--style-3 js-datepicker" type="text" placeholder="Birthdate" name="birthday" required="">
                            <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                        </div>
                        
                        <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                
                                <select name="gender" id="gen">
                                  <option  value="none" selected disabled hidden>Please Select Gender</option>
                                  <option>Male</option>
                                  <option>Female</option>
                                  <option>Other</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        
                         <div class="input-group">
                            <input class="input--style-3" type="email" placeholder="Email" name="email" required="">
                        </div>
                        
                         <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Username" name="user" required="">
                        </div>
                        
                         <div class="input-group">
                             <input class="input--style-3" type="password" placeholder="Password" name="pass" required="">
                        </div>
                        
                         <div class="input-group">
                             <input class="input--style-3" type="password" placeholder="Confirm Password" name="confirm" required="">
                        </div>
                        
                       
                        
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit"  >Submit</button>
                        </div>
                        
                        <br>
                        <br>
                        <br>
                        
                         <div>
                             <a id="link" href="loginCustomer.jsp">Already have an account?</a>
                        </div>
                        
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="register/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="register/vendor/select2/select2.min.js"></script>
    <script src="register/vendor/datepicker/moment.min.js"></script>
    <script src="register/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="register/js/global.js"></script>

</body>

</html>
<!-- end document-->
