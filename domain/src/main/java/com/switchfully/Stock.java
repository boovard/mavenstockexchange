package com.switchfully;

public class Stock {

    private String id;
    private String name;
    private StockPrice price;

    public Stock(String id, String name, StockPrice price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPriceToString() {
        return price.toString();
    }

    public String getId() {
        return id;
    }
}
