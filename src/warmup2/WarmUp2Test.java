package warmup2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WarmUp2Test {
	WarmUp2 warmUp2 = new WarmUp2();

	@Test
	public void stringTimes() {
		assertEquals(warmUp2.stringTimes("Bear", 2), "BearBear");
		assertEquals(warmUp2.stringTimes("Hi", 3), "HiHiHi");
		assertEquals(warmUp2.stringTimes("Dog", 1), "Dog");
	}

	@Test
	public void frontTimes() {
		assertEquals(warmUp2.frontTimes("Chocolate", 2), "ChoCho");
		assertEquals(warmUp2.frontTimes("Chocolate", 3), "ChoChoCho");
		assertEquals(warmUp2.frontTimes("Abc", 3), "AbcAbcAbc");
	}

	@Test
	public void countXX() {
		assertEquals(warmUp2.countXX("abcxx"), 1);
		assertEquals(warmUp2.countXX("xxx"), 2);
		assertEquals(warmUp2.countXX("xxxx"), 3);
	}

	@Test
	public void doubleX() {
		assertEquals(warmUp2.doubleX("axxbb"), true);
		assertEquals(warmUp2.doubleX("axaxax"), false);
		assertEquals(warmUp2.doubleX("xxxxx"), true);
	}

	@Test
	public void stringBits() {
		assertEquals(warmUp2.stringBits("Hello"), "Hlo");
		assertEquals(warmUp2.stringBits("Bye"), "Be");
		assertEquals(warmUp2.stringBits("Heeololeo"), "Hello");
	}

	@Test
	public void stringSplosion() {
		assertEquals(warmUp2.stringSplosion("Code"), "CCoCodCode");
		assertEquals(warmUp2.stringSplosion("abc"), "aababc");
		assertEquals(warmUp2.stringSplosion("ab"), "aab");
	}

	@Test
	public void last2() {
		assertEquals(warmUp2.last2("hixxhi"), 1);
		assertEquals(warmUp2.last2("xaxxaxaxx"), 1);
		assertEquals(warmUp2.last2("axxxaaxx"), 2);
	}

	@Test
	public void arrayCount9() {
		assertEquals(warmUp2.arrayCount9(new int[] { 1, 2, 9, 3, 4 }), 1);
	}

}
