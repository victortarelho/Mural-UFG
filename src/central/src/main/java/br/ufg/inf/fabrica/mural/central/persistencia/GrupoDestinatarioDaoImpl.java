package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GrupoDestinatarioDaoImpl implements GrupoDestinatarioDao {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        factory = Persistence.createEntityManagerFactory("br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU");
        entityManager = factory.createEntityManager();

        return entityManager;
    }

    @Override
    public Collection obterGruposDoUsuario(Usuario usuario) {
        EntityManager em = getEntityManager();
        Collection grupos = null;
        grupos = em.createQuery("select grupo from GrupoDestinatario grupo where " + usuario.getId() + " in (select usuario.id from grupo.usuarios usuario)").getResultList();
        return grupos;
    }

    @Override
    public GrupoDestinatario obterGrupo(String nomeGrupo) {
        EntityManager em = getEntityManager();
        GrupoDestinatario grupoDestinatario = new GrupoDestinatario();
        grupoDestinatario.setGrupo(nomeGrupo);
        grupoDestinatario = em.find(GrupoDestinatario.class, grupoDestinatario);
        return grupoDestinatario;
    }
}
