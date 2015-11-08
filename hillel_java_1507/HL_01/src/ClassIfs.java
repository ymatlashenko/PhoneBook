
public class ClassIfs
{

	public static void main(String[] args)
	{
		int x=1;
		int y=2;
		
		int q = quater(x,y);
		System.out.println(q);
	}

	public static int quater(int x, int y)
	{
		if (x==0 || y==0)
		
			throw new IllegalArgumentException();
		
		
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

}