package com.awei.ReFineCoffeeStore;

public class DecafCoffeeFactory implements CoffeeFactory{
    /*
     * Abstraction function:
     * AF(null) = 产生Decaf的工厂
     *
     * Representation invariant:
     * 该工厂返回的都是Decaf咖啡对象
     *
     * Safety from rep exposure:
     * 不存在表示泄露
     */
    @Override
    public Coffee getCoffee() {
        return new DecafCoffee("Decaf", 3);
    }
}
