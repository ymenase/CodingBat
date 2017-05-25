package logic2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Logic2Test {
	Logic2 logic2 = new Logic2();

	@Test
	public void makeBricks() {
		assertEquals(logic2.makeBricks(3, 1, 8), true);
		assertEquals(logic2.makeBricks(3, 1, 10), false);
		assertEquals(logic2.makeBricks(3, 4, 10), true);
	}
	
	@Test
	public void loneSum() {
		assertEquals(logic2.loneSum(1, 2, 3), 6);
		assertEquals(logic2.loneSum(3, 2, 3), 2);
		assertEquals(logic2.loneSum(3, 3, 3), 0);
	}

	@Test
	public void luckySum() {
		assertEquals(logic2.luckySum(1, 2, 3), 6);
		assertEquals(logic2.luckySum(1, 2, 13), 3);
		assertEquals(logic2.luckySum(1, 13, 3), 1);
	}

	@Test
	public void noTeenSum() {
		assertEquals(logic2.noTeenSum(1, 2, 3), 6);
		assertEquals(logic2.noTeenSum(2, 13, 1), 3);
		assertEquals(logic2.noTeenSum(2, 1, 14), 3);
	}
	
	@Test
	public void closeFar() {
		assertEquals(logic2.closeFar(1, 2, 10), true);
		assertEquals(logic2.closeFar(1, 2, 3), false);
		assertEquals(logic2.closeFar(4, 1, 3), true);
	}

}
