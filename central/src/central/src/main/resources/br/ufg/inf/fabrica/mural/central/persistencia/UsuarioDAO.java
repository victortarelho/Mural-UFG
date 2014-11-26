/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuarioDAO {
    
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            factory = Persistence.createEntityManagerFactory("br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU");
            entityManager = factory.createEntityManager();
        } finally {
            //   factory.close();
        }
        return entityManager;
    }
    
    public Collection obterUsuariosGrupo(GrupoDestinatario grupoDestinatario){
        EntityManager em = getEntityManager();
        Collection usuarios = null;
        em.getTransaction().begin();
        
        usuarios = em.createQuery("select u from Usuario u where "+grupoDestinatario.getId()+" in (select grupo.id from u.GrupoDestinatario grupo )").getResultList();
        
        return usuarios;
    }
}
