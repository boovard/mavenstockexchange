package com.switchfully;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SingletonStockRepository {

    private Map<String, Stock> stockDatabase;

    private static SingletonStockRepository instance = null;

    private SingletonStockRepository() {
        this.stockDatabase = new HashMap<String, Stock>();
        stockDatabase.put("AA", new Stock("AA", "Ambro AN", new StockPrice(new BigDecimal(48.52), StockCurrency.USD)));
        stockDatabase.put("MSFT", new Stock("MSFT","Microsoft", new StockPrice(new BigDecimal(96.41), StockCurrency.USD)));
        stockDatabase.put("AAPL", new Stock("AAPL", "Apple Inc.", new StockPrice(new BigDecimal(181.78), StockCurrency.USD)));
    }

    public static SingletonStockRepository getInstance(){
        if (instance == null){
            instance = new SingletonStockRepository();
        }
        return instance;
    }

   private Map<String, Stock> getStockDatabase(){
        return Collections.unmodifiableMap(stockDatabase);
   }

   public Stock getStockInformation(String stockID){
        return getStockDatabase().get(stockID);
   }
}
