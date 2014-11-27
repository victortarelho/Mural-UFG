package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.stub.UsuarioDaoStub;
import java.util.Collection;
import java.util.List;

public class Usuario {
    private long id;
    private String login;
    private String senha;
    private boolean apenasProdutor;
    private List<GrupoDestinatario> grupoDestinatario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isApenasProdutor() {
        return apenasProdutor;
    }

    public List<GrupoDestinatario> getGrupoDestinatario() {
        return grupoDestinatario;
    }

    public void setApenasProdutor(boolean apenasProdutor) {
        this.apenasProdutor = apenasProdutor;
    }
    
    public Collection obterUsuariosGrupo(GrupoDestinatario grupo){
       return new UsuarioDaoStub().obterUsuariosGrupo(grupo);
    }
}
