
/*Лист у которого масив всегода имеет 100 элементов, 
 * а его рабочая область определяется: начало - переменной Start 
 * и конец - переменной End
 */
public class AList2 implements ExList
{
	private int[] arr = new int[100];
	private int Start = arr.length / 2;
	private int End = Start;

	@Override
	public void setArray(int[] a)
	{
		init(a);
	}

	@Override
	public void init(int[] a)
	{
		if (a == null)
		{
			throw new NullPointerException();
		}
		clear();
		for (int i = 0; i < a.length; i++)
		{
			arr[End++] = a[i];
		}
	}

	@Override
	public int[] getArray()
	{
		int[] temp = new int[size()];
		for (int i = 0; i < size(); i++)
		{
			temp[i] = arr[Start + i];
		}
		return temp;
	}

	@Override
	public int[] toArray()
	{
		return getArray();
	}

	@Override
	public int size()
	{
		return End - Start;
	}

	@Override
	public void clear()
	{
		Start = arr.length / 2;
		End = Start;
	}

	@Override
	public void addStart(int val)
	{
		arr[--Start] = val;
	}

	@Override
	public void addEnd(int val)
	{
		arr[End++] = val;

	}

	@Override
	public void addPos(int pos, int val)
	{
		End++;
		int i = End;
		while (i > Start + pos)
		{
			arr[i] = arr[i - 1];
			i--;
		}
		arr[Start + pos] = val;
	}

	@Override
	public void delPos(int pos)
	{
		if (size() == 0)
			throw new NegativeArraySizeException();
		for (int i = pos; i < size(); i++)
		{
			arr[Start + i] = arr[Start + 1 + i];
		}
		End--;
	}

	@Override
	public void delStart()
	{
		if (size() == 0)
		{
			throw new NegativeArraySizeException();
		}
		Start++;

	}

	@Override
	public void delEnd()
	{
		if (size() == 0)
		{
			throw new NegativeArraySizeException();
		}
		End--;

	}

	@Override
	public int max()
	{
		if (size() == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int chMax = arr[Start];
		for (int i = 0; i < size(); i++)
		{
			if (arr[Start + i] > chMax)
			{
				chMax = arr[Start + i];
			}
		}
		return chMax;
	}

	@Override
	public int min()
	{
		if (size() == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int chMax = arr[Start];
		for (int i = 0; i < size(); i++)
		{
			if (arr[Start + i] < chMax)
			{
				chMax = arr[Start + i];
			}
		}
		return chMax;
	}

	@Override
	public int minIndex()
	{
		if (size() == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int indexRes = 0;
		int chMax = arr[Start];
		for (int i = 1; i < size(); i++)
		{
			if (arr[Start + i] < chMax)
			{
				chMax = arr[Start + i];
				indexRes = i;
			}
		}
		return indexRes;
	}

	@Override
	public int maxIndex()
	{
		if (size() == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int indexRes = 0;
		int chMax = arr[Start];
		for (int i = 1; i < size(); i++)
		{
			if (arr[Start + i] > chMax)
			{
				chMax = arr[Start + i];
				indexRes = i;
			}
		}
		return indexRes;
	}

	@Override
	public void reverse()
	{
		int[] resArr = new int[size()];
		int j = 0;
		for (int i = size() - 1; i >= 0; i--)
		{
			resArr[j] = arr[Start + i];
			j++;
		}
		clear();
		init(resArr);
	}

	@Override
	public void sort()
	{
		for (int i = size() - 1; i >= 1; i--)
		{
			boolean sorted = true;
			for (int j = 0; j < i; j++)
			{
				if (arr[Start + j] > arr[Start + j + 1])
				{
					int temp = arr[Start + j];
					arr[Start + j] = arr[Start + j + 1];
					arr[Start + j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted)
			{
				break;
			}
		}

	}

	@Override
	public void set(int pos, int val)
	{
		if ((End - Start) == 0)
			throw new ArrayIndexOutOfBoundsException();
		arr[Start + pos] = val;

	}

	@Override
	public int get(int pos)
	{
		if ((End - Start) == 0)
			throw new ArrayIndexOutOfBoundsException();
		return arr[Start + pos];
	}

	@Override
	public void halfReverse() {
		// TODO Auto-generated method stub
		
	}
}
