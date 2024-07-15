package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.shippingManager;

public final class shippingManagerPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Shipp</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 //shippingManager sm= request.getMethod("");
      out.write("\n");
      out.write("\n");
      out.write("        <div\n");
      out.write("            class=\"shadow-lg p-3 mb-5 bg-body-tertiary rounded\"\n");
      out.write("            style=\"width: 45%; margin: auto; margin-top: 5%; padding: 100px;\">\n");
      out.write("            <p class=\"text-center fs-2\">You need</p>\n");
      out.write("            <button class=\"btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded\" style=\"width: 30%;\">\n");
      out.write("                <svg\n");
      out.write("                    width=\"70\"\n");
      out.write("                    height=70\"\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    data-name=\"1\"\n");
      out.write("                    viewBox=\"0 0 128 128\"\n");
      out.write("                    id=\"start\">\n");
      out.write("                <path\n");
      out.write("                    d=\"M10 128a2 2 0 0 1-1-.27A2 2 0 0 1 8 126V2a2 2 0 0 1 3-1.73l108 62a2 2 0 0 1 0 3.46l-108 62a2 2 0 0 1-1 .27ZM12 5.45v117.1L114 64Z\"></path>\n");
      out.write("                </svg>\n");
      out.write("                <p class=\"fs-3\">Start</p></button\n");
      out.write("            >\n");
      out.write("            <a class=\"btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded\" style=\"width: 30%;\" href=\"\">\n");
      out.write("                <svg\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    width=\"70\"\n");
      out.write("                    height=\"70\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    id=\"cancel-circle\">\n");
      out.write("                <g\n");
      out.write("                    fill=\"none\"\n");
      out.write("                    stroke=\"#000\"\n");
      out.write("                    stroke-linecap=\"square\"\n");
      out.write("                    stroke-miterlimit=\"10\"\n");
      out.write("                    stroke-width=\"1.5\">\n");
      out.write("                <path\n");
      out.write("                    d=\"M21.999000000000002 12 A10 10 0 0 1 11.999 22 A10 10 0 0 1 1.9990000000000006 12 A10 10 0 0 1 21.999000000000002 12 z\"\n");
      out.write("                    transform=\"rotate(-35.782 12 12)\"></path>\n");
      out.write("                <path d=\"M14.266 9.739l-4.534 4.522M14.261 14.267L9.738 9.733\"></path>\n");
      out.write("                </g>\n");
      out.write("                </svg>\n");
      out.write("                <p class=\"fs-3\">End</p></a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
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
