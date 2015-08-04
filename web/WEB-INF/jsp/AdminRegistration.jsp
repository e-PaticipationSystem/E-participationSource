<%-- 
    Document   : Login
    Created on : Jul 31, 2015, 2:13:55 PM
    Author     : Nkandlaboy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register - To System</title>
         <meta name="keywords" content="" />
         <meta name="description" content="" />
         <meta name="viewport" content="width=device-width">        
         <link rel="stylesheet" href="styles/css/templatemo_main.css">
    </head>

    
    <body>
   <div id="main-wrapper">
    <div class="navbar navbar-inverse" role="navigation">
      <div class="navbar-header">
        <div class="logo"><h1>E-Participation -Admin Registration</h1></div>
      </div>   
    </div>
    <div class="template-page-wrapper">
        
        

<form class="form-horizontal templatemo-signin-form" role="form" action="AddAdminServlet" method="POST">
   <div class="form-group">
          <div class="col-md-12">
            <label for="AdminName" class="col-sm-2 control-label">Name</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="firstname" placeholder="Name">
            </div>
          </div>              
        </div>
        <div class="form-group">
          <div class="col-md-12">
            <label for="AdminName" class="col-sm-2 control-label">Surname</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="lastname" placeholder="Surname">
            </div>
          </div>
        </div>
    
        <div class="form-group">
          <div class="col-md-12">
            <label for="Username" class="col-sm-2 control-label">Username</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="username" placeholder="Username">
            </div>
          </div>              
        </div>
        <div class="form-group">
          <div class="col-md-12">
            <label for="Password" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
              <input type="password" class="form-control" id="password" placeholder="Password">
            </div>
          </div>
        </div>
    
    <div class="form-group">
          <div class="col-md-12">
            <label for="ConfirmPassword" class="col-sm-2 control-label">Confirm Password</label>
            <div class="col-sm-10">
              <input type="password" class="form-control" id="confirmpassword" placeholder="Confirm Password">
            </div>
          </div>
        </div>
      <div class="form-group">
          <div class="col-md-12">
            <div class="col-sm-offset-2 col-sm-10">
              <input type="submit" value="Register" onclick="ajaxFunction()"class="btn btn-default">
            </div>
          </div>
        </div>
        
     <div id="showDiv">
    
   </div>
</form>
</body>
</div>
 </div>

</html>
