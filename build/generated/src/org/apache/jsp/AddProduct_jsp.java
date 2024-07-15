package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <title>Add Product</title\n");
      out.write("    </head>\n");
      out.write("   <body style=\"background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;\n");
      out.write("          background-size: cover;\" >\n");
      out.write("        \n");
      out.write("         <div\n");
      out.write("            class=\"shadow-lg p-3 mb-5 bg-body-tertiary rounded\"\n");
      out.write("            style=\"width: 45%; margin: auto; margin-top: 5%; padding: 100px; font-family: sans-serif; border: 1px solid #0dcaf0;\">\n");
      out.write("        <h1 class=\"text-center fs-2\">Add Product </h1>\n");
      out.write("        <form action=\"AddProductController\" method=\"get\">\n");
      out.write("            \n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">product ID</span>\n");
      out.write("                <input type=\"text\"name=\"prodID\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">product Name</span>\n");
      out.write("                <input type=\"text\"name=\"prodName\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">product Color</span>\n");
      out.write("                <input type=\"text\"name=\"prodColor\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">product Price</span>\n");
      out.write("                <input type=\"text\"name=\"prodPrice\"\n");
      out.write("                       class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\">\n");
      out.write("            </div>\n");
      out.write("             <!--: <input type=\"text\"name=\"prodID\"><br><br>-->\n");
      out.write("<!--            product Name : <input type=\"text\"name=\"prodName\"><br><br>\n");
      out.write("            product Color: <input type=\"text\"name=\"prodColor\"><br><br>\n");
      out.write("            product Price: <input type=\"text\"name=\"prodPrice\"><br><br>\n");
      out.write("            -->\n");
      out.write("      \n");
      out.write("             <input class=\"btn btn-outline-info m-auto d-flex justify-content-center\" type=\"submit\" value=\"Add Product\">  \n");
      out.write("              </form>\n");
      out.write("       </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("       \n");
      out.write("         <!--<a href=\"Product.jsp\"><input type=\"submit\" name=\"\" value=\"Product\"></a>-->\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
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
