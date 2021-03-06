package com.zcloud.jcase.patterns.structural.Decorator;

public class DecoratorPatternDemo {
   public static void run() {
 
      Shape circle = new Circle();
 
      Shape redCircle = new RedShapeDecorator(new Circle());
 
      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();
 
      System.out.println("\nCircle of red border");
      redCircle.draw();
 
      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}