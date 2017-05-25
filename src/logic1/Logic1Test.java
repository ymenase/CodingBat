package logic1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Logic1Test {
	Logic1 logic1 = new Logic1();

	@Test
	public void cigarParty() {
		assertEquals(logic1.cigarParty(30, false), false);
		assertEquals(logic1.cigarParty(50, false), true);
		assertEquals(logic1.cigarParty(70, true), true);
	}
	
	@Test
	public void dateFashion(){
		assertEquals(logic1.dateFashion(5, 10), 2);
		assertEquals(logic1.dateFashion(5, 2), 0);
		assertEquals(logic1.dateFashion(5, 5), 1);
	}
	
	@Test
	public void squirrelPlay(){
		assertEquals(logic1.squirrelPlay(70, false), true);
		assertEquals(logic1.squirrelPlay(95, false), true);
		assertEquals(logic1.squirrelPlay(95, true), true);
	}
	
	@Test
	public void sortaSum(){
		assertEquals(logic1.sortaSum(3, 4), 7);
		assertEquals(logic1.sortaSum(9, 4), 20);
		assertEquals(logic1.sortaSum(10, 11), 21);
	}
	
	@Test
	public void alarmClock(){
		assertEquals(logic1.alarmClock(1, false), "7:00");
		assertEquals(logic1.alarmClock(5, false), "7:00");
		assertEquals(logic1.alarmClock(0, false), "10:00");
	}
	
	@Test
	public void love6(){
		assertEquals(logic1.love6(6, 4), true);
		assertEquals(logic1.love6(4, 5), false);
		assertEquals(logic1.love6(1, 5), true);
	}
	
	@Test
	public void specialEleven(){
		assertEquals(logic1.specialEleven(22), true);
		assertEquals(logic1.specialEleven(23), true);
		assertEquals(logic1.specialEleven(24), false);
	}
	
	@Test
	public void more20(){
		assertEquals(logic1.more20(20), false);
		assertEquals(logic1.more20(21), true);
		assertEquals(logic1.more20(22), true);
	}
	
	@Test
	public void old35(){
		assertEquals(logic1.old35(3), true);
		assertEquals(logic1.old35(10), true);
		assertEquals(logic1.old35(15), false);
	}	
}
