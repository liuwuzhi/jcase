package com.zcloud.jcase.patterns.creative.FactoryMethod;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}