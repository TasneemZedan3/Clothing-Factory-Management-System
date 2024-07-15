package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .btn-login {\n");
      out.write("                font-size: 0.9rem;\n");
      out.write("                letter-spacing: 0.05rem;\n");
      out.write("                padding: 0.75rem 1rem;\n");
      out.write("            }   \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;\n");
      out.write("          background-size: cover;\">\n");
      out.write("<!--        <h1>Welcome to Firewood's System</h1>\n");
      out.write("        <p> please login to your account:</p>\n");
      out.write("        <form action=\"userController\" method=\"get\">\n");
      out.write("\n");
      out.write("            User Name:<input type=\"text\" name=\"Uname\"><br>\n");
      out.write("            Password: <input type=\"text\" name=\"Upass\"><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Submit\"><br>\n");
      out.write("        </form>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"height: 90vh !important;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-9 col-md-7 col-lg-5 mx-auto\">\n");
      out.write("                    <div class=\"card border-0 shadow rounded-3 my-4\">\n");
      out.write("                        <img src=\"https://ucarecdn.com/d2d5ab06-41e5-4dae-8d10-490802933dc6/-/preview/500x500/-/quality/smart_retina/-/format/auto/\" style=\"height: 250px;\">\n");
      out.write("                        <div class=\"card-body p-0 p-sm-5\">\n");
      out.write("                            <h5 class=\"card-title text-center mb-3 fw-light fs-3\">Welcome to Firewood's System</h5>\n");
      out.write("                            <h5 class=\"card-title text-center mb-5 fw-light fs-5\">login to your account</h5>\n");
      out.write("                            <form action=\"userController\" method=\"get\">\n");
      out.write("                                <div class=\"form-floating mb-3\">\n");
      out.write("                                    <input type=\"text\" name=\"Uname\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\">\n");
      out.write("                                    <label for=\"floatingInput\">User Name</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-floating mb-3\">\n");
      out.write("                                    <input type=\"text\" name=\"Upass\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Password\">\n");
      out.write("                                    <label for=\"floatingPassword\">Password</label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"d-grid mt-5\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info btn-login text-uppercase fw-bold\" value=\"Sign in\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
