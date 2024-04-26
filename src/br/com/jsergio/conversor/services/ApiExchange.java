package br.com.jsergio.conversor.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class ApiExchange {
    String baseCurrency;
    String targetCurrency;
    String amount;
    String API_KEY = "420ad9ad14e1c7cfb1d765c2";
    String URL;

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();


    public ApiExchange(String baseCurrency, String targetCurrency, String amount) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
        this.URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + baseCurrency + "/" + targetCurrency + "/" + amount;

    }

    public String convert() {

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ConversionRate conversionRate = gson.fromJson(response.body(), ConversionRate.class);
            DecimalFormat df = new DecimalFormat("0.00");
            return "A conversão de " +"[" + amount +" "+ conversionRate.getBase_code() + "]"
                    + " equivale a " + "[" + df.format(conversionRate.getConversion_result())
                    + " " + conversionRate.getTarget_code() + "]";
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}