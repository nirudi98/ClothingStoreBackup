package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" \n");
      out.write("\n");

String cartid=request.getParameter("cart");
int num=Integer.parseInt(cartid);
Double p = Double.parseDouble(request.getParameter("price"));
String size=request.getParameter("size");
String col=request.getParameter("color");
int amount=Integer.parseInt(request.getParameter("num-product"));
Double tot = p*amount;
String total = String.valueOf(tot);

      out.write("\n");
      out.write("\n");
      out.write("<h1>");
      out.print( cartid );
      out.write("</h1>\n");
      out.write("<h1>");
      out.print( p );
      out.write("</h1>\n");
      out.write("<h1>");
      out.print( size );
      out.write("</h1>\n");
      out.write("<h1>");
      out.print( col );
      out.write("</h1>\n");
      out.write("<h1>");
      out.print( total );
      out.write("</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


try{
Class.forName("com.mysql.jdbc.Driver");
          Connection   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
          Statement st=null;
st=c.createStatement();
st.executeUpdate("update cart set size='"+size+"',color='"+col+"',amount="+amount+",price='"+tot+"' where cartID='"+num+"'");
response.sendRedirect("shopping-cart.jsp");
}
catch(Exception e){
System.out.println(e);
}

      out.write('\n');
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
