package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        stock_analysis s1 = new stock_analysis("files/table.csv");
        stockfile_data d1 = new stockfile_data();
        //List<String> headers = new ArrayList<String>();
        List<HashMap<String, Double>> temp = new ArrayList<>();
        temp =disp_data(s1.get_header(),s1.read_data());
        d1.addData(temp);
        d1.printdata();


    }

    public static List<HashMap<String, Double>> disp_data(List<String> str_arr,List<String> lines)
    {
        List<HashMap<String, Double>> hmap_list = new ArrayList<>();
        for(String line : lines){

            String[] s1 = line.split(",");
            HashMap<String , Double> hmap = new HashMap<>();
            int cnt = 0;
            for(String str : s1){
                double d1 = Double.parseDouble(str);
                hmap.put(str_arr.get(cnt),d1);
                cnt++;
            }
            hmap_list.add(hmap);
        }
        return hmap_list;
    }

}
