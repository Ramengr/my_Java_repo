package com.company;

public class Rectangle implements Shapes {

  private int length, breadth;

  Rectangle(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
  }

  public void area(){
    System.out.println("Area of rectangle with length : "+length+", breadth : "+breadth+" is :"+(length*breadth));
  }
}
