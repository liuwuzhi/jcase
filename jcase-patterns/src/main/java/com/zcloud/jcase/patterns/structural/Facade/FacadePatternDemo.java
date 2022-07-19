package com.zcloud.jcase.patterns.structural.Facade;

public class FacadePatternDemo {
   public static void run() {
      ShapeMaker shapeMaker = new ShapeMaker();
 
      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();      
   }
}