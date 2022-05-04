package com.company;
import static java.lang.Math.PI;

import java.lang.Math.*;
public class shape {

  public void area(int lengthOfSide){
    System.out.println("Area of square: "+(Math.pow(lengthOfSide, 2)));
  }
  public void area(int length, int breadth){
    System.out.println("Area of the rectangle is : "+(length*breadth*0.5));
  }

  public void area(float height, float base){
    System.out.println("Area of the triangle is : "+(base*height*0.5));
  }

  public void area(float radius){
    System.out.println("Area of the circle is: "+(2*PI*radius));}
}
