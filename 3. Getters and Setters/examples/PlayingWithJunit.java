package examples;
import static org.junit.Assert.*;

import org.junit.Test;

public class PlayingWithJunit {

	@Test
	public void testName() throws Exception {
		assertEquals(4, Calculator.add(2,2));
	}
}
