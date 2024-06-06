package com.awei.Parser.P1;

import com.awei.Parser.P2.Enviroment;

import java.util.HashSet;
import java.util.Set;

/**
 * ITypeParserFactory的一个实现
 * immutable
 */
public class XMLTypeParserFactory implements ITypeParserFactory {
    private static final Set<Enviroment> env = new HashSet<>();

    // Abstraction function:
    // AF(env) = 能使用该文件解析器的环境集合

    // Representation invariant:
    // 在整个生命周期中都能返回XMLTypeParser

    // Safety from rep exposure:
    // 每个字段都是被private 和 final修饰
    // 所以它们不能被外部直接访问，或者被再分配

    static {
        env.add(Enviroment.Testing);
        env.add(Enviroment.Production);
    }


    @Override
    public ITypeParser getTypeParser() {
        return XMLTypeParser.getInstance();
    }

    @Override
    public boolean getEnvParser(Enviroment enviroment) {
        return env.contains(enviroment);
    }

}
