package com.zcloud.jcase.patterns.creative;

import com.zcloud.jcase.patterns.creative.AbstractFactory.AbstractFactoryPatternDemo;
import com.zcloud.jcase.patterns.creative.Builder.BuilderPatternDemo;
import com.zcloud.jcase.patterns.creative.FactoryMethod.FactoryPatternDemo;
import com.zcloud.jcase.patterns.creative.Prototype.PrototypePatternDemo;
import com.zcloud.jcase.patterns.creative.Singleton.SingletonPatternDemo;

public class CreativeMain {
    public static void main(String[] args) {
        // 抽象工厂模式
        AbstractFactoryPatternDemo.run();

        // 构建器模式
        BuilderPatternDemo.run();

        // 工厂方法模式
        FactoryPatternDemo.run();

        // 原型模式
        PrototypePatternDemo.run();

        // 单例模式
        SingletonPatternDemo.run();
    }
}
