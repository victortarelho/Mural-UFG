package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import java.util.Collection;

public interface GrupoDestinatarioDao {
    
    public Collection obterGruposDoUsuario(Usuario usuario);
    
    public GrupoDestinatario obterGrupo(String nomeGrupo);
    
}
