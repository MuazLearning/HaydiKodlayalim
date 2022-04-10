package com.haydikodlayalim.shoppingapp.product.domain;

public enum MoneyTypes {
    TL("Turk Lirasi", "TRY"),
    USD("Dolar", "$"),
    EUR("Euro", "€");

    private String label; // TL, USD, EUR
    private String symbol; // TL, $, €

    MoneyTypes(String label, String symbol) {
        this.label = name();
        this.symbol = name();
    }

}