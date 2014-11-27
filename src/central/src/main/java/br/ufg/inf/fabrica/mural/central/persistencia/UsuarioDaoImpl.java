package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuarioDaoImpl implements UsuarioDao{

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        factory = Persistence.createEntityManagerFactory("br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU");
        entityManager = factory.createEntityManager();
        return entityManager;
    }

    public Collection obterUsuariosGrupo(GrupoDestinatario grupoDestinatario) {
        EntityManager em = getEntityManager();
        Collection usuarios = null;
        em.getTransaction().begin();
        usuarios = em.createQuery("select u from Usuario u where " + grupoDestinatario.getId() + " in (select grupo.id from u.GrupoDestinatario grupo )").getResultList();
        return usuarios;
    }
}
