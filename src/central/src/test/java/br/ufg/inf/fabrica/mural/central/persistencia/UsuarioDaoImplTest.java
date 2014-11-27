package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;

public class UsuarioDaoImplTest {
    
    UsuarioDaoImpl usuarioImpl = new UsuarioDaoImpl();

    public void obterUsuariosGrupo() {
        Usuario usuario = new Usuario();
        GrupoDestinatario grupo = new GrupoDestinatario();
        grupo.setId(1);
        grupo.setGrupo("Engenharia de Software");
        usuarioImpl.obterUsuariosGrupo(grupo);
    }
}
