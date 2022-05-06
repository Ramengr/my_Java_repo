package com.company;
import java.lang.Math;
public class Circle implements Shapes{
  private int radius;

  Circle(int radius){
    this.radius = radius;
  }


  public void area() {
    System.out.println("area of circle with radius :"+(radius)+" is : "+(2*Math.PI*radius));
  }
}
