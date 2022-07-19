package com.zcloud.jcase.patterns.behavioral.Command;

/**
 * 实现了 Order 接口的实体类
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}