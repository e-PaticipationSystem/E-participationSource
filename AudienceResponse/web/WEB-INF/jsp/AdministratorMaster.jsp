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
     <script>
          function addTt()
            {
               
                if (window.XMLHttpRequest)
                        {// code for IE7+, Firefox, Chrome, Opera, Safari
                            xmlhttp=new XMLHttpRequest(); 
                        }
                        else
                            {// code for IE6, IE5
                                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
                            }
                            xmlhttp.onreadystatechange=function()
                            {
                                if (xmlhttp.readyState===4 && xmlhttp.status===200)
                                    {
                                        document.getElementById("left").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("GET","FetchCreation",true);
                            xmlhttp.send();
            }
           
           function FetchFormCreater()
            { 
                 var title=document.getElementById('Title').value;
                 document.getElementById("Titl").value=document.getElementById("Title").value;
                if(title=="")
                {
                    alert("Please Enter Your title then click proceed:- * is required");
                }
                else
                {
                    if (window.XMLHttpRequest)
                        {// code for IE7+, Firefox, Chrome, Opera, Safari
                            xmlhttp=new XMLHttpRequest();  
                        else
                            {// code for IE6, IE5
                                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
                            }
                            xmlhttp.onreadystatechange=function()
                            {
                                if (xmlhttp.readyState===4 && xmlhttp.status===200)
                                    {
                                        document.getElementById("left").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("POST","FetchCreation",true);
                            xmlhttp.send();
                        }
                }
            }
           
     </script>
    </head>

    <body>
         <div class="navbar navbar-inverse">
      <div class="navbar-header">
        <div class="logo"><h1>ADMINISTRATOR PANE</h1></div>        
      </div>   
    </div>
       <div class="template-page-wrapper">
         <div class="navbar-collapse collapse templatemo-sidebar">
        <ul class="templatemo-sidebar-menu">
          <li>
            <form class="navbar-form">
              <input type="text" class="form-control" id="templatemo_search_box">
              <span class="btn btn-default">Go</span>
            </form>
          </li>
          <li class="active"><a href="#"><i class="fa fa-home"></i>Dashboard</a></li>         
          <li><a href="#" onclick="addTt()"><i class="fa fa-cubes"></i><span class="badge pull-right"></span><u>CREATE POLL</u></a></li>
          <li><a href="#"><i class="fa fa-map-marker"></i><span class="badge pull-right"></span><u>MY SESSIONS</u></a></li>
          <li><a href="#"><i class="fa fa-users"></i><span class="badge pull-right"></span><u>PARTICIPANTS</u></a></li>
          <li><a href="#"><i class="fa fa-cog"></i>SETTINGS</a></li>
          </ul>
      </div><!--/.navbar-collapse -->
      <div class="templatemo-content-wrapper">
          <div class="templatemo-content">
              
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-comments fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                  
                                        <div><u>POLLS</u></div>
                                    </div>
                                </div>
                            </div>    
                            <div class="panel-footer">
                            <a href="#">
                            
                                    <span class="pull-left">View More...</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                               </a>
                            </div>                          
                        </div>
                    </div>
                       <div class="col-lg-4 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-refresh fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                     
                                        <div><u>SESSIONS</u></div>
                                    </div>
                                </div>
                            </div>    
                            <div class="panel-footer">
                            <a href="#">
                            
                                    <span class="pull-left">View More...</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                               </a>
                            </div>                          
                        </div>
                    </div>
                       <div class="col-lg-4 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-users fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                    
                                        <div><u>PARTICIPANTS</u></div>
                                    </div>
                                </div>
                            </div>    
                            <div class="panel-footer">
                            <a href="#">
                            
                                    <span class="pull-left">View More...</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                               </a>
                            </div>                          
                        </div>
                    </div>
		</div>
              
              <div class="col-lg-4" id="left">
                         THIS IS THE CONTENT PLACE
              </div>
              <div class="col-lg-4" id="copyHere">
                         THIS IS THE CONTENT PLACE 2
                         <label id="read"></label>
                         <label id="readit"></label>
              </div>
              <div class="col-lg-4">
                         THIS IS THE CONTENT PLACE 3
                         <h1 id="Titl"></h1>
                        <div id="third">
                      
                        </div>
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
