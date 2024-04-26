package br.com.jsergio.conversor.models;

import br.com.jsergio.conversor.services.ApiExchange;

public class RealToEuro {
    private String real;

    public RealToEuro(String real) {
        this.real = real;
    }

    public String convertToEuro() throws Exception {
        ApiExchange apiExchange = new ApiExchange("BRL", "EUR", real);
        return apiExchange.convert();
    }
}
