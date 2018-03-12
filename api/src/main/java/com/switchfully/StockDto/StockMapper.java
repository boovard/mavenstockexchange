package com.switchfully.StockDto;

import com.switchfully.Stock;

public class StockMapper {

    public StockDto mapStockToDto(Stock stockToMap){
        return new StockDto(stockToMap.getId(),stockToMap.getName(),stockToMap.getPriceToString());
    }

    public Stock mapDtoToStock(StockDto stockDtoToMap){
        return new Stock(stockDtoToMap.getId(), stockDtoToMap.getName(), stockDtoToMap.getPriceInBigDecimal());
    }
}
