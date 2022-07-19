package com.zcloud.jcase.patterns.structural.Facade;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}