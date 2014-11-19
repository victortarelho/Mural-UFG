package br.ufg.inf.fabrica.mural.central.dominio;

public class AutenticadorCAS implements CAS{
    
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
