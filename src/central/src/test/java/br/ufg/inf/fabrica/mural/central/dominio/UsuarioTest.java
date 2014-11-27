package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
    
    @Test
    public void obterUsuariosGrupo(){
        Usuario usuario = new Usuario();
        Collection colecao = usuario.obterUsuariosGrupo(new GrupoDestinatario());
        Assert.assertNotNull(colecao);
    }
    
}
