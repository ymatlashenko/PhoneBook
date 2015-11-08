import static org.junit.Assert.*;

import org.junit.Test;

public class AList0Test {

	//==============================================
	//init
	//==============================================	
	
	@Test
	public void testInit() 
	{
		int[] zz = {10,30,54,77,11,22,99,3};
		int[] exp = {10,30,54,77,11,22,99,3};
		AList0 xx = new AList0();
		xx.init( zz );	
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	//==============================================
	//addEnd
	//==============================================


	@Test(expected = NullPointerException.class)
	public void testAddEnd_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addEnd(5);
	}

	@Test
	public void testAddEnd_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_1()
	{
		int[] zz = { 10 };
		int[] exp = { 10, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10, 20, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 99, 32, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test
	public void testAddEnd_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 10, 20, 77, 11, 24, 99, 32, 0, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	//==============================================
	//addStart
	//==============================================

	@Test(expected = NullPointerException.class)
	public void testAddStart_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addStart(5);
	}

	@Test
	public void testAddStart_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_1()
	{
		int[] zz = { 10 };
		int[] exp = {5,  10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 5, 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 5, 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test
	public void testAddStart_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 5, 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	//==============================================
	//addPos
	//==============================================
	@Test(expected = NullPointerException.class)
	public void testaddPos_null()
	{
		int[] zz = null;
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(0, 5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testaddPos_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(0, 5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testaddPos_1()
	{
		int[] zz = { 10 };
		int[] exp = {10, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(1, 5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testaddPos_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10, 5, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(1, 5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testaddPos_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 2, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(5, 2);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	@Test
	public void testaddPos_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 10, 20, 77, 11, 24, 2, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(5, 2);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test(expected = NullPointerException.class)
	public void testaddPos_out()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.addPos(3, 5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	//==============================================
	//delStart
	//==============================================

	@Test(expected = NullPointerException.class)
	public void testDelStart_null()
	{
		int[] zz = null;
		int[] exp = { };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_0()
	{
		int[] zz = {5};
		int[] exp = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_1()
	{
		int[] zz = { 10, 5 };
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_2()
	{
		int[] zz = { 10, 20, 5 };
		int[] exp = { 20, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	@Test
	public void testDelStart_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	//==============================================
	//delEnd
	//==============================================

	@Test(expected = NullPointerException.class)
	public void testDelEnd_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delEnd();
	}

	@Test(expected = NegativeArraySizeException.class)
	public void testDelEnd_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delEnd();
	}

	@Test
	public void testDelEnd_1()
	{
		int[] zz = { 10 };
		int[] exp = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelEnd_2()
	{
		int[] zz = { 10, 20, 5 };
		int[] exp =  { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelEnd_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 5 };
		int[] exp = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test
	public void testDelEnd_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0, 5 };
		int[] exp =  { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	//==============================================
	//delPos
	//==============================================

	@Test(expected = NullPointerException.class)
	public void testDelPos_null()
	{
		int[] zz = null;
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(0);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelPos_0()
	{
		int[] zz = {5};
		int[] exp = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(0);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelPos_1()
	{
		int[] zz = { 10, 5 };
		int[] exp = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(1);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelPos_2()
	{
		int[] zz = { 10, 20, 5 };
		int[] exp = { 10, 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(1);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelPos_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	@Test
	public void testDelPos_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 10, 20, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(2);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testDelPos_out()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.delPos(35);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	//==============================================
	//clear
	//==============================================

	@Test(expected = NullPointerException.class) // спросить исключение
	public void testClear_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.clear();
	}
// спросить как тестировать
	@Test(expected = IndexOutOfBoundsException.class)
	public void testClear_0()
	{
		int[] zz = {};
		int[] exp = new int [0];
		AList0 xx = new AList0();
		xx.init(zz);
		xx.clear();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);  
	}

	@Test
	public void testClear_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = new int [0];
		AList0 xx = new AList0();
		xx.init(zz);
		xx.clear();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);  
	}
	

	@Test
	public void testClear_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		int[] exp = new int [0];
		xx.init(zz);
		xx.clear();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);  
	}
	
	//==============================================
	//max
	//==============================================
	@Test(expected = NullPointerException.class) // спросить исключение
	public void testMax_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.max();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testMax_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.max();
	}

	@Test
	public void testMax_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.max();
		assertEquals(10, res);
	}

	@Test
	public void testMax_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.max();
		assertEquals(20, res);
	}
	
	@Test
	public void testMax_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.max();
		assertEquals(99, res);
	}
	@Test

	public void testMax_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.max();
		assertEquals(99, res);
	}
	//==============================================
	//min
	//==============================================

	@Test(expected = NullPointerException.class) // спросить исключение
	public void testMin_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.min();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testMin_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.min();
	}

	@Test
	public void testMin_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.min();
		assertEquals(10, res);
	}

	@Test
	public void testMin_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.min();
		assertEquals(10, res);
	}
	
	@Test
	public void testMin_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.min();
		assertEquals(10, res);
	}
	@Test

	public void testMin_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.min();
		assertEquals(0, res);
	}
	//==============================================
	//print
	//==============================================
	@Test

	public void testPrint()
	{
		int[] zz = { 5, 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.print();
	}
	
	@Test
	public void testPrint_n()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.print();
	}
	//==============================================
	//size
	//==============================================

	@Test(expected = NullPointerException.class) // спросить исключение
	public void size_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.size();
	}

	@Test(expected = IndexOutOfBoundsException.class) // спросить исключение
	public void size_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.size();
	
	}

	@Test
	public void size_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.size();
		assertEquals(1, res);
	}

	@Test
	public void size_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.size();
		assertEquals(2, res);
	}
	
	@Test
	public void size_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.size();
		assertEquals(7, res);
	}
	@Test

