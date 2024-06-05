package com.awei.Parser.P1;

/**
 * 一个文件解析器工厂，用于生产特定的文件解析器
 * immutable
 */
public interface ITypeParserFactory {
    /**
     * 根据对应的工厂，调用对应的工厂方法，返回对应类型的文件解析器Parser
     *
     * @return 返回跟工厂类型对应的文件解析器
     */
    public ITypeParser getTypeParser();
}
