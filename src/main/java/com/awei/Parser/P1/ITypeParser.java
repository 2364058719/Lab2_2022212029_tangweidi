package com.awei.Parser.P1;

/**
 * immutable 文件解析器
 */
public abstract class ITypeParser {

    /**
     * 根据给定的配置文件的内容，返回解析之后的文件的内容
     * @param text 配置文件解析之前的内容
     * @return 将配置文件内容经过解析之后的解析内容返回
     */
    public abstract String parser(String text);
}
