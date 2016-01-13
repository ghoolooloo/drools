package jo.demo.drools.kcontainerfromrepository;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Ignore;
import org.junit.Test;

public class KieContainerFromKieRepoExampleTest {

	private static final String NL = System.getProperty("line.separator");
	
	@Test
	@Ignore
	public void testGo() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        new KieContainerFromKieRepoExample().go(ps);
        ps.close();

        String actual = new String(baos.toByteArray());
        String expected = "" +
                          "Dave: Hello, HAL. Do you read me, HAL?" + NL +
                          "HAL: Dave. I read you." + NL;
        assertEquals(expected, actual);
	}

}
