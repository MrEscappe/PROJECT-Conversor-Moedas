package br.com.jsergio.conversor.services;

public class ConversionRate {

        private String base_code;
        private String target_code;
        private double conversion_result;

    public String getBase_code() {
        return base_code;
    }
    public String getTarget_code() {
        return target_code;
    }
    public double getConversion_result() {
        return conversion_result;
    }

    public ConversionRate(String base_code, String target_code, double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_result = conversion_result;

    }
}
