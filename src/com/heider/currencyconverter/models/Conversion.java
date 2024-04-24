package com.heider.currencyconverter.models;


import com.heider.currencyconverter.api.ExchangeRateAPI;

import java.util.List;

public class Conversion {
    private String fromCurrency = "USD";

    public double calculateAmount(String fromCurrency, String toCurrency, double amount) {
        this.fromCurrency = fromCurrency;
        ExchangeRateAPI c = new ExchangeRateAPI();
        Response response = c.getExchangeRate(fromCurrency);
        double rate = response.conversion_rates().get(toCurrency.toUpperCase());
        return (amount*rate);
    }

    public List<String> possible(){
        ExchangeRateAPI c = new ExchangeRateAPI();
        Response response = c.getExchangeRate(fromCurrency);
        return response.getCurrencyAbbreviations();
    }

}
