package com.awei.ReFineCoffeeStore;

public interface CoffeeFactory {
    /**
     * 根据工厂，返回对应的咖啡对象
     * @return 返回咖啡对象
     */
    public Coffee getCoffee();
}
