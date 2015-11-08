public class AList0 
{

	//==============================================
	//init
	//==============================================	
	private int[] ar = {};

	public void init(int[] ini)
	{
		ar = new int[ini.length];
		for (int i = 0; i < ini.length; i++) 
		{
			ar[i] = ini[i];
		}
	}
	//==============================================
	//addEnd
	//==============================================
	public void addEnd(int val)
	{
		int[] tmp = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++) 
		{
			tmp[i] = ar[i];
		}
		tmp[ar.length] = val;
		ar = tmp;
	}
	//==============================================
	//addStart
	//==============================================
	public void addStart(int val)
	{
		if (ar == null)
		{
			throw new NullPointerException();
		}
		int[] tmp = new int[ar.length + 1];
		for (int i = 1; i < tmp.length; i++)
		{
			tmp[i] = ar[i - 1];
		}
		tmp[0] = val;
		ar = tmp;
	}
	//==============================================
	//addPos
	//==============================================

	public void addPos(int pos, int val)
	{
		if (ar == null)
		{
			throw new NullPointerException();
		} else if (pos > ar.length)
		{
			throw new NullPointerException();
		}
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < pos; i++)
		{
			temp[i] = ar[i];
		}
		temp[pos] = val;
		for (int i = pos + 1; i < temp.length; i++)
		{
			temp[i] = ar[i - 1];
		}
		ar = temp;
	}

	//==============================================
	//delStart
	//==============================================


	public void delStart()
	{
		if (ar.length == 0)
		{
			throw new NegativeArraySizeException();
		}
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i + 1];
		}
		ar = temp;
	}

	//==============================================
	//delEnd
	//==============================================


	public void delEnd()
	{
		if (ar.length == 0)
		{
			throw new NegativeArraySizeException();
		}
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i];
		}
		ar = temp;
	}

	//==============================================
	//delPos
	//==============================================

	public void delPos(int pos)
	{
		if (ar.length == 0)
			throw new IndexOutOfBoundsException();
		int[] temp = new int[ar.length - 1];
		if (pos<=temp.length)
		{
			for (int i = 0; i < pos; i++)
			{
				temp[i] = ar[i];
			}
			for (int i = pos; i < temp.length; i++)
			{
				temp[i] = ar[i + 1];
			}
			ar = temp;
		}
	}


	//==============================================
	//clear
	//==============================================
	public void clear()
	{
		init(new int[0]);
	}
	//==============================================
	//max
	//==============================================

	public int max()
	{
		if (ar.length == 0)
			throw new IndexOutOfBoundsException();

		int max = ar[0];
		for(int i=0; i < ar.length; i++)
		{
			if (ar[i] > max)
			{
				max = ar[i];
			}
		}
		return max;
	}
	//==============================================
	//min
	//==============================================

	public int min()
	{
		if (ar.length == 0)
			throw new IndexOutOfBoundsException();

		int min = ar[0];
		for(int i=0; i < ar.length; i++)
		{
			if (ar[i] < min)
			{
				min = ar[i];
			}
		}
		return min;
	}
	//==============================================
	//print
	//==============================================

	public void print() 
	{
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	//==============================================
	//size
	//==============================================
	public int size()
	{
		return ar.length;
	}
	//==============================================
	//minIndex
	//==============================================

	public int minIndex()
	{
		if (ar.length == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int res = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] < ar[res])
			{
				res = i;
			}
		}
		return res;
	}

	//==============================================
	//maxIndex
	//==============================================

	public int maxIndex()
	{
		if (ar.length == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int res = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] > ar[res])
			{
				res = i;
			}
		}
		return res;
	}

	//==============================================
	//reverse
	//==============================================

	public void reverse()
	{
		int j = 0;
		for (int i = ar.length-1 ; i >= 0; i--)
		{
			if (i>=j) 
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j]=temp;
				j++;
			}
		}

	}

	//==============================================
	//sort
	//==============================================

	public void sort()
	{
		for (int i = ar.length - 1; i >= 1; i--)
		{
			boolean sorted = true;
			for (int j = 0; j < i; j++)
			{
				if (ar[j] > ar[j + 1])
				{
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted)
			{
				break;
			}
		}
	}
	//==============================================
	//halfreverse
	//==============================================

	public void halfreverse()
	{
		if (ar == null || ar.length == 0)
			throw new NullPointerException();

		int cpos;
		if (ar.length % 2 == 0)
		{
			cpos = ar.length / 2;
		} 
		else
		{
			cpos = ar.length / 2 + 1;
		}
		for (int i = 0, j = cpos; j < ar.length; i++, j++)
		{
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j]=temp;
		}

	}
	//================================================
	//забираем массив для теста
	//================================================
	public int[] getArr()
	{
		int[] res = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
		{
			res[i] = ar[i];
		}
		return res;
	}
}