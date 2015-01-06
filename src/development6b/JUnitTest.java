package development6b;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest {

	@Test
	public void testLink() {
		LinkWord test = new LinkWord();
		
		try {
			String result = test.concatenate("maja", "vanput");
			assertEquals("majavanput", result);
		} catch (Exception e) {}
	}

}