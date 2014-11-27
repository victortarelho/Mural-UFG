package br.ufg.inf.fabrica.mural.central.stub;

import br.ufg.inf.fabrica.mural.central.dominio.CAS;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;

public class AutenticadorCASStub implements CAS{
    
    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public boolean validarCredencial(Usuario usuario){
        return true;
    }
    
}
