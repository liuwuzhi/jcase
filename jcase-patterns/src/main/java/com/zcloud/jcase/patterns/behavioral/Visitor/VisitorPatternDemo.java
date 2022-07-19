package com.zcloud.jcase.patterns.behavioral.Visitor;

public class VisitorPatternDemo {
   public static void run() {
 
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}