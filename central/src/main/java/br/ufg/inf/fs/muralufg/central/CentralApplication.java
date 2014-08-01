package br.ufg.inf.fs.muralufg.central;

import br.ufg.inf.fs.muralufg.central.versao.VersaoHealthCheck;
import br.ufg.inf.fs.muralufg.central.versao.VersaoResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CentralApplication extends Application<CentralConfiguration> {

    public static void main(String[] args) throws Exception {
        new CentralApplication().run(args);
    }

    @Override
    public String getName() {
        return "Central UFG";
    }

    @Override
    public void initialize(Bootstrap<CentralConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(CentralConfiguration configuracao,
                    Environment environment) {
        final VersaoResource versaoResource = new VersaoResource(
                configuracao.getTemplate(),
                configuracao.getDefaultName(),
                configuracao.getNome(),
                configuracao.getVersao()
        );

        environment.jersey().register(versaoResource);

        final VersaoHealthCheck healthCheck =
                new VersaoHealthCheck(configuracao.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(versaoResource);
    }
}
