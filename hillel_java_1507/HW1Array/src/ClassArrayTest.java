import static org.junit.Assert.*;


import org.junit.Test;

public class ClassArrayTest 
{




	//***************
	//* min element *
	//***************
	@Test
	public void testMinElement() 
	{
		int [] a = {9, 2, 3, 4};
		int  q = ClassArray.minElement(a);

		assertEquals(2, q);
	}





	//***************
	//* max element *
	//***************




	//******************
	//* id max element *
	//******************




	//******************
	//* id min element *
	//******************




	//********************
	//* sum Odd element *
	//********************
	@Test
	public void testsumOddElement()
	{
		int [] a = {1, 2, 3, 4,8,3,4};
		int q = ClassArray.sumOddElement(a);
		assertEquals(9, q);

	}


	
	
	//*****************
	//* reverse array *
	//*****************
	@Test
	public void testReverseArray() 
	{
		int [] a = {1, 2, 3, 4,8,3,4};
		int [] q = {4,3,8,4, 3, 2, 1};
		int temp[] = ClassArray.reverseArray(a);
		assertArrayEquals(q, temp);
	}
	
	
	
	
	
	
	//*************************************
	//* кол-во нечетных элементов массива *
	//*************************************

	@Test
	public void testQuantityOddElement() 
	{
		int [] a = {1,2,3,4,5,6,7,8,6,5};
		int q = ClassArray.quantityOddElement(a);
		assertEquals(5, q);

	}
	
	
	
	
	//***************************************************
	//*ѕомен€ть местами первую и вторую половину массива*
	//***************************************************
	@Test
	public void testSwapHalf()
	{
		int [] a = {1, 2, 9, 3, 4};
		int [] q = {3,4,9,1,2};
		int temp[] = ClassArray.swapHalf(a);
		assertArrayEquals(q, temp);
	}

	
	
	
	//**************************************************
	//*ќтсортировать массив пузырьком (Bubble)         *
	//**************************************************
	
	@Test
	public void testSortBubble()
	{
		int [] a = {4,3,5,2,6,1};
		int [] q = {1,2,3,4,5,6};
		int temp[] = ClassArray.sortBubble(a);
		assertArrayEquals(q, temp);
	}
	
	
	
	
	//*************************************************
	//*ќтсортировать массив  выбором (Select)         *
	//*************************************************
	@Test
	public void testSortSelect()
	{
		int [] a = {4,3,5,2,6,1};
		int [] q = {1,2,3,4,5,6};
		int temp[] = ClassArray.sortSelect(a);
		assertArrayEquals(q, temp);
	}
	
	
	//***************************************************
	//*ќтсортировать массив  вставками (Insert)         *
	//***************************************************
	@Test
	public void testSortInsert()
	{
		int [] a = {4,3,5,2,6,1};
		int [] q = {1,2,3,4,5,6};
		int temp[] = ClassArray.sortInsert(a);
		assertArrayEquals(q, temp);
	}
	
	

}
