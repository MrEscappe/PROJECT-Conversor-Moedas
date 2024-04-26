package br.com.jsergio.conversor.models;

import br.com.jsergio.conversor.services.ApiExchange;

public class RealToLibra {
    private String real;

    public RealToLibra(String real) {
        this.real = real;
    }

    public String convertToLibra() {
        ApiExchange apiExchange = new ApiExchange("BRL", "GBP", real);
        return apiExchange.convert();
    }
}
