package br.ufg.inf.fabrica.mural.central.stub;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import java.util.ArrayList;
import java.util.Collection;

public class GrupoDestinatarioDaoStub {
    
    private Long idAux;
    private String nomeGrupoAux;
    
    public boolean verificaSeGrupoValido(Long id) {
        //Linha adicionada apenas para o Sonar nao reclamar
        //Ja que a logica nao sera implementada no Stub
        idAux = id;
        return true;
    }

    public GrupoDestinatario obterGrupo(String nomeGrupo) {
        //Linha adicionada apenas para o Sonar nao reclamar
        //Ja que a logica nao sera implementada no Stub
        nomeGrupoAux = nomeGrupo;
        return new GrupoDestinatario();
    }

    public Collection<GrupoDestinatario> obterGruposDoUsuario(Usuario usuario) {
        //Linha adicionada apenas para o Sonar nao reclamar
        //Ja que a logica nao sera implementada no Stub
        usuario.setLogin("teste");
        return new ArrayList<GrupoDestinatario>();
    }

   
    
}
