
public class AList0
{
	private int[] ar = {};

//****************************************************
//********   Metod for test     *********************
//****************************************************
	public int [] retArr()						//****
	{											//****
		return ar;								//****
	}											//****
//****************************************************
//****************************************************
//****************************************************


	public void init(int[] ini)
	{
		ar = new int[ini.length];
		for (int i = 0; i < ini.length; i++) 
		{
			ar[i] = ini[i];
		}
	}

	public void addEnd(int val)
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int[] tmp = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++) 
		{
			tmp[i] = ar[i];
		}
		tmp[ar.length] = val;
		ar = tmp;
	}

	public void addStart(int val)
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int[] tmp = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++) 
		{
			tmp[i+1] = ar[i];
		}
		tmp[0] = val;
		ar = tmp;
	}

	public void clear()
	{

		int[] tmp = new int[0];
		ar = tmp;

	}
	public int min()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();

		int min = ar[0];
		//for (int i : ar)
		for(int i=0; i < ar.length; i++)
		{
			if (ar[i] < min)
			{
				min = ar[i];
			}
		}
		return min;
	}

	public int max()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();

		int max = ar[0];
		//for (int i : ar)
		for(int i=0; i < ar.length; i++)
		{
			if (ar[i] > max)
			{
				max = ar[i];
			}
		}
		return max;
	}

	public int minID()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int minID = 0;
		int min = ar[0];
		//for (int i : ar)
		for(int i=0; i < ar.length-1; i++)
		{
			if (ar[i] < min)
			{
				minID = i;
				min = ar[i];
			}
		}
		return minID;
	}

	public int maxID()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int maxID = 0;
		int max = ar[0];
		//for (int i : ar)
		for(int i=1; i < ar.length; i++)
		{
			if (ar[i] > max)
			{
				maxID = i;
				max = ar[i];
			}
		}
		return maxID;
	}


	public void print() 
	{
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	public int size() 
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		return ar.length;
	}

	public void sort()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		for(int i = 0; i < ar.length - 1; i++)
		{
			for(int j = 0; j < ar.length - i - 1; j++)
			{
				if(ar[j] > ar[j + 1])
				{
					int tmp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1]=tmp;	
				}
			}
		}
	}


	public void reverse()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int length= ar.length;
		int tmp = 0;
		for (int i=0; i<length/2; i++)
		{
			tmp = ar[i];
			ar[i] = ar[ar.length-1-i];
			ar[ar.length-1-i]=tmp;					
		}
	}

	public void halfReverse() 
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int mod = ar.length%2;
		for (int i=0; i<ar.length/2; i++)
		{
			int tmp = ar[i];
			ar[i] = ar[ar.length/2+i+mod];
			ar[ar.length/2+i+mod]=tmp;					
		}
	}

	public void delStart()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int[] tmp = new int[ar.length-1];
		for (int i = 0; i < ar.length-1; i++) 
		{
			tmp[i] = ar[i+1];
		}
		ar = tmp;
	}

	public void delEnd()
	{
		if (ar.length == 0)
			throw new IllegalArgumentException();
		int[] tmp = new int[ar.length-1];
		for (int i = 0; i < ar.length-1; i++) 
		{
			tmp[i] = ar[i];
		}
		ar = tmp;
	}

	public void delPos(int val)
	{
		if (ar.length == 0 || val>ar.length-1)
			throw new IllegalArgumentException();
		int[] tmp = new int[ar.length-1];
		for (int i = 0; i < ar.length; i++) 
		{
			if (i<val)
			{
				tmp[i] = ar[i];
			}
			else if (i==val){}
			else if (i>val)
			{
				tmp[i-1] = ar[i];
			}
		}
		ar = tmp;
	}

	public void addPos(int pos, int val)
	{
		if (pos>ar.length-1 || ar.length == 0)
		{
			throw new IllegalArgumentException();//выдать исключение
		}
		else
		{
			int[] tmp = new int[ar.length+1];
			for (int i = 0; i < ar.length+1; i++) 
			{
				if (i<pos)
				{
					tmp[i] = ar[i];
				}
				else if (i==pos)
				{
					tmp[i] = val;
				}
				else if (i>pos)
				{
					tmp[i] = ar[i-1];
				}
			}
			ar = tmp;
		}
	}
}
