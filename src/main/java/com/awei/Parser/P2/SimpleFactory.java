package com.awei.Parser.P2;

import com.awei.Parser.P1.ITypeParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * immutable
 */
public class SimpleFactory {
    private static final HashMap<String, ITypeParserFactory> map = new HashMap<>();

    /*
     * Abstraction function:
     * AF(map) = 一个<K,V>键值对代表一个文件解析器名称与其对应的工厂类
     *
     * Representation invariant:
     * map不为空，在类被加载时则将map赋值，之后不会改变
     *
     * Safety from rep exposure:
     * 使用private和final修饰，外界无法直接访问或分配其值
     */

    static {
        Properties p = new Properties();
        InputStream resourceAsStream = SimpleFactory.class.getClassLoader().getResourceAsStream("src/main/java/com/awei/Parser/P2/bean.properties");
        try{
            p.load(resourceAsStream);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                ITypeParserFactory factory = (ITypeParserFactory) clazz.newInstance();
                map.put((String)key, factory);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据类名与环境获取对应的工厂类，若当前文件解析器不能在当前环境中使用则抛出异常
     *
     * @param className 需要的文件解析器名称
     * @return 返回对应的文件解析器工厂类
     * @throws IOException 若需要的文件解析器不能在当前环境中使用，则抛出异常
     */
    public static ITypeParserFactory getTypeParserFactory(String className)throws IOException {
        ITypeParserFactory iTypeParserFactory = map.get(className);
        Enviroment currentEnviroment = EnviromentContext.getCurrentEnviroment();
        boolean envParser = iTypeParserFactory.getEnvParser(currentEnviroment);
        if (envParser) {
            return iTypeParserFactory;
        }
        throw new IOException(className + " is not a valid type parser factory");
    }
}
