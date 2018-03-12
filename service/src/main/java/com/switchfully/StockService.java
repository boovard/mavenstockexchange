package com.switchfully;

public class StockService {

    public Stock getStock(String stockId) {
        return SingletonStockRepository.getInstance().getStockInformation(stockId);
    }
}
