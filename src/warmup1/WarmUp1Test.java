package warmup1;

import static org.junit.Assert.*;

import org.junit.Test;

public class WarmUp1Test {
	WarmUp1 wu1 = new WarmUp1();

	@Test
	public void sleepIn() {
		assertEquals(wu1.sleepIn(false, false), true);
		assertEquals(wu1.sleepIn(true, false), false);
		assertEquals(wu1.sleepIn(false, true), true);
	}
	
	@Test
	public void sumDouble() {
		assertEquals(wu1.sumDouble(1, 2), 3);
		assertEquals(wu1.sumDouble(3, 2), 5);
		assertEquals(wu1.sumDouble(2, 2), 8);
	}
	
	@Test
	public void diff21() {
		assertEquals(wu1.diff21(19), 2);
		assertEquals(wu1.diff21(10), 11);
		assertEquals(wu1.diff21(21), 0);
	}
	
	@Test
	public void parrotTrouble() {
		assertEquals(wu1.parrotTrouble(true, 6), true);
		assertEquals(wu1.parrotTrouble(true, 7), false);
		assertEquals(wu1.parrotTrouble(false, 6), false);
	}
	
	@Test
	public void makes10() {
		assertEquals(wu1.makes10(9, 10), true);
		assertEquals(wu1.makes10(9, 9), false);
		assertEquals(wu1.makes10(1, 9), true);
	}
	
	@Test
	public void nearHundred() {
		assertEquals(wu1.nearHundred(93), true);
		assertEquals(wu1.nearHundred(90), true);
		assertEquals(wu1.nearHundred(89), false);
	}
	
	@Test
	public void posNeg() {
		assertEquals(wu1.posNeg(1, -1, false), true);
		assertEquals(wu1.posNeg(-1, 1, false), true);
		assertEquals(wu1.posNeg(-4, -5, true), true);
	}
	
	@Test
	public void notString() {
		assertEquals(wu1.notString("candy"), "not candy");
		assertEquals(wu1.notString("x"), "not x");
		assertEquals(wu1.notString("not good"), "not good");
	}
	
	@Test
	public void missingChar() {
		assertEquals(wu1.missingChar("baseball", 1), "bseball");
		assertEquals(wu1.missingChar("baseball", 0), "aseball");
		assertEquals(wu1.missingChar("baseball", 4), "baseall");
	}
	
	@Test
	public void frontBack() {
		assertEquals(wu1.frontBack("code"), "eodc");
		assertEquals(wu1.frontBack("x"), "x");
		assertEquals(wu1.frontBack("xy"), "yx");
	}
	
	@Test
	public void front3() {
		assertEquals(wu1.front3("dogs"), "dogdogdog");
		assertEquals(wu1.front3("abc"), "abcabcabc");
		assertEquals(wu1.front3("word"), "worworwor");
	}
	
	@Test
	public void backAround() {
		assertEquals(wu1.backAround("cat"), "tcatt");
		assertEquals(wu1.backAround("Hello"), "oHelloo");
		assertEquals(wu1.backAround("b"), "bbb");
	}
	
	@Test
	public void or35() {
		assertEquals(wu1.or35(3), true);
		assertEquals(wu1.or35(15), true);
		assertEquals(wu1.or35(8), false);
	}
	
	@Test
	public void front22() {
		assertEquals(wu1.front22("kitten"), "kikittenki");
		assertEquals(wu1.front22("Ha"), "HaHaHa");
		assertEquals(wu1.front22("abc"), "ababcab");
	}
	
	@Test
	public void startHi() {
		assertEquals(wu1.startHi("hi you"), true);
		assertEquals(wu1.startHi("hi"), true);
		assertEquals(wu1.startHi("bears hi"), false);
	}
	
	@Test
	public void icyHot() {
		assertEquals(wu1.icyHot(120, -1), true);
		assertEquals(wu1.icyHot(-1, 110), true);
		assertEquals(wu1.icyHot(3, 130), false);
	}
	
	@Test
	public void in1020() {
		assertEquals(wu1.in1020(14, 98), true);
		assertEquals(wu1.in1020(22, 12), true);
		assertEquals(wu1.in1020(5, 40), false);
	}
	
	public void hasTeen(){
		assertEquals(wu1.hasTeen(14, 20, 30), true);
		assertEquals(wu1.hasTeen(20, 15, 9), true);
		assertEquals(wu1.hasTeen(8, 4, 11), false);
	}
	
	public void loneTeen(){
		assertEquals(wu1.loneTeen(13, 99), true);
		assertEquals(wu1.loneTeen(21, 19), true);
		assertEquals(wu1.loneTeen(14, 14), false);
	}
	
	public void delDel(){
		assertEquals(wu1.delDel("adelbc"), "abc");
		assertEquals(wu1.delDel("adelHello"), "aHello");
		assertEquals(wu1.delDel("adedbc"), "adedbc");
	}
	
	public void mixStart(){
		assertEquals(wu1.mixStart("mix snacks"), true);
		assertEquals(wu1.mixStart("zix snacks"), true);
		assertEquals(wu1.mixStart("zil snacks"), false);
	}
	
	public void startOz(){
		assertEquals(wu1.startOz("ozymandias"), "oz");
		assertEquals(wu1.startOz("bzoo"), "z");
		assertEquals(wu1.startOz("oxx"), "o");
	}
	
	public void intMax(){
		assertEquals(wu1.intMax(1, 2, 3), 3);
		assertEquals(wu1.intMax(1, 4, 2), 4);
		assertEquals(wu1.intMax(5, 3, 1), 5);
	}
	
	public void close10(){
		assertEquals(wu1.close10(8, 13), 8);
		assertEquals(wu1.close10(13, 8), 8);
		assertEquals(wu1.close10(13, 7), 0);
	}


	}

}
