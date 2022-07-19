package com.zcloud.jcase.patterns.behavioral.Mediator;

public class MediatorPatternDemo {
   public static void run() {
      User robert = new User("Robert");
      User john = new User("John");
 
      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}