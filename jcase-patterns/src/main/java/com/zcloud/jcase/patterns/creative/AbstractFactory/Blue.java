package com.zcloud.jcase.patterns.creative.AbstractFactory;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}