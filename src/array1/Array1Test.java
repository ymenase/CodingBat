package array1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array1Test {

	@Test
	public void test() {
		
		Array1 array1 = new Array1();		
		
		assertEquals(array1.firstLast6(new int[] {1, 2, 6}), true);
		assertEquals(array1.firstLast6(new int[] {6, 1, 2, 3}), false);
		assertEquals(array1.firstLast6(new int[] {13, 6, 1, 2, 3}), true);
		assertEquals(array1.sameFirstLast(new int[] {1,2,3}), false);
		assertEquals(array1.sameFirstLast(new int[] {1,2,3, 1}), true);
		assertEquals(array1.sameFirstLast(new int[] {1,2,1}), true);
		assertEquals(array1.makePi(), new int[] {3, 1, 4});
		assertEquals(array1.commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}), true);
		assertEquals(array1.commonEnd(new int[] {1, 2, 3}, new int[]{7, 3, 2}), false);
		assertEquals(array1.commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}), true);
		assertEquals(array1.sum3(new int[] {1, 2, 3}), 6);
		assertEquals(array1.sum3(new int[] {5, 11, 2}), 18);
		assertEquals(array1.sum3(new int[] {7, 0, 0}), 7);
		assertEquals(array1.rotateLeft3(new int[] {1, 2, 3}), new int[] {2, 3, 1});
		assertEquals(array1.rotateLeft3(new int[] {5, 11, 9}), new int[] {11, 9, 5});
		assertEquals(array1.rotateLeft3(new int[] {7, 0, 0}), new int[] {0, 0, 7});
		assertEquals(array1.reverse3(new int[] {1, 2, 3}), new int[] {3, 2, 1});
		assertEquals(array1.reverse3(new int[] {5, 11, 9}), new int[] {9, 11, 5});
		assertEquals(array1.reverse3(new int[] {7, 0, 0}), new int[] {0, 0, 7});
		
	}
}
