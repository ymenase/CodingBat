package warmup2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WarmUp2Test {
	@Test
	public void test() {
		WarmUp2 warmUp2 = new WarmUp2();
		assertEquals(warmUp2.stringTimes("Bear", 2), "BearBear");
		assertEquals(warmUp2.stringTimes("Hi", 3), "HiHiHi");
		assertEquals(warmUp2.stringTimes("Dog", 1), "Dog");
		assertEquals(warmUp2.frontTimes("Chocolate", 2), "ChoCho");
		assertEquals(warmUp2.frontTimes("Chocolate", 3), "ChoChoCho");
		assertEquals(warmUp2.frontTimes("Abc", 3), "AbcAbcAbc");
		
	}
}
