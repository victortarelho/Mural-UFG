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
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<CentralConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(CentralConfiguration configuration,
                    Environment environment) {
        final VersaoResource resource = new VersaoResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);

        final VersaoHealthCheck healthCheck =
                new VersaoHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}
