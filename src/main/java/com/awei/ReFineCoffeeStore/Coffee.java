package com.awei.ReFineCoffeeStore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * mutable
 */
public abstract class Coffee {
    private final String name;
    private int price;
    private final Map<String,Integer> flavours = new HashMap<String, Integer>();
    /*
     * Abstraction function:
     * AF(name,price,flavours) = 名字叫做name，含有flavours这些口味，并且价格为price的一杯咖啡
     * flavours中（key，value），key表示一种口味，该口味放了value份
     *
     * Representation invariant:
     * name不为null,且不会更改
     * flavours中每个口味都不相同
     * price 为非负 ，即price >= 0
     *
     * Safety from rep exposure:
     * 每个方法都用private修饰，防止外部访问
     * name和flavours都用final修饰，防止外部再向它分配值
     *
     */

    /**
     * constructor 的一个实现，产生一个咖啡对象
     *
     * @param name 咖啡名，不能为null
     * @param price 咖啡价格
     */
    public Coffee(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 获取咖啡的价格
     *
     * @return 返回咖啡的价格
     */
    public int getPrice(){
        return price;
    }

    /**
     * 增加咖啡的价格
     *
     * @param price 非负，要增加的价格
     */
    public void addPrice(int price){
        assert price >= 0;
        this.price = this.price+price;
    }

    /**
     * 获取咖啡名
     *
     * @return 返回咖啡的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 增添咖啡的口味
     *
     * @param flavour 口味的名称，不能为null
     * @return 若咖啡中没添加过这个口味，则添加这个口味并返回true；若咖啡中添加过这个口味，则返回false
     */
    public boolean addFlavour(String flavour){
        assert flavour != null;
        Integer num = flavours.getOrDefault(flavour, 0);
        flavours.put(flavour, num+1);
        return num == 0;
    }

    /**
     * 咖啡的具体特征描述
     */
    public abstract void describe();

}
