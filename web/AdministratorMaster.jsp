<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <script>
            function addForm()
            {
                var title=document.getElementById("titleText").value;
                document.getElementById("hh").innerHTML = title;
                
            }
            function AddTitle()
            {
                var tit=document.getElementById("titleR").value;
                document.getElementById("Titl").innerHTML=tit;
            }
            
            function CheckType()
            {
                var tpe=document.getElementById("type").value;
                //alert(tpe);
                if(tpe=="One Word")
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
                                        document.getElementById("read").innerHTML=xmlhttp.responseText;
                                        //document.getElementById("Options").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("GET","CreateForm",true);
                            xmlhttp.send(); 
                }
                else if(tpe=="Open Ended")
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
                                        document.getElementById("readit").innerHTML=xmlhttp.responseText;
                                        document.getElementById("read").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("POST","CreateForm",true);
                            xmlhttp.send(); 
                }
            }
            function ContinueType()
            {
                var jok=document.getElementById("ewe").value;
                if (jok=="True/False")
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
                                        document.getElementById("readit").innerHTML=xmlhttp.responseText;
                                        document.getElementById("read").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("GET","Open",true);
                            xmlhttp.send(); 
                }
                else if (jok=="Options")
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
                                        document.getElementById("readit").innerHTML=xmlhttp.responseText;
                                        document.getElementById("read").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("POST","Open",true);
                            xmlhttp.send(); 
                }
            }
            
            function duplicateDiv()
            { 
                var i=1;
               
                  var elmnt = document.getElementById("question0");
                    var cln = elmnt.cloneNode(true);
                    cln.id="Question"+i;
                    document.body.appendChild(cln); 
                    i++;
            }
            function createForm1()
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
                            xmlhttp.open("POST","CreateForm11",true);
                            xmlhttp.send();  
            }
            function createForm2()
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
                                        document.getElementById("rigt").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("GET","CreateForm11",true);
                            xmlhttp.send();
            }
            function ewe()
            { 
                var check=document.getElementById('titleR').value;
                if(check=="")
                {
                    alert("Please Enter Your title the click proceed");
                }
                else
                {
                    this.createForm1();
                    //this.addTt();
                    this.copyDiv();
                    //this.createForm2();
                    document.getElementById('Titl').innerHTML=document.getElementById('titleR').innerHTML;
                }
            }
           
            function copyDiv()
            {
                document.getElementById('copyHere').innerHTML=document.getElementById('rigt').innerHTML;
                
            }
             function copyDiv2()
            {
                document.getElementById('copyHere2').innerHTML=document.getElementById('copyHere2').innerHTML+document.getElementById('copyHere').innerHTML;
                document.getElementById('titleR').disabled=true;
                 document.getElementById('titleR').value="";
                 document.getElementById('Titl').value="";
            }
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
                            xmlhttp.open("GET","AddTitle",true);
                            xmlhttp.send();
            }
                
        </script>
        <style>
           .left{
                //margin-left: 5%;
                float: left;
               //position:absolute; 
               //top: 10px; 
               //left: 5px;
               
            }
            .rigt{
                border: solid #cc0000 thin;
                width: 40%;
               float: right;
                text-align: left;
                //margin-right: 0%;
                height: 100%;
                visibility: hidden;     
            }
            #Question1{
                border: blue solid thin;
                width: 20%;
                visibility: hidden;
            }
        </style> 
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
          <li><a href="#" onclick="addTt()"><i class="fa fa-cubes"></i><span class="badge pull-right" ></span><u>CREATE POLL</u></a></li>
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
                            
                                <span class="pull-left" onclick="addTt()">View More...</span>
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
              
             <div class="col-lg-4">
                 <div id="left">
                         THIS IS THE CONTENT PLACE 1
                  </div>
             </div>
              <div class="col-lg-4" >
                  <div id="copyHere">
                      THIS IS THE CONTENT PLACE 2
                         
                  </div>
                  
                 
               </div>
              <div class="col-lg-4" >
                  <h1 id="Titl"></h1>
                  <div id="copyHere2">
                      
                  </div>
                 
               </div>
               <div class="rigt" id="rigt">
               <h1 id="Titl">Form Title</h1>
              <div id="question0">
            
            <label id="hh">Question</label><br/>
             <label id="readit"></label><br/>
            <label id="reader"></label><br/>
            <label id="Options" ></label><br/>
            <label id="Options1" ></label><br/>
           
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
