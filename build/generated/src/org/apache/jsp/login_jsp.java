package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Lato:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"text-center container\" style=\"background: #232228; color: #c2c2c3; font-family: 'Lato'\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header class=\"py-3 text-center\">\n");
      out.write("                <h1 style=\"color: #c2c2c3\">Portal de gestión de suscripciones <i class=\"bi bi-card-text mx-2\"></i> </h1>\n");
      out.write("                <hr style=\"background-color: #f51d46; height: 5px\">\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-signin mx-5\">\n");
      out.write("            <form class=\"mt-4 px-5 pt-5 mx-5\" style=\"border-style: solid; border-color: #f51d46; background-color: #2a292f\">\n");
      out.write("                <h1 class=\"text-center\">Iniciar sesión</h1>\n");
      out.write("                <img class=\"d-block mx-auto my-5\" src=\"img/login_user.png\" alt=\"login_user\" style=\"height: 150px\" />\n");
      out.write("                <!-- USUARIO -->\n");
      out.write("                <div class=\"mb-3 w-50 mx-auto\">\n");
      out.write("                    <label class=\"form-label\">Usuario:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <!-- CONTRASEÑA -->\n");
      out.write("                <div class=\"mb-3 w-50 mx-auto\">\n");
      out.write("                    <label class=\"form-label\">Contraseña:</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-grid w-25 mx-auto\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-dark border-0 m-4 rounded\" style=\"background-color: #f51d46\">\n");
      out.write("                        Registrar\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <p class=\"mt-3 lead\">Si no se acuerda de su contraseña puede comunicarse con nuestra área de <a href=\"https://api.whatsapp.com/send?phone=34123456789&text=hola,%20qué%20tal?\">soporte al cliente.</a></p>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"py-3 text-center\" style=\"background-color: #1e2225\">\n");
      out.write("            <span class=\"text-muted\">\n");
      out.write("                Equipo Dinamita\n");
      out.write("            </span>\n");
      out.write("        </footer>\n");
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
