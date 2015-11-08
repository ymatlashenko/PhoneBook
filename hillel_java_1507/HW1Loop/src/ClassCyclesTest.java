import static org.junit.Assert.*;

import org.junit.Test;

public class ClassCyclesTest {

	
	
	// 1_1 ***Сумма четных чисел*****************************
	//*******************************************************
	@Test
	public void testSumOfEven1to99()
	{
		int q = ClassCycles.sumOfEven1to99();
		assertEquals(2450,q);
	}

	
	
	
	
	// 1_2 ***Количество четных чисел************************
	//*******************************************************
	@Test
	public void testAmountOfEven1to99()
	{
		int q = ClassCycles.amountOfEven1to99();
		assertEquals(49,q);
	}

	
	
	
	// 2 ***простое ли число*****************************
	//***************************************************
	@Test
	public void testPrimeNumber_1()
	{
		Boolean q = ClassCycles.primeNumber(4);
		assertEquals (true,q);
	}
	@Test
	public void testPrimeNumber_2()
	{
		Boolean q = ClassCycles.primeNumber(5);
		assertEquals (false,q);
	}

	
	
	
	// 3 ***Найти корень натурального числа******************
	//*******************************************************
	@Test
	public void testRoot_1()
	{
		int q = ClassCycles.root(9);
		assertEquals (3,q);
	}
	@Test
	public void testRoot_2()
	{
		int q = ClassCycles.root(10);
		assertEquals (4,q);
	}
	@Test
	public void testRoot_3()
	{
		int q = ClassCycles.root(15);
		assertEquals (4,q);
	}
	
	
	
	
	// 4 ***Вычислить факториал числа n. n! = 1*2*…*n-1*n;!***
	//********************************************************
	@Test
	public void testFactorial_1()
	{
		int q = ClassCycles.factorial(2);
		assertEquals (2,q);
	}
	@Test
	public void testFactorial_2()
	{
		int q = ClassCycles.factorial(3);
		assertEquals (6,q);
	}

	
	
	
	// 5 ***Посчитать сумму цифр заданного числа*************
	//*******************************************************
	@Test
	public void testSumNum_1()
	{
		int q = ClassCycles.sumNum(123);
		assertEquals (6,q);

	}
	@Test
	public void testSumNum_2()
	{
		int q = ClassCycles.sumNum(333);
		assertEquals (9,q);
	}


	
	
	// 6 *** Отзеркалить число ******************************
	//*******************************************************
	@Test
	public void testMirrorNum_1()
	{
		int q = ClassCycles.mirrorNum(123);
		assertEquals (321,q);

	}

	@Test
	public void testMirrorNum_2()
	{
		int q = ClassCycles.mirrorNum(49386);
		assertEquals (68394,q);

	}



}
