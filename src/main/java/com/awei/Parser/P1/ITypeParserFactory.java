package com.awei.Parser.P1;

import com.awei.Parser.P2.Enviroment;

import java.util.HashSet;
import java.util.Set;

/**
 * 一个文件解析器工厂，用于生产特定的文件解析器
 * immutable
 */
public interface ITypeParserFactory{

    /**
     * 根据对应的工厂，调用对应的工厂方法，返回对应类型的文件解析器Parser
     *
     * @return 返回跟工厂类型对应的文件解析器
     */
    public ITypeParser getTypeParser();

    /**
     * 根据给定的环境来判断是否能返回当前类型的文件解析器
     *
     * @param enviroment 给定的当前环境，不为null
     * @return 如果当前环境能使用这个Parser则返回true，否则返回false
     */
    public boolean getEnvParser(Enviroment enviroment);
}
