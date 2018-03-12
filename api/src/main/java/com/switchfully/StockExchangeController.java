package com.switchfully;

import com.switchfully.StockDto.StockDto;
import com.switchfully.StockDto.StockMapper;

public class StockExchangeController {

    public StockDto getStock(String stockId) {
        return new StockMapper().mapStockToDto(SingletonStockRepository.getInstance().getStockInformation(stockId));
    }
}
