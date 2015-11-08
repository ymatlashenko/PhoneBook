
public class ClassConditionalOperators 
{

	public static void main(String[] args) 
	{
		int a=4;
		Boolean b=even (a);
		System.out.println(b);
	}
		
// 1 *************************************
	public static Boolean even(int a)
	{
		Boolean ret;
		if ((a%2)==0)
		{
			ret = true ;
		}	
		else 
		{
			ret = false ;
		}
		
		return ret;
	}
	
	
	// 2 *************************************	
	public static int quater(int x, int y)
	{
		int ret=0;
		if(x>0 && y>0)
		{
			ret = 1 ;
		}	
		else if (x<0 && y>0)
		{
			ret = 2 ;
		}
		else if (x<0 && y<0)
		{
			ret = 3;
		}
		else if (x>0 && y<0)
		{
			ret = 4;
		}
		return ret;
	}
	
	// 3 *************************************
	public static int sumPositivNumbers (int a, int b, int c)
	{
		int res = 0;
		if (a>0) 
		{
			res = res+a;
		}
		if (b>0)
		{
			res = res+b;
		}
		if (c>0)
		{
			res = res + c;
		}
		return res;
	}

	// 4 *************************************
	public static int maxPlus3 (int a, int b, int c)
	{
		int res = 0;
		if ((a>=b) && (a>=c))
		{
			res = a+3;
		}
		if ((b>=a) && (b>=c))
		{
			res = b+3;
		}
		if ((c>=a) && (c>=b))
		{
			res = c+3;
		}
		return res;
	}
	
	// 5 *************************************
	public static String rating (int a)
	{
		String res=null;
		if (a >= 0 && a <= 19)
		{
			res = "F";
			
		}else if (a >= 20 && a <= 39)
		{
			res = "E";
			
		}
		else if (a >= 40 && a <= 59)
		{
			res = "D";
			
		}else if ((a)>=(60) && (a)<=(74))
		{
			res = "C";
			
		}else if ((a)>=(75) && (a)<=(89))
		{
			res = "B";
			
		}else if ((a)>=(90) && (a)<=(100))
		{
			res = "A";
			
		}
		return res;
	}

}
