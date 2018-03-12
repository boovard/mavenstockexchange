package com.switchfully.StockDto;

import com.switchfully.StockCurrency;
import com.switchfully.StockPrice;

import java.math.BigDecimal;

public class StockDto {

    private String id;
    private String name;
    private String price;

    public StockDto(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public StockPrice getPriceInBigDecimal() {
        return new StockPrice(convertStringToBigDecimal(),convertStringToCurrency());
    }

    private BigDecimal convertStringToBigDecimal() {
        String[] stringParts = getPrice().split(" ");
        String numberPart = stringParts[0];
        return new BigDecimal(numberPart);
    }

    private StockCurrency convertStringToCurrency() {
        String[] stringParts = getPrice().split(" ");
        String currencyPart = stringParts[1];
        if (currencyPart.equals("$")) {
            return StockCurrency.USD;
        } else if (currencyPart.equals("€")) {
            return StockCurrency.EUR;
        } else if (currencyPart.equals("£")) {
            return StockCurrency.GBP;
        } else throw new IllegalArgumentException("Currency invalid");

    }
}
