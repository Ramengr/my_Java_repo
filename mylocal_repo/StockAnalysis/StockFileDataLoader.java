
package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileDataLoader {

  private final String filepath;

  StockFileDataLoader(String path) {
    filepath = path;
  }


  public List<String> readFileRowData() // name convention missed
  {
    List<String> stockParametervalues = new ArrayList<>();

    BufferedReader rowContentReader;

    try {// implement same with try with resource
      rowContentReader = new BufferedReader(new FileReader(filepath));//close connection missed
      rowContentReader.readLine();
      String rowContent;
      while ((rowContent = rowContentReader.readLine()) != null) {
        stockParametervalues.add(rowContent);
      }

    } catch (IOException e) {
      System.out.println("details presented in incorrect format");

    }

    return stockParametervalues;
  }


  public List<String> getHeaderFromFile() throws IOException {
    List<String> columnHeadings = new ArrayList<String>();
    try {
      BufferedReader columnHeadingReader = new BufferedReader(new FileReader(filepath));
      String columnHeadingsRow = columnHeadingReader.readLine();

      String[] columnHeadingsArray;
      columnHeadingsArray = columnHeadingsRow.split(",");

      columnHeadings = Arrays.asList(columnHeadingsArray);


    } catch (FileNotFoundException e) {
      System.out.println("data not in correct format");
    }

    return columnHeadings;
  }

}
