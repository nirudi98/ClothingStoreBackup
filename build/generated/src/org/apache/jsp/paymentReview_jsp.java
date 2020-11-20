package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class paymentReview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   ");

HttpSession s = request.getSession(true);
   
String id= request.getParameter("c_id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "clothingdb";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("                                                   \n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<h1>Check Out Details</h1>\n");
      out.write("<br>Customer ID:<input type=\"text\" name=\"c_id\">\n");
      out.write("<br><br><input type=\"submit\"value=\"check all\">\n");
      out.write("<br><br>\n");
      out.write("<table border=\"1\">\n");
      out.write("<tr> \n");
      out.write("<td>cartID</td>\n");
      out.write("<td>customerID</td>\n");
      out.write("<td>productName</td>\n");
      out.write("<td>size</td>\n");
      out.write("<td>color</td>\n");
      out.write("<td>amount</td>\n");
      out.write("<td>price</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("        \n");
      out.write(" ");
  

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb", "root", "");
Statement st=conn.createStatement();

String sql ="update payment set status=1 where c_id<=0";
statement.executeUpdate(sql);
ResultSet resultset = statement.executeQuery("select * from cart");

while(resultset.next()){ 


      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(resultSet.getString("cardID") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("customerID") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("productName") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("size") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("color") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("amount") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("price") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("           \n");
      out.write(" \n");
      out.write("<br>  <button> <a href=\"Review.jsp\">checkout Confirm</a></button>\n");
      out.write("\n");
      out.write("<button> <a href=\"product.html\">checkout Cancel</a></button> \n");
      out.write("</center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
