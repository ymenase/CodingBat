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
		assertEquals(wu1.sumDouble(1, 2), 3);
		assertEquals(wu1.sumDouble(3, 2), 5);
		assertEquals(wu1.sumDouble(2, 2), 8);
		assertEquals(wu1.diff21(19), 2);
		assertEquals(wu1.diff21(10), 11);
		assertEquals(wu1.diff21(21), 0);
		assertEquals(wu1.parrotTrouble(true, 6), true);
		assertEquals(wu1.parrotTrouble(true, 7), false);
		assertEquals(wu1.parrotTrouble(false, 6), false);
		assertEquals(wu1.makes10(9, 10), true);
		assertEquals(wu1.makes10(9, 9), false);
		assertEquals(wu1.makes10(1, 9), true);
		assertEquals(wu1.nearHundred(93), true);
		assertEquals(wu1.nearHundred(90), true);
		assertEquals(wu1.nearHundred(89), false);
		
		

	}

}
