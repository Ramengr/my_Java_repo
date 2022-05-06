package com.company;

public class SearchNumberInSortedArray {



  public int binarySearch(int [] arrayToBeSearched, int firstIndexPosition, int lastIndexPosition, int numberToBeSearched)
  {

      int mid = firstIndexPosition + (lastIndexPosition - firstIndexPosition) / 2;


      if (arrayToBeSearched[mid] == numberToBeSearched)
        return mid;

      else
      if (arrayToBeSearched[mid] > numberToBeSearched) {
        return binarySearch(arrayToBeSearched, firstIndexPosition, mid - 1, numberToBeSearched);
      }
      else if (arrayToBeSearched[mid] < numberToBeSearched) {
        return binarySearch(arrayToBeSearched, mid + 1, lastIndexPosition, numberToBeSearched);
      }
      else

      return -1;
  }

}
