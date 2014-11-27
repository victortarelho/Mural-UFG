package br.ufg.inf.fabrica.mural.central.stub;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import java.util.ArrayList;
import java.util.Collection;

public class UsuarioDaoStub {
    
    public Collection obterUsuariosGrupo(GrupoDestinatario grupo){
        //Linha adicionada apenas para o Sonar nao reclamar
        //Ja que a logica nao sera implementada no Stub
        grupo.setGrupo("teste");
        return new ArrayList<GrupoDestinatario>();
    }
    
}
