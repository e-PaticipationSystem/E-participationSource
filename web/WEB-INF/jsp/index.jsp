<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Audience Participation Project</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width">        
     <link rel="stylesheet" href="styles/css/templatemo_main.css">
    </head>

    <body>
         <div class="navbar navbar-inverse">
      <div class="navbar-header">
        <div class="logo"><h1>E-Participation</h1></div>
        <div class="LoginForm pull-right ">
            <form>
                <fieldset>
                    <div class="col-md-4">
                     <label for="username" class="col-sm-2 control-label">Username</label>
                     <input type="text" class="form-control" id="username" placeholder="Username">                   
                     </div>
                    <div class="col-md-4">
                     <label for="password" class="col-sm-2 control-label">Password</label>
                      <input type="password" class="form-control" id="password" placeholder="Password">             
                    </div>
                      <div class="col-md-4">
                    <div class="col-sm-offset-2 col-sm-10">
                         <input type="submit" value="Sign in" class="btn btn-default">
                         </div>
                      </div>                  
                   
                </fieldset>
            </form>
        </div>
      </div>   
    </div>
       <div class="template-page-wrapper">       
      <div class="templatemo-content-wrapper">
                  
               <div class="col-lg-6 col-md-4 col-sm-2">                 
                         <img src="styles/img/perpartlogo.png" alt="e-participation" height="700"/>              
               </div>  
               <div class="col-lg-6 col-md-4 col-sm-2">
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

               </div>   
   
   
          </div>
      </div>
        
        
        
     <footer class="templatemo-footer">
        <div class="templatemo-copyright">
          <p>Copyright &copy; Accenture Group Project - 2015</p>
        </div>
      </footer>
     

    <script src="styles/js/jquery.min.js"></script>
    <script src="styles/js/bootstrap.min.js"></script>
    <script src="styles/js/Chart.min.js"></script>
    <script src="styles/js/templatemo_script.js"></script>
    <script type="text/javascript"></script>
     </div>
    </body>
</html>
