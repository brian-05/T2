package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DaoImp.ClassUsuarioImp;
import model.TblUsuariocl2;

public class ControladorLogueo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        ClassUsuarioImp usuarioDao = new ClassUsuarioImp();
        TblUsuariocl2 usuarioEncontrado = usuarioDao.validarUsuario(usuario, password);

        if (usuarioEncontrado != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuarioEncontrado.getUsuariocl2());

            response.sendRedirect("MenuPrincipal.jsp");
        } else {
            response.sendRedirect("index.jsp?error=1");
        }
    }
}