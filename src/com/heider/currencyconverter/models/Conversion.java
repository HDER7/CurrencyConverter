package com.heider.currencyconverter.models;


import com.heider.currencyconverter.api.ExchangeRateAPI;

import java.util.List;

public class Conversion {

    public double calculateAmount(String fromCurrency, String toCurrency, double amount) {
        ExchangeRateAPI c = new ExchangeRateAPI();
        Response response = c.getExchangeRate(fromCurrency);
        double rate = response.conversion_rates().get(toCurrency.toUpperCase());
        return (amount*rate);
    }

    public List<String> possible(){
        ExchangeRateAPI c = new ExchangeRateAPI();
        Response response = c.getExchangeRate("USD");
        return response.getCurrencyAbbreviations();
    }

}
