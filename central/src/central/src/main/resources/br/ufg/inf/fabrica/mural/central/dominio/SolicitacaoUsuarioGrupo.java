package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.Collection;

public class SolicitacaoUsuarioGrupo {

    private AutenticadorCAS autenticadorCAS;
    private Usuario usuario;

    public SolicitacaoUsuarioGrupo() {
        this.autenticadorCAS = new AutenticadorCAS();
    }

    Collection obterUsuariosGrupo(String login, String senha, 
            String grupoDestinatario) {
        Usuario usuario = new Usuario();
        GrupoDestinatario grupo = new GrupoDestinatario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        grupo.setGrupo(grupoDestinatario);

        boolean usuarioValido = autenticadorCAS.validarCredencial(usuario);
        if (usuarioValido) {
            return grupo.obterUsuariosGrupo(grupo);
        } else {
            return null;
        }
    }
}
