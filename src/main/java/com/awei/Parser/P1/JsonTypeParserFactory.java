package com.awei.Parser.P1;

/**
 * ITypeParserFactory的一个实现
 * immutable
 */
public class JsonTypeParserFactory implements ITypeParserFactory{

    // Abstraction function:
    // None

    // Representation invariant:
    // 在整个生命周期中都能返回JsonTypeParser

    // Safety from rep exposure:
    // None


    @Override
    public ITypeParser getTypeParser() {
        return  JsonTypeParser.getInstance();
    }
}
