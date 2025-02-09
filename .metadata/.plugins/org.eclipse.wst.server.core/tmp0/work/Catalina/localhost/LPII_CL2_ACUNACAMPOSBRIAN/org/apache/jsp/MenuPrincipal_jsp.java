/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2025-02-09 09:25:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TblProveedorcl2;
import java.util.*;

public final class MenuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Listado de Proveedores</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffb233\r\n");
      out.write("\">\r\n");
      out.write("<h1 align=\"center\">Listado de Proveedores</h1>\r\n");
      out.write("<h2 align=\"center\">\r\n");
      out.write("    <a href=\"ControladorProveedor?accion=Registrar\" style=\"text-decoration: none\">Registrar Proveedor</a>\r\n");
      out.write("</h2>\r\n");
      out.write("<table align=\"center\" border=\"2\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Código</td>\r\n");
      out.write("        <td>Nombre</td>\r\n");
      out.write("        <td>Razón Social</td>\r\n");
      out.write("        <td>RUC</td>\r\n");
      out.write("        <td>Email</td>\r\n");
      out.write("        <td>Fecha de Ingreso</td>\r\n");
      out.write("        <td colspan=\"2\" align=\"center\">Acciones</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

    List<TblProveedorcl2> listadoProveedores = (List<TblProveedorcl2>) request.getAttribute("listado");

    if (listadoProveedores != null) {

        for (TblProveedorcl2 prov : listadoProveedores) {
    
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>");
      out.print(prov.getIdproveedorcl2());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(prov.getNomproveecl2());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(prov.getRsocialproveecl2());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(prov.getRucproveecl2());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(prov.getEmailproveecl2());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(prov.getFeingproveecl2());
      out.write("</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <a href=\"ControladorProveedor?accion=Modificar&cod=");
      out.print(prov.getIdproveedorcl2());
      out.write("\"\r\n");
      out.write("               style=\"text-decoration:none\">Actualizar</a>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <a href=\"ControladorProveedor?accion=Eliminar&cod=");
      out.print(prov.getIdproveedorcl2());
      out.write("\"\r\n");
      out.write("               style=\"text-decoration:none\">Eliminar</a>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

        } 
    } 
    
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
