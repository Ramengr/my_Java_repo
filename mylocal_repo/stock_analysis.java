package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class stock_analysis {
String filepath = null;

stock_analysis(String path){
    filepath = path;
}
    // reads data from the excel file
    public List<String> read_data()
    {
        List<String> l1 = new ArrayList<String>();
        String str = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath));
            br.readLine() ;
            while((str = br.readLine()) != null){
                l1.add(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return l1;
    }

    public List<String> get_header() throws IOException {
        String[] s1 = new String[0];
        List<String> keys= new ArrayList<String>();
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(filepath));
            String str1 = br1.readLine();
            s1 = str1.split(",");

            keys = Arrays.asList(s1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return keys;
    }

}
