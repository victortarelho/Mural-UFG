package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.stub.AutenticadorCASStub;

public class SolicitacaoDestinatariosDeGrupo {

    private Usuario usuario;

    public void criaSolicitacao(String login, String senha, 
            GrupoDestinatario grupoDestinatario) {
        usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        
        new AutenticadorCASStub().validarCredencial(usuario);
        
        grupoDestinatario.isGrupoValido();
        grupoDestinatario.usuarioTemPermissaoEnvio(usuario);
        grupoDestinatario.retornarDestinatarios();

    }
}
