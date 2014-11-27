package br.ufg.inf.fabrica.mural.central.dominio;

import org.junit.Test;

public class SolicitacaoDestinatariosDeGrupoTest {
    
    @Test
    public void criaSolicitacao(){
        SolicitacaoDestinatariosDeGrupo sol = new SolicitacaoDestinatariosDeGrupo();
        sol.criaSolicitacao("loginTeste", "senhaTeste", new GrupoDestinatario());
    }
}
