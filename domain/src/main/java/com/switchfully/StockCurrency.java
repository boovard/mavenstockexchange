package com.switchfully;

public enum StockCurrency {

    EUR("Euro",'€'),
    USD("U.S. Dollar",'$'),
    GBP("British Pound",'£');

    private String label;
    private char symbol;

    StockCurrency(String label, char symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getLabel() {
        return label;
    }
}
