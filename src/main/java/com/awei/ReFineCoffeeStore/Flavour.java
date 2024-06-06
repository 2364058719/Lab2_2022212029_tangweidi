package com.awei.ReFineCoffeeStore;

/**
 * immutable
 */
public abstract class Flavour {
    private final String name;
    private final int price;

    /*
     * Abstraction function:
     * AF(name,price) = 名称为name,价格为price的一个调料口味
     *
     * Representation invariant:
     * name不为null,且不会更改
     * price 为非负 ，即price >= 0
     *
     * Safety from rep exposure:
     * 每个方法都用private和final修饰，防止外部访问和再分配
     */

    /**
     * constructor 的一个实现，产生一个口味对象
     * @param name 口味名，不能为null
     * @param price 口味价格
     */
    public Flavour(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 获取口味价格
     * @return 返回口味价格
     */
    public int getPrice() {
        return price;
    }

    /**
     * 获取口味名称
     * @return 返回口味名称
     */
    public String getName() {
        return name;
    }

    /**
     * 口味的具体特征描述
     */
    public abstract void describe();

}
