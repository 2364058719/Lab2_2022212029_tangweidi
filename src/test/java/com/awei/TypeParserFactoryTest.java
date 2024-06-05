package com.awei;

import com.awei.Parser.P1.ITypeParser;
import com.awei.Parser.P1.ITypeParserFactory;
import com.awei.Parser.P1.JsonTypeParserFactory;
import com.awei.Parser.P1.XMLTypeParserFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Tests for JsonTypeParserFactory and XMLTypeParserFactory
 * Tests against the ITypeParserFactory spec
 */
public class TypeParserFactoryTest {
    /* Testing strategy for JsonTypeParser
     *
     * Partition for JsonTypeParserFactory.getTypeParser()
     *                              ITypeParserFactory: JsonTypeParserFactory
     *
     */

    @Test
    public void testJsonTypeParserFactory(){
        ITypeParserFactory factory = new JsonTypeParserFactory();
        ITypeParser typeParser = factory.getTypeParser();
        assertNotNull(typeParser);
    }

    /* Testing strategy for XMLTypeParser
     *
     * Partition for XMLTypeParserFactory.getTypeParser()
     *                              ITypeParserFactory: XMLTypeParserFactory
     *
     */

    @Test
    public void testXMLTypeParserFactory(){
        ITypeParserFactory factory = new XMLTypeParserFactory();
        ITypeParser typeParser = factory.getTypeParser();
        assertNotNull(typeParser);
    }
}
