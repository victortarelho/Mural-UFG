package br.ufg.inf.fs.muralufg.central.identificacao;

import br.ufg.inf.fs.muralufg.central.api.CentralIdentificacao;
import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Identifica a Central e fornece a versão correspondente.
 */
@Path("/identificacao")
@Produces(MediaType.APPLICATION_JSON)
public class VersaoResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    private final String nome;
    private final String versao;

    public VersaoResource(String template, String defaultName, String nome, String versao) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
        this.nome = nome;
        this.versao = versao;
    }

    @GET
    @Timed
    public CentralIdentificacao sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        return new CentralIdentificacao(counter.incrementAndGet(), value, nome, versao);
    }
}
