package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.stub.GrupoDestinatarioDaoStub;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GrupoDestinatario {
    
    @Id
    @Column(name = "ID_GRUPO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false, length = 3000, name = "NOME_GRUPO")

    private String nomeGrupo;

    public String getGrupo() {
        return nomeGrupo;
    }

    public void setGrupo(String grupo) {
        this.nomeGrupo = grupo;
    }

    public boolean isGrupoValido() {
        GrupoDestinatarioDaoStub grupoDestinatarioDao = new GrupoDestinatarioDaoStub();
        GrupoDestinatario grupo = grupoDestinatarioDao.obterGrupo(nomeGrupo);
        if (grupo != null) {
            return true;
        }
        return false;
    }

    public Collection retornarDestinatarios() {
        Usuario usuario = new Usuario();
        return usuario.obterUsuariosGrupo(this);
    }

    public boolean usuarioTemPermissaoEnvio(Usuario usuario) {
        GrupoDestinatarioDaoStub grupoDestinatarioDao = new GrupoDestinatarioDaoStub();
        Collection<GrupoDestinatario> listaGrupos = grupoDestinatarioDao.obterGruposDoUsuario(usuario);
        for (GrupoDestinatario grupoDestinatario : listaGrupos) {
            if (listaGrupos != null && grupoDestinatario.getGrupo().equals(nomeGrupo)) {
                return true;
            }
        }
        return false;
    }
}
