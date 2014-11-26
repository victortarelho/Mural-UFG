package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.persistencia.GrupoDestinatarioDAO;

import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrupoDestinatario {
    @Id
    private Long id;
    
    String grupo;
    
    private List<Usuario> usuarios;

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public Collection obterUsuariosGrupo(GrupoDestinatario grupoDestinatario) {
        GrupoDestinatarioDAO grupoDestinatarioDao = new GrupoDestinatarioDAO();
        return grupoDestinatarioDao.obterUsuarioGrupo(grupoDestinatario);
    }

    public boolean usuarioTemPermissaoEnvio(Usuario usuario) {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
