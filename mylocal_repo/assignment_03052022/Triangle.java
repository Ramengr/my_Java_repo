package com.company;



public class Triangle implements Shapes {

  private int base, height;

  Triangle(int base, int height){
    this.base = base;
    this.height = height;
  }


  public void area(){
    System.out.println("Area of the triangle with base: "+base+", and height:"+height+" is :"+(base*height*0.5));
  }


}
