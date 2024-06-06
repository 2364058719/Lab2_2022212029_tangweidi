package com.awei.Parser.P2;

/**
 * mutable
 */
public class EnviromentContext {
    private static Enviroment currentEnviroment = Enviroment.Testing;

    /*
     * Abstraction function:
     * AF(currentEnviroment) = 当前使用的环境
     *
     * Representation invariant:
     * 在整个程序运行周期都能返回属于合法Enviroment中的一个环境
     *
     * Safety from rep exposure:
     * 使用private修饰，外界不能直接修改该field
     */

    /**
     * 获取当前环境枚举量
     * @return 返回当前环境枚举量
     */
    public static Enviroment getCurrentEnviroment() {
        return currentEnviroment;
    }

    /**
     * 设置当前环境枚举量
     * @param currentEnviroment 当前阶段的环境，不能为null
     */
    public static void setCurrentEnviroment(Enviroment currentEnviroment) {
        EnviromentContext.currentEnviroment = currentEnviroment;
    }
}
