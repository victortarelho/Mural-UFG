package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

public class GrupoDestinatarioTest {
    
    @Test
    public void isGrupoValido(){
        GrupoDestinatario grupo = new GrupoDestinatario();
        boolean grupoValido = grupo.isGrupoValido();
        Assert.assertEquals(grupoValido, true);
    }
    
    @Test
    public void retornarDestinatarios(){
        GrupoDestinatario grupo = new GrupoDestinatario();
        Collection colecao = grupo.retornarDestinatarios();
        Assert.assertNotNull(colecao);
    }
    
    @Test
    public void usuarioTemPermissaoEnvio(){
         GrupoDestinatario grupo = new GrupoDestinatario();
         boolean usuarioTemPermissao = grupo.usuarioTemPermissaoEnvio(new Usuario());
         Assert.assertEquals(usuarioTemPermissao, true);
    }
    
}
