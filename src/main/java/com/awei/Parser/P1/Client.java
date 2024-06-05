package com.awei.Parser.P1;

import java.io.File;

/**
 * 一个使用ITypeParser和ITypeParserFactory的例子
 */
public class Client {
    /**
     * 生成一个配置文件来调用对应的文件解析器Parser
     *
     * @param args args[0] 是一个合法的配置文件名称，args[1]是该文件内的内容，保证配置文件类型对应的文件解析器存在
     */
    public static void main(String[] args) {

        final File file = new File(args[0]);
        final String fileName = file.getName();
        final String fileExtension = fileName.substring(fileName.lastIndexOf("."));

        ITypeParserFactory iTypeParserFactory = null;
        if(fileExtension.equalsIgnoreCase("json")){
            iTypeParserFactory = new JsonTypeParserFactory();
        }
        else if(fileExtension.equalsIgnoreCase("xml")){
            iTypeParserFactory = new XMLTypeParserFactory();
        }

        //保证配置文件类型对应的文件解析器Parser存在
        assert iTypeParserFactory != null;
        ITypeParser typeParser = iTypeParserFactory.getTypeParser();

        //输出解析之后的内容
        System.out.println(typeParser.parser(args[1]));

    }
}
