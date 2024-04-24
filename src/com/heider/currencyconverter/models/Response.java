package com.heider.currencyconverter.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record Response(Map<String,Double> conversion_rates) {
    public List<String> getCurrencyAbbreviations() {
        List<String> Abbreviations;
        Abbreviations = new ArrayList<>(conversion_rates.keySet());
        return Abbreviations;
    }
}
