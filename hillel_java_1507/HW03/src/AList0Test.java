import static org.junit.Assert.*;

import org.junit.Test;

public class AList0Test {

	//***************************************************min*************
	@Test(expected = Exception.class)
	public void minTest0() 
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.min();
		assertEquals(2, q);
	}
	@Test
	public void minTest1() 
	{
		int[] rr = {6};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.min();
		assertEquals(6, q);
	}
	@Test
	public void minTest2() 
	{
		int[] rr = {10,30};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.min();
		assertEquals(10, q);
	}
	@Test
	public void minTestNoEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99,3};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.min();
		assertEquals(2, q);
	}
	@Test
	public void minTestEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.min();
		assertEquals(2, q);
	}

	//***************************************************max*************

	@Test(expected = Exception.class)
	public void maxTest0() 
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.max();
		assertEquals(2, q);
	}
	@Test
	public void maxTest1() 
	{
		int[] rr = {6};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.max();
		assertEquals(6, q);
	}
	@Test
	public void maxTest2() 
	{
		int[] rr = {10,30};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.max();
		assertEquals(30, q);
	}
	@Test
	public void maxTestNoEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99,3};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.max();
		assertEquals(99, q);
	}
	@Test
	public void maxTestEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.max();
		assertEquals(99, q);
	}

	//***************************************************minID*************
	@Test(expected = Exception.class)
	public void minIDTest0() 
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.minID();
		assertEquals(2, q);
	}
	@Test
	public void minIDTest1() 
	{
		int[] rr = {6};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.minID();
		assertEquals(0, q);
	}
	@Test
	public void minIDTest2() 
	{
		int[] rr = {10,30};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.minID();
		assertEquals(0, q);
	}
	@Test
	public void minIDTestNoEven() 
	{
		int[] rr = {10,30,54,3,2,11,22};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.minID();
		assertEquals(4, q);
	}
	@Test
	public void minIDTestEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.minID();
		assertEquals(4, q);
	}



	//***************************************************maxID*************

	@Test(expected = Exception.class)
	public void maxIDTest0() 
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.maxID();
		assertEquals(2, q);
	}
	@Test
	public void maxIDTest1() 
	{
		int[] rr = {6};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.maxID();
		assertEquals(0, q);
	}
	@Test
	public void maxIDTest2() 
	{
		int[] rr = {10,30};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.maxID();
		assertEquals(1, q);
	}
	@Test
	public void maxIDTestNoEven() 
	{
		int[] rr = {10,30,54,3,2,11,22};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.maxID();
		assertEquals(2, q);
	}

	@Test
	public void maxIDTestEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.maxID();
		assertEquals(7, q);
	}
	//*********************************************** delStart ***********************************
	@Test
	public void delStartTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delStart();
		int [] a = pp.retArr();
		int [] temp = {3,5,2,6,1};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delStartTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delStart();
		int [] a = pp.retArr();
		int [] temp = {3,5,2,6};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void delStartTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delStart();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delStartTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delStart();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delStartTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delStart();
		int [] a = pp.retArr();
		int [] temp = {3};
		assertArrayEquals(a, temp);
	}
	//*********************************************** delEnd ***********************************
	@Test
	public void delEndTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delEnd();
		int [] a = pp.retArr();
		int [] temp = {4,3,5,2,6};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delEndTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delEnd();
		int [] a = pp.retArr();
		int [] temp = {4,3,5,2};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void delEndTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delEnd();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delEndTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delEnd();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delEndTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delEnd();
		int [] a = pp.retArr();
		int [] temp = {4};
		assertArrayEquals(a, temp);
	}

	//*********************************************** delPos ***********************************
	@Test
	public void delPosTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delPos(3);
		int [] a = pp.retArr();
		int [] temp = {4,3,5,6,1};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delPosTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delPos(3);
		int [] a = pp.retArr();
		int [] temp = {4,3,5,6};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void delPosTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delPos(0);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delPosTest1()
	{
		int[] rr = {7};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delPos(0);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void delPosTest1_big()
	{
		int[] rr = {7};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delPos(9);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void delPosTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.delPos(1);
		int [] a = pp.retArr();
		int [] temp = {4};
		assertArrayEquals(a, temp);
	}

	//*********************************************** sort ***********************************
	@Test
	public void sortTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.sort();
		int [] a = pp.retArr();
		int [] temp = {1,2,3,4,5,6};
		assertArrayEquals(a, temp);
	}
	@Test
	public void sortTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.sort();
		int [] a = pp.retArr();
		int [] temp = {2,3,4,5,6};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void sortTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.sort();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void sortTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.sort();
		int [] a = pp.retArr();
		int [] temp = {4};
		assertArrayEquals(a, temp);
	}
	@Test
	public void sortTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.sort();
		int [] a = pp.retArr();
		int [] temp = {3,4};
		assertArrayEquals(a, temp);
	}

	//*********************************************** reverse ***********************************
	@Test
	public void reverseTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.reverse();
		int [] a = pp.retArr();
		int [] temp = {1,6,2,5,3,4};
		assertArrayEquals(a, temp);
	}
	@Test
	public void reverseTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.reverse();
		int [] a = pp.retArr();
		int [] temp = {6,2,5,3,4};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void reverseTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.reverse();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void reverseTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.reverse();
		int [] a = pp.retArr();
		int [] temp = {4};
		assertArrayEquals(a, temp);
	}
	@Test
	public void reverseTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.reverse();
		int [] a = pp.retArr();
		int [] temp = {3,4};
		assertArrayEquals(a, temp);
	}
	//*********************************************** halfReverse ***********************************
	@Test
	public void halfReverseTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.halfReverse();
		int [] a = pp.retArr();
		int [] temp = {2,6,1,4,3,5};
		assertArrayEquals(a, temp);
	}
	@Test
	public void halfReverseTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.halfReverse();
		int [] a = pp.retArr();
		int [] temp = {2,6,5,4,3};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void halfReverseTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.halfReverse();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void halfReverseTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.halfReverse();
		int [] a = pp.retArr();
		int [] temp = {4};
		assertArrayEquals(a, temp);
	}
	@Test
	public void halfReverseTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.halfReverse();
		int [] a = pp.retArr();
		int [] temp = {3,4};
		assertArrayEquals(a, temp);
	}

	//*********************************************** addStart ***********************************
	@Test
	public void addStartTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addStart(9);
		int [] a = pp.retArr();
		int [] temp = {9,4,3,5,2,6,1};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addStartTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addStart(0);
		int [] a = pp.retArr();
		int [] temp = {0,4,3,5,2,6};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void addStartTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addStart(2);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addStartTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addStart(5);
		int [] a = pp.retArr();
		int [] temp = {5,4};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addStartTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addStart(7);
		int [] a = pp.retArr();
		int [] temp = {7,4,3};
		assertArrayEquals(a, temp);
	}
	//*********************************************** addEnd ***********************************
	@Test
	public void addEndTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addEnd(8);
		int [] a = pp.retArr();
		int [] temp = {4,3,5,2,6,1,8};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addEndTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addEnd(3);
		int [] a = pp.retArr();
		int [] temp = {4,3,5,2,6,3};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void addEndTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addEnd(3);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addEndTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addEnd(8);
		int [] a = pp.retArr();
		int [] temp = {4,8};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addEndTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addEnd(7);
		int [] a = pp.retArr();
		int [] temp = {4,3,7};
		assertArrayEquals(a, temp);
	}

	//*********************************************** addPos ***********************************
	@Test
	public void addPosTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addPos(3,9);
		int [] a = pp.retArr();
		int [] temp = {4,3,5,9,2,6,1};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addPosTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addPos(3,9);
		int [] a = pp.retArr();
		int [] temp = {4,3,5,9,2,6};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void addPosTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addPos(0,6);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addPosTest1()
	{
		int[] rr = {7};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addPos(0,4);
		int [] a = pp.retArr();
		int [] temp = {4,7};
		assertArrayEquals(a, temp);
	}
	@Test(expected = Exception.class)
	public void addPosTest1_big()
	{
		int[] rr = {7};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addPos(9,8);
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void addPosTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		pp.addPos(1,9);
		int [] a = pp.retArr();
		int [] temp = {4,9,3};
		assertArrayEquals(a, temp);
	}

	//***************************************************size*************
	@Test(expected = Exception.class)
	public void sizeTest0() 
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.size();
		assertEquals(0, q);
	}
	@Test
	public void sizeTest1() 
	{
		int[] rr = {6};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.size();
		assertEquals(1, q);
	}
	@Test
	public void sizeTest2() 
	{
		int[] rr = {10,30};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.size();
		assertEquals(2, q);
	}
	@Test
	public void sizeTestNoEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99,3};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.size();
		assertEquals(9, q);
	}
	@Test
	public void sizeTestEven() 
	{
		int[] rr = {10,30,54,3,2,11,22,99};
		AList0 pp = new AList0();
		pp.init( rr );
		int  q = pp.size();
		assertEquals(8, q);
	}
	//*********************************************** init ***********************************
	@Test
	public void initTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.init( rr );
		int [] a = pp.retArr();
		int [] temp = {4,3,5,2,6,1};
		assertArrayEquals(a, temp);
	}
	@Test
	public void initTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.init( rr );
		int [] a = pp.retArr();
		int [] temp = {4,3,5,2,6};
		assertArrayEquals(a, temp);
	}
	@Test
	public void initTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.init( rr );
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void initTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.init( rr );
		int [] a = pp.retArr();
		int [] temp = {4};
		assertArrayEquals(a, temp);
	}
	@Test
	public void initTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.init( rr );
		int [] a = pp.retArr();
		int [] temp = {4,3};
		assertArrayEquals(a, temp);
	}

	//*********************************************** clear ***********************************
	@Test
	public void clearTestEven()
	{
		int[] rr = {4,3,5,2,6,1};
		AList0 pp = new AList0();
		pp.clear();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void clearTestNoEven()
	{
		int[] rr = {4,3,5,2,6};
		AList0 pp = new AList0();
		pp.clear();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void clearTest0()
	{
		int[] rr = {};
		AList0 pp = new AList0();
		pp.clear();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void clearTest1()
	{
		int[] rr = {4};
		AList0 pp = new AList0();
		pp.clear();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}
	@Test
	public void clearTest2()
	{
		int[] rr = {4,3};
		AList0 pp = new AList0();
		pp.clear();
		int [] a = pp.retArr();
		int [] temp = {};
		assertArrayEquals(a, temp);
	}



}
