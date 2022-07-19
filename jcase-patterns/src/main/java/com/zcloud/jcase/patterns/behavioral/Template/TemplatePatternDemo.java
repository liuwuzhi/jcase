package com.zcloud.jcase.patterns.behavioral.Template;

public class TemplatePatternDemo {
   public static void run() {
 
      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();      
   }
}