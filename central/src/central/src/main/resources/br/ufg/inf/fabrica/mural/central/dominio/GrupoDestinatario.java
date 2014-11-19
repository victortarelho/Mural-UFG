package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.persistencia.GrupoDestinatarioDAO;

import java.util.Collection;

public class GrupoDestinatario {
    
    String grupo;

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
}
