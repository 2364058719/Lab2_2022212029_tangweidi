package com.awei;

import com.awei.Parser.P1.ITypeParserFactory;
import com.awei.Parser.P2.Enviroment;
import com.awei.Parser.P2.EnviromentContext;
import com.awei.Parser.P2.SimpleFactory;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests for SimpleFactory,EnviromentContext
 * Tests against the spec
 */
public class EnviromentTest {
    /*
     * Test strategy for EnviromentContext
     *
     * Partition for EnviromentContext.getCurrentEnviroment():
     *   调用该方法查看是否能得到正确返回
     *
     * Partition for EnviromentContext.setCurrentEnviroment():
     *   调用该方法查看是否能正确将Enviroment赋值进去
     *
     */

    @Test
    public void testEnviroment() {
        assertEquals(EnviromentContext.getCurrentEnviroment(), Enviroment.Testing);
        EnviromentContext.setCurrentEnviroment(Enviroment.Production);
        assertEquals(EnviromentContext.getCurrentEnviroment(), Enviroment.Production);
    }

    /*
     * Test strategy for SimpleFactory
     *
     * Partition for SimpleFactory.getTypeParserFactory(inputs):
     *  通过给定的环境与文件解析器名称，测试能否正确得到文件解析器
     */

    @Test
    public void testSimpleFactory() throws IOException {
        ITypeParserFactory json = SimpleFactory.getTypeParserFactory("json");
        assertTrue(json.getTypeParser().parser("Json").contains("JsonTypeParser"));
//        assertTrue(true);
    }

}
