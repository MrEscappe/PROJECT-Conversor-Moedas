package br.com.jsergio.conversor.models;

import br.com.jsergio.conversor.services.ApiExchange;

public class DolarToReal {
    private String dolar;

    public DolarToReal(String dolar) {
        this.dolar = dolar;
    }


    public String convertToReal() throws Exception {
        ApiExchange apiExchange = new ApiExchange("USD", "BRL", dolar);
        return apiExchange.convert();
    }
}

