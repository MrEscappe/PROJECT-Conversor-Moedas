package br.com.jsergio.conversor.models;

import br.com.jsergio.conversor.services.ApiExchange;

public class EuroToReal {
    private String euro;

    public EuroToReal(String euro) {
        this.euro = euro;
    }

    public String convertToReal() throws Exception {
        ApiExchange apiExchange = new ApiExchange("EUR", "BRL", euro);
        return apiExchange.convert();
    }
}
