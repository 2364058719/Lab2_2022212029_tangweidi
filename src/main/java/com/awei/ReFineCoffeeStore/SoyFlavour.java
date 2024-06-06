package com.awei.ReFineCoffeeStore;

/**
 * immutable
 */
public class SoyFlavour extends Flavour{

    /**
     * constructor 的一个实现，产生一个口味对象
     * @param name 口味名，不能为null
     * @param price 口味价格
     */
    public SoyFlavour(String name, int price) {
        super(name, price);
    }

    @Override
    public void describe() {
        System.out.println("SoyFlavour");
    }
}
