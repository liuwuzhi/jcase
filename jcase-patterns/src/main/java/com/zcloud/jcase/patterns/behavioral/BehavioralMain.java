package com.zcloud.jcase.patterns.behavioral;

import com.zcloud.jcase.patterns.behavioral.ChainOfResponsibility.ChainPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Command.CommandPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Interpreter.InterpreterPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Iterator.IteratorPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Mediator.MediatorPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Memento.MementoPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Observer.ObserverPatternDemo;
import com.zcloud.jcase.patterns.behavioral.State.StatePatternDemo;
import com.zcloud.jcase.patterns.behavioral.Strategy.StrategyPatternDemo;
import com.zcloud.jcase.patterns.behavioral.Template.TemplatePatternDemo;
import com.zcloud.jcase.patterns.behavioral.Visitor.VisitorPatternDemo;

public class BehavioralMain {
    public static void main(String[] args) {
        // 责任链模式
        ChainPatternDemo.run();

        // 命令模式
        CommandPatternDemo.run();

        // 解释器模式
        InterpreterPatternDemo.run();

        // 迭代器模式
        IteratorPatternDemo.run();

        // 中介者模式
        MediatorPatternDemo.run();

        // 备忘录模式
        MementoPatternDemo.run();

        // 观察者模式
        ObserverPatternDemo.run();

        // 状态模式
        StatePatternDemo.run();

        // 策略模式
        StrategyPatternDemo.run();

        // 模板模式
        TemplatePatternDemo.run();

        // 访问者模式
        VisitorPatternDemo.run();
    }
}
