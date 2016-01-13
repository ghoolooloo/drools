package jo.demo.drools.namedkiesession;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class NamedKieSessionExampleTest {

	private static final String NL = System.getProperty("line.separator");
	
	@Test
	public void testGo() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        new NamedKieSessionExample().go(ps);
        ps.close();

        String actual = new String(baos.toByteArray());
        String expected = "" +
                "Dave: Hello, HAL. Do you read me, HAL?" + NL +
                "HAL: Dave. I read you." + NL;
        assertEquals(expected, actual);
	}

}
