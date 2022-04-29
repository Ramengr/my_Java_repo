package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class stockfile_data {
    List<HashMap<String, Double>> data = new LinkedList<>();

    public void printdata(){
        System.out.println(data);
    }

    public void addData(List<HashMap<String, Double>> datain){
        data = datain;
    }
}
