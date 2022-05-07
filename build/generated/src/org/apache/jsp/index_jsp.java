package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Portal de recordatorios</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Lato:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: #232228; color: #c2c2c3; font-family: 'Lato'\">\n");
      out.write("        <!-- \n");
      out.write("        #####################\n");
      out.write("        Header\n");
      out.write("        -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header class=\"py-3 text-center\">\n");
      out.write("                <h1 style=\"color: #c2c2c3\">Portal de gestión de suscripciones <i class=\"bi bi-card-text mx-2\"></i> </h1>\n");
      out.write("                <hr style=\"background-color: #f51d46; height: 5px\">\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <!-- \n");
      out.write("        #####################\n");
      out.write("        Columnas\n");
      out.write("        -->\n");
      out.write("        <div class=\"container px-4\">\n");
      out.write("            <div class=\"row gx-5\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"p-3\">\n");
      out.write("                        <!-- PRIMERA COLUMNA -->\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                                <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3 form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"p-3\">\n");
      out.write("                        <!-- SEGUNDA COLUMNA -->\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                                <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3 form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"p-3\">\n");
      out.write("                        <!-- \n");
      out.write("                        --------------------------\n");
      out.write("                        TERCERA COLUMNA\n");
      out.write("                        -->\n");
      out.write("                        <form class=\"mt-2 px-5 pt-3 rounded-3 text-center\" style=\"border-style: solid; border-color: #f51d46;background-color: #2a292f\">\n");
      out.write("                            <!--\n");
      out.write("                            #####################\n");
      out.write("                            Registar suscripción\n");
      out.write("                            -->\n");
      out.write("                            <p class=\"text-center fs-2 mb-4\">Registrar suscripción</p>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p class=\"form-label\">Seleccione una suscripción:</p>\n");
      out.write("                                <select class=\"form-select border-0 border-success\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                                    <option selected>Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">HBO</option>\n");
      out.write("                                    <option value=\"2\">Hostinger</option>\n");
      out.write("                                    <option value=\"3\">Display plus</option>\n");
      out.write("                                    <option value=\"4\">Spotify</option>\n");
      out.write("                                    <option value=\"5\">Amazon Prime Video</option>\n");
      out.write("                                    <option value=\"6\">Tidal</option>\n");
      out.write("                                    <option value=\"7\">Edelnor</option>\n");
      out.write("                                    <option value=\"8\">Udemy</option>\n");
      out.write("                                    <option value=\"9\">Udemy</option>\n");
      out.write("                                </select>\n");
      out.write("                                <p class=\"mt-2\">o agregue el suyo</p>\n");
      out.write("                                <input type=\"text\" class=\"form-control border-0\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                            </div>\n");
      out.write("                            <!--\n");
      out.write("                            #####################\n");
      out.write("                            Categoria \n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p class=\"form-label\">Categoria:</p>\n");
      out.write("                                <select class=\"form-select border-0 border-success\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                                    <option selected>Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">Música</option>\n");
      out.write("                                    <option value=\"2\">Hosting</option>\n");
      out.write("                                    <option value=\"3\">Educación</option>\n");
      out.write("                                    <option value=\"4\">Entretenimiento</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!--\n");
      out.write("                            #####################\n");
      out.write("                            Inicio de suscripción\n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p>Inicio de suscripción:</p>\n");
      out.write("                                <input type=\"date\" name=\"dateinicio\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                            </div>\n");
      out.write("                            <!--\n");
      out.write("                            #####################\n");
      out.write("                            Ciclo\n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p>Ciclo:</p>\n");
      out.write("                                <select class=\"form-select border-0 border-success\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                                    <option selected>Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">Mensual</option>\n");
      out.write("                                    <option value=\"2\">Semanal</option>\n");
      out.write("                                    <option value=\"3\">Bimestral</option>\n");
      out.write("                                    <option value=\"4\">Trimestral</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- \n");
      out.write("                            #####################\n");
      out.write("                            Fin de la suscripción\n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p>Fin de la suscripción</p>\n");
      out.write("                                <input type=\"date\" name=\"dateinicio\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- \n");
      out.write("                            #####################\n");
      out.write("                            Recordatorio\n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p>Recordatorio:</p>\n");
      out.write("                                <select class=\"form-select border-0 border-success\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                                    <option selected>Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">1 día antes</option>\n");
      out.write("                                    <option value=\"2\">2 día antes</option>\n");
      out.write("                                    <option value=\"3\">3 días antes</option>\n");
      out.write("                                    <option value=\"4\">4 días antes</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!--\n");
      out.write("                            #####################\n");
      out.write("                            Moneda\n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p>Moneda:</p>\n");
      out.write("                                <select class=\"form-select border-0 border-success\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                                    <option selected>Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">Soles</option>\n");
      out.write("                                    <option value=\"2\">Dólar</option>\n");
      out.write("                                    <option value=\"3\">Euro</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- \n");
      out.write("                            #####################\n");
      out.write("                            Precio de la suscripción \n");
      out.write("                            -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <p>Precio de la suscripción:</p>\n");
      out.write("                                <input type=\"number\" class=\"form-control border-0\" style=\"background-color: #232228; color: #acafb9\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-dark border-0 m-4 rounded\" style=\"background-color: #f51d46\">\n");
      out.write("                                Registrar\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- \n");
      out.write("        #####################\n");
      out.write("        Footer\n");
      out.write("        -->\n");
      out.write("        <footer class=\"py-3 text-center\" style=\"background-color: #1b1a1f\">\n");
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
