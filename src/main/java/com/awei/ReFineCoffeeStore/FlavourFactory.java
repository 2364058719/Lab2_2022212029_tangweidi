package com.awei.ReFineCoffeeStore;

public interface FlavourFactory {
    /**
     * 根据工厂，返回对应的口味对象
     * @return 返回口味对象
     */
    public Flavour getFlavour();
}
