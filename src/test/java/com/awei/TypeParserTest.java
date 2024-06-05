package com.awei;

import com.awei.Parser.P1.ITypeParser;
import com.awei.Parser.P1.JsonTypeParser;
import com.awei.Parser.P1.XMLTypeParser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for JsonTypeParser and XMLTypeParser
 * Tests against the ITypeParser spec
 */
public class TypeParserTest {
    /* Testing strategy for JsonTypeParser
     *
     * Testing strategy Partition the TypeParser as follows:
     * Empty inputs:yes,
     *
     * Partition for inputs of JsonTypeParser.parser(inputs):
     *                          ITypeParser: JsonTypeParser
     *                          inputs: normal text,empty text
     *
     * Partition for JsonTypeParser.getInstance()
     *                          ITypeParser: JsonTypeParser
     *
     */


    @Test
    public void testJsonTypeParser(){
        final String text = "this is a normal test.";
        ITypeParser typeParser = JsonTypeParser.getInstance();
        assertNotNull(typeParser);
        String parser = typeParser.parser(text);
        assertTrue(parser.contains("JsonTypeParser"));
    }

    @Test
    public void testJsonTypeParserWithoutInputs(){
        final String text = null;
        ITypeParser typeParser = JsonTypeParser.getInstance();
        assertNotNull(typeParser);
        String parser = typeParser.parser(text);
        assertTrue(parser.contains("JsonTypeParser"));
    }

    /* Testing strategy for XMLTypeParser
     *
     * Testing strategy Partition the TypeParser as follows:
     * Empty inputs:yes,
     *
     * Partition for inputs of XMLTypeParser.parser(inputs):
     *                          ITypeParser: XMLTypeParser
     *                          inputs: normal text,empty text
     *
     * Partition for XMLTypeParser.getInstance()
     *                          ITypeParser: XMLTypeParser
     *
     */

    @Test
    public void testXMLTypeParser(){
        final String text = "this is a normal test.";
        ITypeParser typeParser = XMLTypeParser.getInstance();
        assertNotNull(typeParser);
        String parser = typeParser.parser(text);
        assertTrue(parser.contains("XMLTypeParser"));
    }

    @Test
    public void testXMLTypeParserWithoutInputs(){
        final String text = null;
        ITypeParser typeParser = XMLTypeParser.getInstance();
        assertNotNull(typeParser);
        String parser = typeParser.parser(text);
        assertTrue(parser.contains("XMLTypeParser"));
    }
}
