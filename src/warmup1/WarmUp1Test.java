package warmup1;

import static org.junit.Assert.*;

import org.junit.Test;

public class WarmUp1Test {

	@Test
	public void test() {
		WarmUp1 wu1 = new WarmUp1();
		assertEquals(wu1.sleepIn(false, false), true);
		assertEquals(wu1.sleepIn(true, false), false);
		assertEquals(wu1.sleepIn(false, true), true);
		
		
	}

}
