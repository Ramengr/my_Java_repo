package com.company;

public class Square implements Shapes {
  private int side;
  Square(int side){
    this.side = side;
  }
  public void area(){
    System.out.println("Area of the swuare with side :"+side+" is : "+(side*side));
  }


}
