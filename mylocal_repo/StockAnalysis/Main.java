

package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    // write your code here
    StockFileDataLoader s1 = new StockFileDataLoader("files/table.csv");
    StockFileDataDisplay d1 = new StockFileDataDisplay();

    List<HashMap<String, Double>> mappedDatainList = mapStockDataInList(s1.getHeaderFromFile(),
        s1.readFileRowData());
    d1.transferMappedData(mappedDatainList);
    d1.printDataInList();


  }

  public static List<HashMap<String, Double>> mapStockDataInList(List<String> columnHeadersList,
      List<String> stockParameterValueslist) {
    List<HashMap<String, Double>> mappedStockData = new ArrayList<>();
    for (String line : stockParameterValueslist) {

      String[] s1 = line.split(",");
      HashMap<String, Double> hmap = new HashMap<>();
      int cnt = 0;
      for (String str : s1) {
        double d1 = Double.parseDouble(str);
        hmap.put(columnHeadersList.get(cnt), d1);
        cnt++;
      }
      mappedStockData.add(hmap);
    }
    return mappedStockData;
  }

}