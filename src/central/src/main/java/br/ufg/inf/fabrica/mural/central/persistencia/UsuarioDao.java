package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import java.util.Collection;

public interface UsuarioDao {
    
    public Collection obterUsuariosGrupo(GrupoDestinatario grupoDestinatario);
    
}
