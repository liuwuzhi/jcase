package com.zcloud.jcase.patterns.structural;

import com.zcloud.jcase.patterns.structural.Adapter.AdapterPatternDemo;
import com.zcloud.jcase.patterns.structural.Bridge.BridgePatternDemo;
import com.zcloud.jcase.patterns.structural.Composite.CompositePatternDemo;
import com.zcloud.jcase.patterns.structural.Decorator.DecoratorPatternDemo;
import com.zcloud.jcase.patterns.structural.Facade.FacadePatternDemo;
import com.zcloud.jcase.patterns.structural.Flyweight.FlyweightPatternDemo;
import com.zcloud.jcase.patterns.structural.Proxy.ProxyPatternDemo;

public class Structural {
    public static void main(String[] args) {
        // 适配器模式
        AdapterPatternDemo.run();

        // 桥接模式
        BridgePatternDemo.run();

        // 组合模式
        CompositePatternDemo.run();

        // 装饰器模式
        DecoratorPatternDemo.run();

        // 外观模式
        FacadePatternDemo.run();

        // 享元模式
        FlyweightPatternDemo.run();

        // 代理模式
        ProxyPatternDemo.run();
    }
}
