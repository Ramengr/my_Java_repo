package com.company;


public class Main {

  public static void main(String[] args) {
    // write your code here
    int[] inpSortedArray = {1, 2, 3, 4, 5, 6, 7, 9};
    int key = 9;
    int firstIndexPosition = 0;
    int lastIndexPosition = inpSortedArray.length - 1;

    SearchNumberInSortedArray search = new SearchNumberInSortedArray();

    int result = search.binarySearch(inpSortedArray, firstIndexPosition, lastIndexPosition, key);

    if (result == -1) {
      System.out.println("Number not found in the array");
    } else {
      System.out.println("number found in position:" + result);
    }

    System.out.println("Fibonocci Series:");
    fibonocci(6);

    Square s1 = new Square(2);
    s1.area();
    Rectangle r1 = new Rectangle(8, 9);
    r1.area();

    Triangle t1 = new Triangle(4, 8);
    t1.area();
    Circle c1 = new Circle(5);
    c1.area();

  }


  public static void fibonocci(int length) {
    int a, b, c;
    a = 0;
    b = 1;
    System.out.println("the first " + length + " terms of the fibonocci series are:");
    System.out.print(a + "\t" + b + "\t");
    for (int iter = 0; iter < length - 2; iter++) {
      //print in a single line
      c = a + b;
      System.out.print(c + "\t");
      a = b;
      b = c;
    }

    System.out.println();

  }


}
