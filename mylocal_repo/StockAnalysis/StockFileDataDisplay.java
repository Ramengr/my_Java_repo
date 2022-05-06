
package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileDataDisplay {

  List<HashMap<String, Double>> stockDataInList = new LinkedList<>();

  // prints the contents of the list variables
  public void printDataInList() {
    System.out.println(stockDataInList);
  }

  public void transferMappedData(List<HashMap<String, Double>> MappedStockData) {
    stockDataInList = MappedStockData;
  }
}
