package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class GrupoDestinatarioDaoImplTest {
    
    private static GrupoDestinatarioDaoImpl grupoDestImpl;
    
    @Test
    public void obterGrupo() {
        GrupoDestinatario grupo = new GrupoDestinatario();
        grupo.setGrupo("Engenharia de Software");
        Assert.assertNotNull(grupo);
    }
    
    @Test
    public void obterGruposDoUsuario(){
        Usuario usuario = new Usuario();
        usuario.setLogin("usuario");
        usuario.setId(1);
        GrupoDestinatario grupo = new GrupoDestinatario();
        grupo.setGrupo("Engenharia de Software");
        grupoDestImpl.obterGruposDoUsuario(usuario);
        
    }
    
}
