package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Login</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!--===============================================================================================-->\t\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"login/images/icons/favicon.ico\"/>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/animate/animate.css\">\r\n");
      out.write("<!--===============================================================================================-->\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/select2/select2.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"login/css/main.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script>\r\n");
      out.write("    \r\n");
      out.write("    function validate()\r\n");
      out.write("    {\r\n");
      out.write("         var user = document.forms[\"login\"][\"username\"].value;\r\n");
      out.write("         var pass = document.forms[\"login\"][\"pass\"].value;\r\n");
      out.write("         if (user == \"\") \r\n");
      out.write("         {\r\n");
      out.write("             alert(\"Username must be filled out\");\r\n");
      out.write("             return false;\r\n");
      out.write("         }\r\n");
      out.write("          \r\n");
      out.write("         if (pass == \"\")\r\n");
      out.write("         {\r\n");
      out.write("             alert(\"Password must be filled out\");\r\n");
      out.write("             return false;\r\n");
      out.write("         }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container-login100\" style=\"background-image: url('login/images/blah_1.jpg');\">\r\n");
      out.write("\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30\">\r\n");
      out.write("                    <form name=\"login\" class=\"login100-form validate-form\" action=\"login_Customer\" method=\"post\" onsubmit=\"return validate()\">\r\n");
      out.write("\t\t\t\t<span class=\"login100-form-title p-b-37\">\r\n");
      out.write("\t\t\t\t\tSign In\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("                        <font color = \"red\">\r\n");
      out.write("                        ");

                            if(null!=request.getAttribute("errorMessage"))
                            {
                                out.println(request.getAttribute("errorMessage"));
                                
                            }
                        
      out.write("\r\n");
      out.write("                        </font>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter username or email\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"username or email\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input m-b-25\" data-validate = \"Enter password\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input100\" type=\"password\" name=\"pass\" placeholder=\"password\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container-login100-form-btn\">\r\n");
      out.write("\t\t\t\t\t<button class=\"login100-form-btn\">\r\n");
      out.write("\t\t\t\t\t\tSign In\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"text-center p-t-57 p-b-20\">\r\n");
      out.write("\t\t\t\t\t<span class=\"txt1\">\r\n");
      out.write("\t\t\t\t\t\tOr login with\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"flex-c p-b-112\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"login100-social-item\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook-f\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"login100-social-item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"login/images/icons/icon-google.png\" alt=\"GOOGLE\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<a href=\"registerCustomer.jsp\" class=\"txt2 hov1\">\r\n");
      out.write("\t\t\t\t\t\tSign Up\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\r\n");
      out.write("\t\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/vendor/animsition/js/animsition.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"login/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/vendor/select2/select2.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/vendor/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("\t<script src=\"login/vendor/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/vendor/countdowntime/countdowntime.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"login/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
