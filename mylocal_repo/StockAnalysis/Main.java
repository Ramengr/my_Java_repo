

package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws IOException {
    // write your code here
    LoadStockFileData s1 = new LoadStockFileData("files/table.csv");
    StockFileDataDisplay d1 = new StockFileDataDisplay();

    List<HashMap<String, Double>> mappedDatainList = mappingStockDataInList(s1.headerFromFilegetter(),
        s1.fileRowDataReader());
    d1.transferMappedData(mappedDatainList);
    d1.printDataInList();


  }

  public static List<HashMap<String, Double>> mappingStockDataInList(List<String> columnHeadersList,
      List<String> stockParameterValueslist) {
    List<HashMap<String, Double>> mappedStockData = new ArrayList<>();

    for (String line : stockParameterValueslist) {

      String[] s1 = line.split(",");
      HashMap<String, Double> headerValueMapVariable = new HashMap<>();
      AtomicInteger cnt = new AtomicInteger(0);

      Stream.of(s1)
          .map(x -> Double.parseDouble(x))
          .forEach(x -> headerValueMapVariable.put(columnHeadersList.get(cnt.getAndIncrement()), x));
      mappedStockData.add(headerValueMapVariable);
    }

    return mappedStockData;
  }

}