	public void size_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.size();
		assertEquals(8, res);
	}
	
	//==============================================
	//minIndex
	//==============================================

	@Test(expected = NullPointerException.class) // спросить исключение
	public void minIndex_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.minIndex();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void minIndex_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.minIndex();
	}

	@Test
	public void minIndex_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.minIndex();
		assertEquals(0, res);
	}

	@Test
	public void minIndex_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.minIndex();
		assertEquals(0, res);
	}
	
	@Test
	public void minIndex_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.minIndex();
		assertEquals(0, res);
	}
	@Test

	public void minIndex_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.minIndex();
		assertEquals(7, res);
	}
	//==============================================
	//maxIndex
	//==============================================

	@Test(expected = NullPointerException.class) // спросить исключение
	public void maxIndex_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.maxIndex();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void maxIndex_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.maxIndex();
	}

	@Test
	public void maxIndex_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.maxIndex();
		assertEquals(0, res);
	}

	@Test
	public void maxIndex_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.maxIndex();
		assertEquals(1, res);
	}
	
	@Test
	public void maxIndex_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.maxIndex();
		assertEquals(5, res);
	}
	@Test

	public void maxIndex_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		AList0 xx = new AList0();
		xx.init(zz);
		int res = xx.maxIndex();
		assertEquals(5, res);
	}
	//==============================================
	//reverse
	//==============================================

	
	@Test(expected = NullPointerException.class)
	public void testReverse_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.reverse();
	}

	@Test
	public void testReverse_0()
	{
		int[] zz = {};
		int[] exp = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.reverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testReverse_1()
	{
		int[] zz = { 10 };
		int[] exp = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.reverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testReverse_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 20, 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.reverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testReverse_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 32, 99, 24, 11, 77, 20, 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.reverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test
	public void testReverse_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 0, 32, 99, 24, 11, 77, 20, 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.reverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	//==============================================
	//sort
	//==============================================


	@Test(expected = NullPointerException.class)
	public void testSort_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.sort();
	}

	@Test
	public void testSort_0()
	{
		int[] zz = {};
		int[] exp = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.sort();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testSort_1()
	{
		int[] zz = { 10 };
		int[] exp = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.sort();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testSort_2()
	{
		int[] zz = { 20, 10 };
		int[] exp = { 10, 20 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.sort();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testSort_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 11, 20, 24, 32, 77, 99 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.sort();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test
	public void testSort_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 0, 10, 11, 20, 24, 32, 77, 99 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.sort();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	//==============================================
	//halfreverse
	//==============================================

	@Test(expected = NullPointerException.class)
	public void testHalfreverse_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.init(zz);
		xx.halfreverse();
	}

	@Test(expected = NullPointerException.class)
	public void testHalfreverse_0()
	{
		int[] zz = {};
		int[] exp = {};
		AList0 xx = new AList0();
		xx.init(zz);
		xx.halfreverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testHalfreverse_1()
	{
		int[] zz = { 10 };
		int[] exp = { 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.halfreverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testHalfreverse_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 20, 10 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.halfreverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testHalfreverse_many_7()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 24, 99, 32, 11, 10, 20, 77 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.halfreverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}
	
	@Test
	public void testHalfreverse_many_8()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32, 0 };
		int[] exp = { 24, 99, 32, 0, 10, 20, 77, 11 };
		AList0 xx = new AList0();
		xx.init(zz);
		xx.halfreverse();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

}
