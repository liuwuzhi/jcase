package com.zcloud.jcase.patterns.structural.Bridge;

public class BridgePatternDemo {
   public static void run() {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}