package com.awei.ReFineCoffeeStore;

/**
 * mutable咖啡店对象
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory = new DecafCoffeeFactory();
    private FlavourFactory flavourFactory = new SoyFlavourFactory();

    /*
     * Abstraction function:
     * AF(coffeeFactory,flavourFactory) = 生产咖啡和生产调料的咖啡店
     *
     * Representation invariant:
     * coffeeFactory和flavourFactory指向一个特定的工厂，不为null
     *
     * Safety from rep exposure:
     * 用private修饰对象，防止外部调用、访问该field
     */

    /**
     * 设置咖啡工厂
     * @param coffeeFactory 需要设置的咖啡工厂
     */
    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    /**
     * 设置口味工厂
     * @param flavourFactory 需要设置的口味工厂
     */
    public void setFlavourFactory(FlavourFactory flavourFactory) {
        this.flavourFactory = flavourFactory;
    }

    /**
     * 点咖啡
     * @return 返回当前咖啡工厂类型的咖啡对象
     */
    public Coffee orderCoffee() {
        return coffeeFactory.getCoffee();
    }

    /**
     * 向指定咖啡加入调料
     * @param coffee 不为null，需要添加调料的咖啡
     * @return 返回添加完调料的咖啡
     */
    public Coffee orderFlavour(Coffee coffee) {
//        assert coffee != null;
        checkRep(coffee);
        Flavour flavour = flavourFactory.getFlavour();
        coffee.addFlavour(flavour.getName());
        coffee.addPrice(flavour.getPrice());
        return coffee;
    }

    private void checkRep(Coffee coffee){
        assert coffee != null;
    }
}
