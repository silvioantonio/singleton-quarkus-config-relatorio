package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

// Torna a classe em uma 'singleton'
@ApplicationScoped
public class Config {

    @ConfigProperty(name = "formatoRelatorios")
    private String formatoRelatorios = "pdf";

    @ConfigProperty(name = "tipoGraficos")
    private String formatoGraficos = "barras";

    public String getFormatoRelatorios () {
        return this.formatoRelatorios;
    }

    public String getFormatoGraficos () {
        return this.formatoGraficos;
    }

    public void setFormatoRelatorios (String valor) {
        this.formatoRelatorios = valor;
    }

    public void setFormatoGraficos (String valor) {
        this.formatoGraficos = valor;
    }

}