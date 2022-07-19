package com.zcloud.jcase.patterns.behavioral.Observer;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}