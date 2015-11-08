import static org.junit.Assert.*;

import org.junit.Test;

public class ExListTest 
{

		AList1 rr = new AList1();
		//EList rr = new AList1();
		//EList rr = new AList2();
		
		//=====================================
		// size, init, toArray
		//=====================================
		@Test
		public void testSize_null() 
		{
			
			int[] ini = null;
			rr.init(ini);
			assertEquals(0, rr.size());
			int[] exp = {};
			int[] act = rr.toArray();
			assertArrayEquals(exp, act);
		}
		@Test
		public void testSize_0() 
		{
			
			int[] ini = {};
			rr.init(ini);
			assertEquals(0, rr.size());
			int[] exp = {};
			int[] act = rr.toArray();
			assertArrayEquals(exp, act);
		}
		@Test
		public void testSize_1() 
		{
			
			int[] ini = {10};
			rr.init(ini);
			assertEquals(10, rr.size());
			int[] exp = {10};
			int[] act = rr.toArray();
			assertArrayEquals(exp, act);
		}
		@Test
		public void testSize_2() 
		{
			
			int[] arr = {10,20};
			rr.init(arr);
			assertEquals(2, rr.size());
			int[] exp = {10,20};
			int[] act = rr.toArray();
			assertArrayEquals(exp, act);
		}
		@Test
		public void testSize_many() 
		{
			
			int[] ini = {10,20,33,77,11,24,19};
			rr.init(ini);
			assertEquals(7, rr.size());
			int[] exp = {10,20,33,77,11,24,19};
			int[] act = rr.toArray();
			assertArrayEquals(exp, act);
		}

/*	
	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testInit() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEnd() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPos() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelEnd() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelPos() {
		fail("Not yet implemented");
	}

	@Test
	public void testMin() {
		fail("Not yet implemented");
	}

	@Test
	public void testMax() {
		fail("Not yet implemented");
	}

	@Test
	public void testMinIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testMaxIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testSort() {
		fail("Not yet implemented");
	}

	@Test
	public void testReverse() {
		fail("Not yet implemented");
	}

	@Test
	public void testHalfReverse() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArray() {
		fail("Not yet implemented");
	}
*/
}
