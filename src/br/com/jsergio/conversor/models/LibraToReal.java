package br.com.jsergio.conversor.models;

import br.com.jsergio.conversor.services.ApiExchange;

public class LibraToReal {
    private String libra;

    public LibraToReal(String libra) {
        this.libra = libra;
    }

    public String convertToReal() {
        ApiExchange apiExchange = new ApiExchange("GBP", "BRL", libra);
        return apiExchange.convert();
    }
}
