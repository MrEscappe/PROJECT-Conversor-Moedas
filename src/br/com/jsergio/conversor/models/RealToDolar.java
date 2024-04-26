package br.com.jsergio.conversor.models;

import br.com.jsergio.conversor.services.ApiExchange;

public class RealToDolar {
    private String real;

    public RealToDolar(String real) {
        this.real = real;
    }

    public String convertToDolar() throws Exception{
        ApiExchange apiExchange = new ApiExchange("BRL", "USD", real);
        return apiExchange.convert();
    }
}
