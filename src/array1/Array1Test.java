package array1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array1Test {

	@Test
	public void test() {
		
		Array1 array1 = new Array1();
		int[] test3 = {13, 6, 1, 2, 3};
		
		
		assertEquals(array1.firstLast6(new int[] {1, 2, 6}), true);
		assertEquals(array1.firstLast6(new int[] {6, 1, 2, 3}), false);
		assertEquals(array1.firstLast6(new int[] {13, 6, 1, 2, 3}), true);
		
	
	}
}
