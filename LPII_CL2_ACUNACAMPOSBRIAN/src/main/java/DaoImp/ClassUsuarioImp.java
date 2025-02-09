package DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario {

    @Override
    public TblUsuariocl2 validarUsuario(String usuario, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ACUNACAMPOSBRIAN");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :usuario AND u.passwordcl2 = :password", TblUsuariocl2.class);
        query.setParameter("usuario", usuario);
        query.setParameter("password", password);
        
        try {
            TblUsuariocl2 usuarioEncontrado = (TblUsuariocl2) query.getSingleResult();
            return usuarioEncontrado;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
}