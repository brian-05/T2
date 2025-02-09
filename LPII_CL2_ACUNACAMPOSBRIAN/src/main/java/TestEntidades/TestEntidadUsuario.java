package TestEntidades;

import DaoImp.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

    public static void main(String[] args) {
        ClassUsuarioImp usuarioDao = new ClassUsuarioImp();

        //*********TESTEANDO EL METODO VALIDAR USUARIO*******
        String usuario = "admin"; 
        String password = "123456"; 
        TblUsuariocl2 usuarioEncontrado = usuarioDao.validarUsuario(usuario, password);

        if (usuarioEncontrado != null) {
            System.out.println("Usuario válido: " + usuarioEncontrado.getUsuariocl2());
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}