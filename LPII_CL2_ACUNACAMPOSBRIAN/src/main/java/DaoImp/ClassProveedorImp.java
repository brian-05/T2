package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

    @Override
    public void RegistrarProveedor(TblProveedorcl2 tblproveedor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ACUNACAMPOSBRIAN");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(tblproveedor);
        System.out.println("Proveedor registrado en BD correctamente!!!!!!");
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void ActualizarProveedor(TblProveedorcl2 tblproveedor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ACUNACAMPOSBRIAN");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(tblproveedor);
        System.out.println("Datos del proveedor actualizados correctamente");
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void EliminarProveedor(TblProveedorcl2 tblproveedor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ACUNACAMPOSBRIAN");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TblProveedorcl2 tblprov = em.find(TblProveedorcl2.class, tblproveedor.getIdproveedorcl2());
        if (tblprov != null) {
            em.remove(tblprov);
            System.out.println("Proveedor eliminado correctamente");
        } else {
            System.out.println("Proveedor no encontrado");
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<TblProveedorcl2> ListadoProveedor() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ACUNACAMPOSBRIAN");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<TblProveedorcl2> listadoProveedores = em.createQuery("SELECT p FROM TblProveedorcl2 p", TblProveedorcl2.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return listadoProveedores;
    }

    @Override
    public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ACUNACAMPOSBRIAN");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TblProveedorcl2 tblprov = em.find(TblProveedorcl2.class, tblproveedor.getIdproveedorcl2());
        em.getTransaction().commit();
        em.close();
        return tblprov;
    }
}