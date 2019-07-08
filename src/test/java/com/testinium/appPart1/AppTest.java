package com.testinium.appPart1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

public class AppTest 
    extends TestCase
{
    
	@org.junit.Test
	public void testDrawTree() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        App myapp = new App();
        myapp.drawTree(5);

        StringBuilder sb = new StringBuilder();
        sb.append("    *\r\n");
        sb.append("   ***\r\n");
        sb.append("  *****\r\n");
        sb.append(" *******\r\n");
        sb.append("*********\r\n");

        assertEquals(sb.toString(), outContent.toString());
	}			
	
}
