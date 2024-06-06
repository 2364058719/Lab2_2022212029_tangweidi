package com.awei.ReFineCoffeeStore;

/**
 * mutable
 */
public class DecafCoffee extends Coffee{

    /**
     * constructor 的一个实现，产生一个咖啡对象
     * @param name 咖啡名，不能为null
     * @param price 咖啡价格
     */
    public DecafCoffee(String name, int price) {
        super(name, price);
    }

    @Override
    public void describe() {
        System.out.println("Decaf Coffee");
    }
}
