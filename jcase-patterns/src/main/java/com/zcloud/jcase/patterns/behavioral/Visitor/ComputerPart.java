package com.zcloud.jcase.patterns.behavioral.Visitor;

public interface ComputerPart {
   void accept(ComputerPartVisitor computerPartVisitor);
}