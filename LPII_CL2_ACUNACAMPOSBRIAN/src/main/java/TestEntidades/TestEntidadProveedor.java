package TestEntidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestEntidadProveedor {

    public static void main(String[] args) {
        TblProveedorcl2 tbl = new TblProveedorcl2();
        ClassProveedorImp crudimp = new ClassProveedorImp();

        //*********TESTEANDO EL METODO REGISTRAR*******
        tbl.setNomproveecl2("Nuevo Proveedor");
        tbl.setRucproveecl2("12345678901");
        tbl.setRsocialproveecl2("Nuevo Proveedor S.A.C.");
        tbl.setEmailproveecl2("nuevo@proveedor.com");
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = format.parse("2023-10-01");
            tbl.setFeingproveecl2(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        crudimp.RegistrarProveedor(tbl);
        System.out.println("Proveedor registrado correctamente.");

        //*********TESTEANDO EL METODO ACTUALIZAR*******
        tbl.setIdproveedorcl2(1); 
        tbl.setNomproveecl2("Proveedor Actualizado");
        tbl.setRucproveecl2("98765432109");
        tbl.setRsocialproveecl2("Proveedor Actualizado S.A.C.");
        tbl.setEmailproveecl2("actualizado@proveedor.com");
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = format.parse("2023-11-01");
            tbl.setFeingproveecl2(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        crudimp.ActualizarProveedor(tbl);
        System.out.println("Proveedor actualizado correctamente.");

        //*********TESTEANDO EL METODO BUSCAR*******
        tbl.setIdproveedorcl2(1); // 
        TblProveedorcl2 buscaprov = crudimp.BuscarProveedor(tbl);
        if (buscaprov != null) {
            System.out.println("Proveedor encontrado: " + buscaprov.getNomproveecl2() + " - " + buscaprov.getRsocialproveecl2());
        } else {
            System.out.println("Proveedor no encontrado.");
        }

        //*********TESTEANDO EL METODO ELIMINAR*******
        tbl.setIdproveedorcl2(1); //
        crudimp.EliminarProveedor(tbl);
        System.out.println("Proveedor eliminado correctamente.");

        //*********TESTEANDO EL METODO LISTADO*******
        List<TblProveedorcl2> listadoproveedores = crudimp.ListadoProveedor();
        for (TblProveedorcl2 prov : listadoproveedores) {
            System.out.println("ID: " + prov.getIdproveedorcl2() + " - Nombre: " + prov.getNomproveecl2() + 
                               " - RUC: " + prov.getRucproveecl2() + " - Razón Social: " + prov.getRsocialproveecl2() +
                               " - Email: " + prov.getEmailproveecl2() + " - Fecha de Ingreso: " + prov.getFeingproveecl2());
        }
    }
}