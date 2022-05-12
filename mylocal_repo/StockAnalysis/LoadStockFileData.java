
package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadStockFileData {

  private final String filepath;

  LoadStockFileData(String path) {
    filepath = path;
  }


  public List<String> fileRowDataReader()
      throws IOException// name convention missed
  {
    List<String> stockParametervalues = new ArrayList<>();

    try (BufferedReader rowContentReader = new BufferedReader(new FileReader(filepath))) {
      //close connection missed
      rowContentReader.readLine();
      String rowContent;
      while ((rowContent = rowContentReader.readLine()) != null) {
        stockParametervalues.add(rowContent);
      }

    }

    return stockParametervalues;
  }


  public List<String> headerFromFilegetter() throws IOException {
    List<String> columnHeadings;
    try (BufferedReader columnHeadingReader = new BufferedReader(new FileReader(filepath))) {

      String columnHeadingsRow = columnHeadingReader.readLine();

      String[] columnHeadingsArray;
      columnHeadingsArray = columnHeadingsRow.split(",");

      columnHeadings = Arrays.asList(columnHeadingsArray);


    }

    return columnHeadings;
  }

}
