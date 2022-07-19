package com.zcloud.jcase.patterns.creative.FactoryMethod;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}