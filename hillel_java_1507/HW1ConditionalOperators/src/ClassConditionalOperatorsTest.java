import static org.junit.Assert.*;

import org.junit.Test;

public class ClassConditionalOperatorsTest 
{
	// test 01**************************************
	@Test
	public void testEven_1()
	{
		Boolean	q = ClassConditionalOperators.even(1);
		assertEquals(false,q);
	}

	@Test
	public void testEven_2()
	{
		Boolean	q = ClassConditionalOperators.even(2);
		assertEquals(true,q);
	}

	// test 02****************************************
	@Test
	public void testQuater_1()
	{		
		int q = ClassConditionalOperators.quater(1,1);
		assertEquals(1,q);
	}
	@Test
	public void testQuater_2()
	{		
		int q = ClassConditionalOperators.quater(-2,4);
		assertEquals(2,q);
	}
	@Test
	public void testQuater_3()
	{		
		int q = ClassConditionalOperators.quater(-2,-1);
		assertEquals(3,q);
	}
	@Test
	public void testQuater_4()
	{		
		int q = ClassConditionalOperators.quater(4,-6);
		assertEquals(4,q);
	}


	// test 03*****************************************
	@Test
	public void testSumPositivNumbers_1()
	{
		int q= ClassConditionalOperators.sumPositivNumbers(3,3,3);
		assertEquals(9,q);
	}
	@Test
	public void testSumPositivNumbers_2()
	{
		int q= ClassConditionalOperators.sumPositivNumbers(-1,3,3);
		assertEquals(6,q);
	}
	@Test
	public void testSumPositivNumbers_3()
	{
		int q= ClassConditionalOperators.sumPositivNumbers(3,-8,-1);
		assertEquals(3,q);
	}

	// test 04*****************************************
	@Test
	public void testMaxPlus3_1()
	{
		int q = ClassConditionalOperators.maxPlus3(2, 3, 4);
		assertEquals(7,q);

	}
	@Test
	public void testMaxPlus3_2()
	{
		int q = ClassConditionalOperators.maxPlus3(-7, 4, 3);
		assertEquals(7,q);

	}
	@Test
	public void testMaxPlus3_3()
	{
		int q = ClassConditionalOperators.maxPlus3(4, 2, 4);
		assertEquals(7,q);

	}
	@Test
	public void testMaxPlus3_4()
	{
		int q = ClassConditionalOperators.maxPlus3(4, 4, 4);
		assertEquals(7,q);

	}


	// test 05*****************************************
	@Test
	public void testRating_1()
	{
		String q = ClassConditionalOperators.rating(98);
		assertEquals("A",q);
	}

	@Test
	public void testRating_2()
	{
		String q = ClassConditionalOperators.rating(75);
		assertEquals("B",q);
	}

	@Test
	public void testRating_3()
	{
		String q = ClassConditionalOperators.rating(74);
		assertEquals("C",q);
	}

	@Test
	public void testRating_4()
	{
		String q = ClassConditionalOperators.rating(50);
		assertEquals("D",q);
	}

	@Test
	public void testRating_5()
	{
		String q = ClassConditionalOperators.rating(25);
		assertEquals("E",q);
	}

	@Test
	public void testRating_6()
	{
		String q = ClassConditionalOperators.rating(15);
		assertEquals("F",q);
	}


}
