package com.heider.currencyconverter.api;

import com.google.gson.Gson;
import com.heider.currencyconverter.models.Response;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {

    public Response getExchangeRate(String fromCurrency) {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/9da6a7ede69ce48cd10817eb/latest/"+fromCurrency.toUpperCase());

        try {
            HttpResponse<String> response;
            try (HttpClient client = HttpClient.newHttpClient()) {
                HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
            }

            return (new Gson().fromJson(response.body(), Response.class));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
