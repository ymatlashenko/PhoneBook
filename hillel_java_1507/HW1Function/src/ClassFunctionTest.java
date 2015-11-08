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
		assertEquals("�����������",q);
	}

	@Test
	public void testWeekNumToString_2()
	{
		String q = ClassFunction.weekNumToString(5);
		assertEquals("�������",q);
	}

	@Test
	public void testWeekNumToString_3()
	{
		String q = ClassFunction.weekNumToString(98);
		assertEquals("��� ������ ���",q);
	}
	
	
	
	
	
	
	
	//*******************************************************
	//**
	//*******************************************************
	
	@Test
	public void testToString_1()
	{
		String q = ClassFunction.toString(0);
		assertEquals("���� ",q);
	}
	
	
	@Test
	public void testToString_2()
	{
		String q = ClassFunction.toString(873998);
		assertEquals("��������� ��������� ��� ������ ��������� ��������� ������ ",q);
	}
	
	@Test
	public void testToString_3()
	{
		String q = ClassFunction.toString(17);
		assertEquals("���������� ",q);
	}

	
	@Test
	public void testToString_4()
	{
		String q = ClassFunction.toString(591);
		assertEquals("������� ��������� ���� ",q);
	}
	
	@Test
	public void testToString_5()
	{
		String q = ClassFunction.toString(1290);
		assertEquals("���� ������ ������ ��������� ",q);
	}
	
	@Test
	public void testToString_6()
	{
		String q = ClassFunction.toString(54995);
		assertEquals("��������� ������ ������ ��������� ��������� ���� ",q);
	}
	
	@Test
	public void testToString_7()
	{
		String q = ClassFunction.toString(96399145);
		assertEquals("��������� ����� ��������� ������ ��������� ������ ����� ��� ����� ���� ",q);
	}
	
	
	
	
	
	
	//*******************************************************
	//**����� ���������� ����� ����� ������� � ��������� ���������� ������������
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
