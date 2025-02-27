package Controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProveedor
 */
public class ControladorProveedor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassProveedorImp crudimp = new ClassProveedorImp();
        TblProveedorcl2 tblprov = new TblProveedorcl2();
        List<TblProveedorcl2> listadoProveedores = crudimp.ListadoProveedor();
        request.setAttribute("listado", listadoProveedores);

        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "Modificar":
                    int cod = Integer.parseInt(request.getParameter("cod"));
                    tblprov.setIdproveedorcl2(cod);
                    TblProveedorcl2 prov = crudimp.BuscarProveedor(tblprov);
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                    request.setAttribute("codigo", prov.getIdproveedorcl2());
                    request.setAttribute("nombre", prov.getNomproveecl2());
                    request.setAttribute("razonsocial", prov.getRsocialproveecl2());
                    request.setAttribute("ruc", prov.getRucproveecl2());
                    request.setAttribute("email", prov.getEmailproveecl2());
                    request.setAttribute("fecha", format.format(prov.getFeingproveecl2()));
                    request.getRequestDispatcher("/FrmActualizarProveedor.jsp").forward(request, response);
                    break;

                case "Registrar":
                    request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);
                    break;

                case "Eliminar":
                    int codelim = Integer.parseInt(request.getParameter("cod"));
                    tblprov.setIdproveedorcl2(codelim);
                    crudimp.EliminarProveedor(tblprov);

                    List<TblProveedorcl2> listado = crudimp.ListadoProveedor();
                    request.setAttribute("listado", listado);
                    request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
                    break;

                case "Listar":
                    request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
                    break;
            }
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String razonsocial = request.getParameter("razonsocial");
        String ruc = request.getParameter("ruc");
        String email = request.getParameter("email");
        String fechaStr = request.getParameter("fecha");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = format.parse(fechaStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TblProveedorcl2 tblprov = new TblProveedorcl2();
        ClassProveedorImp climp = new ClassProveedorImp();

        tblprov.setNomproveecl2(nombre);
        tblprov.setRsocialproveecl2(razonsocial);
        tblprov.setRucproveecl2(ruc);
        tblprov.setEmailproveecl2(email);
        tblprov.setFeingproveecl2(fecha);

        if (codigo != null && !codigo.isEmpty()) {
            int cod = Integer.parseInt(codigo);
            tblprov.setIdproveedorcl2(cod);
            climp.ActualizarProveedor(tblprov);
        } else {
            climp.RegistrarProveedor(tblprov);
        }

        List<TblProveedorcl2> listado = climp.ListadoProveedor();
        request.setAttribute("listado", listado);
        request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
    }
}