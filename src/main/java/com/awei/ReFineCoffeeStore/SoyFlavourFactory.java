package com.awei.ReFineCoffeeStore;

public class SoyFlavourFactory implements FlavourFactory{
    /*
     * Abstraction function:
     * AF(null) = 产生Soy的工厂
     *
     * Representation invariant:
     * 该工厂返回的都是Soy调料对象
     *
     * Safety from rep exposure:
     * 不存在表示泄露
     */

    @Override
    public Flavour getFlavour() {
        return new SoyFlavour("Soy",1);
    }
}
