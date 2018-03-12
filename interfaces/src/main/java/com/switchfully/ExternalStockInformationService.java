package com.switchfully;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockID){
        return new BigDecimal(10 + Math.random()*90);
    }
}
