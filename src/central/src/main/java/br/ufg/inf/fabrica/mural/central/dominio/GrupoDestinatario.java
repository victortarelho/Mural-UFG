package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.stub.GrupoDestinatarioDaoStub;

import java.util.Collection;

public class GrupoDestinatario {

    private String nomeGrupo;

    public String getGrupo() {
        return nomeGrupo;
    }

    public void setGrupo(String grupo) {
        this.nomeGrupo = grupo;
    }

    public boolean isGrupoValido() {
        GrupoDestinatarioDaoStub grupoDestinatarioDao = new GrupoDestinatarioDaoStub();
        GrupoDestinatario grupo = grupoDestinatarioDao.obterGrupo(nomeGrupo);
        if (grupo != null) {
            return true;
        }
        return false;
    }

    public Collection retornarDestinatarios() {
        Usuario usuario = new Usuario();
        return usuario.obterUsuariosGrupo(this);
    }

    public boolean usuarioTemPermissaoEnvio(Usuario usuario) {
        GrupoDestinatarioDaoStub grupoDestinatarioDao = new GrupoDestinatarioDaoStub();
        Collection<GrupoDestinatario> listaGrupos = grupoDestinatarioDao.obterGruposDoUsuario(usuario);
        for (GrupoDestinatario grupoDestinatario : listaGrupos) {
            if (listaGrupos != null && grupoDestinatario.getGrupo().equals(nomeGrupo)) {
                return true;
            }
        }
        return false;
    }
}
