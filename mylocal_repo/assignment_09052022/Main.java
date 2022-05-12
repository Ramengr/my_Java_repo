package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here
    String inputString = "malayalam";
    palindrome_checker(inputString);
    inputString = "palindrome";
    palindrome_checker(inputString);

    List<Integer> inputList = new ArrayList<>(
        Arrays.asList(1, 10, 3, 4, 5, 7, 5, 8, 8, 2, 2, 4, 2, 3, 4, 3));
    System.out.println("Input list is:" + inputList);
    List<Integer> listWithoutDuplicates = duplicateValueInListRemover(inputList);
    System.out.println("List without duplicates is:" + listWithoutDuplicates);

    inputString = "sashankganti";
    System.out.println("input String is :" + inputString);
    System.out.println("occurences in the String as below:");
    characterOccurenceInStringCounter(inputString);

  }

  public static void palindrome_checker(String inputString) {
    String[] inputStringArray = inputString.split(",");
    for (int i = 0; i < inputStringArray.length; i++) {
      if (inputStringArray[i].equals(inputStringArray[inputStringArray.length - 1 - i])) {
        System.out.println(inputString + " is a palindrome");
      } else {
        System.out.println("input String is not a palindrome");
      }
    }

  }

  public static List<Integer> duplicateValueInListRemover(List<Integer> inputList) {
    List<Integer> listWithoutDuplicates = new ArrayList<>();
    for (Integer item : inputList) {
      if (!listWithoutDuplicates.contains(item)) {
        listWithoutDuplicates.add(item);
      }
    }
    return listWithoutDuplicates;
  }

  public static void characterOccurenceInStringCounter(String inputString) {
    int count = 0;
    List<Character> inputStringWithoutDuplicatesInList = new ArrayList<>();

    for (int i = 0; i < inputString.length(); i++) {
      if (!inputStringWithoutDuplicatesInList.contains(inputString.charAt(i))) {
        inputStringWithoutDuplicatesInList.add(inputString.charAt(i));
      }

    }

    for (int i = 0; i < inputStringWithoutDuplicatesInList.size(); i++) {
      for (int j = 0; j < inputString.length(); j++) {
        if (inputString.charAt(j) == inputStringWithoutDuplicatesInList.get(i)) {
          count++;
        }
      }

      System.out.println(inputStringWithoutDuplicatesInList.get(i) + " occurs " + count + " times");
      count = 0;

    }
  }


  public static void diamond_(int inputNumber){
    if(inputNumber>2){

    }

  }
}
