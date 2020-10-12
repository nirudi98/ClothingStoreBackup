package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form name=\"itemtocart\" action=\"\" method=\"post\">\n");
      out.write("\t<div class=\"wrap-modal1 js-modal1 p-t-60 p-b-20\">\n");
      out.write("\t\t<div class=\"overlay-modal1 js-hide-modal1\"></div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"bg0 p-t-60 p-b-30 p-lr-15-lg how-pos3-parent\">\n");
      out.write("\t\t\t\t<button class=\"how-pos3 hov3 trans-04 js-hide-modal1\">\n");
      out.write("\t\t\t\t\t<img src=\"images/icons/icon-close.png\" alt=\"CLOSE\">\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-lg-7 p-b-30\">\n");
      out.write("\t\t\t\t\t\t<div class=\"p-l-25 p-r-30 p-lr-0-lg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-slick3 flex-sb flex-w\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrap-slick3-dots\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrap-slick3-arrows flex-sb-m flex-w\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slick3 gallery-lb\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/product-detail-01.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrap-pic-w pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/product-detail-01.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04\" href=\"images/product-detail-01.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-expand\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/product-detail-02.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrap-pic-w pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/product-detail-02.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04\" href=\"images/product-detail-02.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-expand\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/product-detail-03.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrap-pic-w pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/product-detail-03.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04\" href=\"images/product-detail-03.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-expand\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-lg-5 p-b-30\">\n");
      out.write("\t\t\t\t\t\t<div class=\"p-r-50 p-t-5 p-lr-0-lg\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"mtext-105 cl2 js-name-detail p-b-14\">\n");
      out.write("\t\t\t\t\t\t\t\tLightweight Jacket\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                         <p id=\"price\" class=\"mtext-106 cl2\"> Rs. 3000/= </p>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p class=\"stext-102 cl3 p-t-23\">\n");
      out.write("\t\t\t\t\t\t\t\tthis lightweight jacket is made from denim and has a light blue color. Very popular among youngesters.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"p-t-33\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"flex-w flex-r-m p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"size-203 flex-c-m respon6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tSize\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"size-204 respon6-next\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"rs1-select2 bor8 bg0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"js-select2\" name=\"size\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option>Choose an option</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"small\">Size S</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"medium\">Size M</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"large\">Size L</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"extra large\">Size XL</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"dropDownSelect2\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"flex-w flex-r-m p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"size-203 flex-c-m respon6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tColor\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"size-204 respon6-next\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"rs1-select2 bor8 bg0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"js-select2\" name=\"color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option>Choose an option</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"red\">Red</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"blue\">Blue</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"white\">White</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option name=\"grey\">Grey</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"dropDownSelect2\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"flex-w flex-r-m p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"size-204 flex-w flex-m respon6-next\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrap-num-product flex-w m-r-20 m-tb-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fs-16 zmdi zmdi-minus\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"mtext-104 cl3 txt-center num-product\" type=\"number\" name=\"num-product\" value=\"1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fs-16 zmdi zmdi-plus\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("                                                                            <input type=\"submit\" name=\"Add to cart\"  class=\"flex-c-m stext-101 cl0 size-101 bg1 bor1 hov-btn1 p-lr-15 trans-04 js-addcart-detail\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
