import static org.junit.Assert.*;

import org.junit.Test;

public class ClassIfsTest
{

	@Test
	public void testQuater_1()
	{
		
		
		int q = ClassIfs.quater(1,1);
		assertEquals(1,q);
	}
	@Test
	public void testQuater_2()
	{
		
		
		int q = ClassIfs.quater(-2,4);
		assertEquals(2,q);
	}
	@Test
	public void testQuater_3()
	{
		
		
		int q = ClassIfs.quater(-2,-1);
		assertEquals(3,q);
	}
	@Test
	public void testQuater_4()
	{
		
		
		int q = ClassIfs.quater(4,-6);
		assertEquals(4,q);
	}
	@Test(expected=Ill)
	public void testQuater_zero5()
	{
		
	}

}
