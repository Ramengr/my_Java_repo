package com.company;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // write your code here
    //int[] unsortedArray = {6, 7, 3, 4, 2, 1, 9, 5};
    //int key = 9;
    //searchNumberInSortedArray(unsortedArray, key);

    System.out.println("Fibonocci Series:");
    fibonocci(6);

    shape s1 = new shape();
    s1.area(2);
    s1.area(3.5000f);
    s1.area(6, 4);
    s1.area(7.5f, 5.0f);


  }

  public static void searchNumberInSortedArray(int[] inputArray, int numberToBeSearched) {

    Arrays.sort(inputArray);
    int flag = 0;
    for (int iter = 0; iter < inputArray.length; iter++) {

      if (inputArray[iter] == numberToBeSearched) {
        System.out.println(
            numberToBeSearched + " is prsent in the array in index position:" + iter);
        flag = 1;
      }


    }
    if (flag == 0) {
      System.out.println("Number is not present in array ");


    }


  }

  public static void fibonocci(int length) {
    int a, b, c;
    a = 0;
    b = 1;
    System.out.println("the first " + length + " terms of the fibonocci series are:");
    System.out.println(a + "\n" + b + "\t");
    for (int iter = 0; iter < length - 2; iter++) {
      c = a + b;
      System.out.println(c + "\t");
      a = b;
      b = c;
    }


  }

  public static void displayDiamonds(int number) {
    if (number < 3) {
      System.out.println("Please enter a number bigger than 3");
    } else {
      for (int iter = 0; iter < number; iter++) {

      }
    }
  }

}
