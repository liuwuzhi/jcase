package com.zcloud.jcase.patterns.structural.Facade;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}