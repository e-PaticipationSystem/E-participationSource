package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdministratorMaster_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Audience Participation Project</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">        \r\n");
      out.write("     <link rel=\"stylesheet\" href=\"styles/css/templatemo_main.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("         <div class=\"navbar navbar-inverse\">\r\n");
      out.write("      <div class=\"navbar-header\">\r\n");
      out.write("        <div class=\"logo\"><h1>ADMINISTRATOR PANE</h1></div>        \r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("       <div class=\"template-page-wrapper\">\r\n");
      out.write("         <div class=\"navbar-collapse collapse templatemo-sidebar\">\r\n");
      out.write("        <ul class=\"templatemo-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <form class=\"navbar-form\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"templatemo_search_box\">\r\n");
      out.write("              <span class=\"btn btn-default\">Go</span>\r\n");
      out.write("            </form>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"active\"><a href=\"#\"><i class=\"fa fa-home\"></i>Dashboard</a></li>         \r\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-cubes\"></i><span class=\"badge pull-right\"></span><u>CREATE POLL</u></a></li>\r\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-map-marker\"></i><span class=\"badge pull-right\"></span><u>MY SESSIONS</u></a></li>\r\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-users\"></i><span class=\"badge pull-right\"></span><u>PARTICIPANTS</u></a></li>\r\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-cog\"></i>SETTINGS</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </div><!--/.navbar-collapse -->\r\n");
      out.write("      <div class=\"templatemo-content-wrapper\">\r\n");
      out.write("          <div class=\"templatemo-content\">\r\n");
      out.write("              \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-primary\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-comments fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                  \r\n");
      out.write("                                        <div><u>POLLS</u></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <div class=\"panel-footer\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                            \r\n");
      out.write("                                    <span class=\"pull-left\">View More...</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                               </a>\r\n");
      out.write("                            </div>                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                       <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-primary\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-refresh fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                     \r\n");
      out.write("                                        <div><u>SESSIONS</u></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <div class=\"panel-footer\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                            \r\n");
      out.write("                                    <span class=\"pull-left\">View More...</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                               </a>\r\n");
      out.write("                            </div>                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                       <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-primary\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-users fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                    \r\n");
      out.write("                                        <div><u>PARTICIPANTS</u></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <div class=\"panel-footer\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                            \r\n");
      out.write("                                    <span class=\"pull-left\">View More...</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                               </a>\r\n");
      out.write("                            </div>                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"col-lg-4\">\r\n");
      out.write("                         THIS IS THE CONTENT PLACE\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-lg-4\">\r\n");
      out.write("                         THIS IS THE CONTENT PLACE 2\r\n");
      out.write("              </div>\r\n");
      out.write("               <div class=\"col-lg-4\">\r\n");
      out.write("                         THIS IS THE CONTENT PLACE 3\r\n");
      out.write("              </div>\r\n");
      out.write("   \r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("     <footer class=\"templatemo-footer\">\r\n");
      out.write("        <div class=\"templatemo-copyright\">\r\n");
      out.write("          <p>Copyright &copy; Accenture Group Project - 2015</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("    <script src=\"styles/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"styles/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"styles/js/Chart.min.js\"></script>\r\n");
      out.write("    <script src=\"styles/js/templatemo_script.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"></script>\r\n");
      out.write("     </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
