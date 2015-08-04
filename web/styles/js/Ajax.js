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
                                        document.getElementById("radio").innerHTML=xmlhttp.responseText;
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
                                        //document.getElementById("radio").innerHTML=xmlhttp.responseText;
                                        document.getElementById("Option").innerHTML=xmlhttp.responseText;
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
                                        document.getElementById("Option").innerHTML=xmlhttp.responseText;
                                        //document.getElementById("Options").innerHTML=xmlhttp.responseText;
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
                                        document.getElementById("Option").innerHTML=xmlhttp.responseText;
                                        document.getElementById("radio").innerHTML=xmlhttp.responseText;
                                    }
                            }
                            xmlhttp.open("POST","Open",true);
                            xmlhttp.send(); 
                }
            }
            
            function duplicateDiv()
            {
                  var elmnt = document.getElementById("question1");
                    var cln = elmnt.cloneNode(true);
                    document.body.appendChild(cln);
            }
