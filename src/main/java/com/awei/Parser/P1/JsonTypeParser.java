package com.awei.Parser.P1;

/**
 * immutable 饿汉式单例类，Json文件解析器的一个实现
 */
public class JsonTypeParser extends ITypeParser{

    private static final JsonTypeParser jsonTypeParser = new JsonTypeParser();

    // Abstraction function:
    // AF(jsonTypeParser) = json文件解析器单例

    // Representation invariant:
    // jsonTypeParser json文件解析器，单一实例，类被初始化时就被创建，数量在程序的生命周期中一直为1

    // Safety from rep exposure:
    // 每个字段都是被private 和 final修饰
    // 所以它们不能被外部直接访问，或者被再分配

    /**
     * Constructor 被private修饰，外部不能创建JsonTypeParser的实例对象
     */
    private JsonTypeParser(){}

    /**
     * 获取JsonTypeParser的实例对象
     *
     * @return 返回已经创建的单一JsonTypeParser的实例对象
     */
    public static JsonTypeParser getInstance(){
        return jsonTypeParser;
    }

    @Override
    public String parser(String text) {
//        System.out.println("JsonTypeParser: " + text);
//        if (text==null) text = "";
        return new String("JsonTypeParser: " + text);
    }
}
