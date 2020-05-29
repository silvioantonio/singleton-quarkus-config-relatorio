package org.acme;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/config")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConfigResource {

    // Sera chamada apaenas uma instancia do objeto(SINGLETON) durante todo o ciclo de vida da aplicação
    @Inject
    Config config;

    @GET
    public Config getConfig() {
        return config;
    }

    @PUT
    public void updateConfig(Config newConfig) {
        // Devemos copiar os valores dos atributos de newConfig para dentro de config
        // config.setFormatoGraficos(newConfig.getFormatoGraficos());
        // config.setFormatoRelatorios(newConfig.getFormatoRelatorios());
        this.config = newConfig;
    }

}