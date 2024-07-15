package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productManagerPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Product</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;\n");
      out.write("          background-size: cover;\">  \n");
      out.write("        <div\n");
      out.write("            class=\"shadow-lg p-3 mb-5 bg-body-tertiary rounded\"\n");
      out.write("            style=\"width: 45%; margin: auto; margin-top: 5%; padding: 100px;\">\n");
      out.write("        <h1 class=\"text-center fs-2\">Product</h1>            \n");
      out.write("            \n");
      out.write("        <form action=\"\" method=\"get\">\n");
      out.write("            <!--    <input type=\"submit\" value=\"Remove product\">-->\n");
      out.write("            <a class=\"btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded\" style=\"width: 30%;\" href=\"removeProduct.jsp\" >Remove product<a/>\n");
      out.write("<!--                <a href=\"removeProduct.jsp\"><input type=\"submit\" value=\"Remove product\"></a>-->\n");
      out.write("            <!--<input type=\"submit\" value=\"Add product\">-->\n");
      out.write("            <a class=\"btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded\" style=\"width: 30%;\" href=\"AddProduct.jsp\">Add product<a/>\n");
      out.write("            <!--<input type=\"submit\" value=\"Edit product\">-->\n");
      out.write("            <a class=\"btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded\" style=\"width: 30%;\" href=\"EditProduct.jsp\" >Edit product<a/>\n");
      out.write("        </form>\n");
      out.write("            <form action=\"ProductController\" method=\"get\" style=\"display: contents\">\n");
      out.write("            <input class=\"btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded\" style=\"width: 30%;\" type=\"submit\" value=\"Show product\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
