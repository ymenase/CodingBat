package logic2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Logic2Test {
	@Test
	public void test() {
		Logic2 logic2 = new Logic2();
		assertEquals(logic2.makeBricks(3, 1, 8), true);
		assertEquals(logic2.makeBricks(3, 1, 10), false);
		assertEquals(logic2.makeBricks(3, 4, 10), true);
	}	
}
