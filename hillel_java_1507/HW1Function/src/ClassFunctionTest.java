import static org.junit.Assert.*;

import org.junit.Test;

public class ClassFunctionTest {

	
	
	
	//*******************************************************
	//**
	//*******************************************************
	@Test
	public void testWeekNumToString_1()
	{
		String q = ClassFunction.weekNumToString(1);
		assertEquals("понедельник",q);
	}

	@Test
	public void testWeekNumToString_2()
	{
		String q = ClassFunction.weekNumToString(5);
		assertEquals("пятница",q);
	}

	@Test
	public void testWeekNumToString_3()
	{
		String q = ClassFunction.weekNumToString(98);
		assertEquals("нет такого дня",q);
	}
	
	
	
	
	
	
	
	//*******************************************************
	//**
	//*******************************************************
	
	@Test
	public void testToString_1()
	{
		String q = ClassFunction.toString(0);
		assertEquals("ноль ",q);
	}
	
	
	@Test
	public void testToString_2()
	{
		String q = ClassFunction.toString(873998);
		assertEquals("восемьсот семьдесят три тысячи девятьсот девяносто восемь ",q);
	}
	
	@Test
	public void testToString_3()
	{
		String q = ClassFunction.toString(17);
		assertEquals("семнадцать ",q);
	}

	
	@Test
	public void testToString_4()
	{
		String q = ClassFunction.toString(591);
		assertEquals("пятьсот девяносто один ",q);
	}
	
	@Test
	public void testToString_5()
	{
		String q = ClassFunction.toString(1290);
		assertEquals("одна тысяча двести девяносто ",q);
	}
	
	@Test
	public void testToString_6()
	{
		String q = ClassFunction.toString(54995);
		assertEquals("пятьдесят четыре тысячи девятьсот девяносто пять ",q);
	}
	
	@Test
	public void testToString_7()
	{
		String q = ClassFunction.toString(96399145);
		assertEquals("девяносто шесть миллионов триста девяносто девять тысяч сто сорок пять ",q);
	}
	
	
	
	
	
	
	//*******************************************************
	//**Найти расстояние между двумя точками в двумерном декартовом пространстве
	//*******************************************************
	@Test
	public void testDistance()
	{
		int q = ClassFunction.distance(2,-3,0,0);
		assertEquals(5, q);
	}
	
	
	
	
	
	
	//*******************************************************
	//**
	//*******************************************************
	
	
	
	
	
	
	//*******************************************************
	//**
	//*******************************************************
	
	
	
	
	
	
	//*******************************************************
	//**
	//*******************************************************
	
	
	
	
	
	
	//*******************************************************
	//**
	//*******************************************************

}
