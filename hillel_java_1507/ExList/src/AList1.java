
/*В этой версии AList1 объявляем массив в 10 элементов, 
 * рабочая область определяется: начало - начало масива 
 * 								 конец - индекс
 */
public class AList1 implements ExList
{
	private int[] arr = new int[10];
	private int index = 0;

	//==============================================
	//size
	//==============================================

	@Override
	public int size()
	{
		return index;
	}

	//==============================================
	//init
	//==============================================	
	@Override
	public void init(int[] ini)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		}
		clear();
		for (int i = 0; i < ini.length; i++)
		{
			this.arr[i] = arr[i];
		}
		index = arr.length;
	}
	
	//==============================================
	//toArray
	//==============================================	
	@Override
	public int[] toArray()
	{
		int[] temp = new int[index];
		for (int i = 0; i < index; i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}
	
	@Override
	//==============================================
	//clear
	//==============================================
	public void clear()
	{
		index = 0;
	}

	@Override
	//==============================================
	//get
	//==============================================
	public int get(int pos)
	{
		if (pos >= index)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[pos];
	}


	@Override
	//==============================================
	//addStart
	//==============================================
	public void addStart(int val)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		}
		index++;
		int[] tmp = new int[arr.length];
		for (int i = 1; i < size(); i++)
		{
			tmp[i] = arr[i - 1];
		}
		tmp[0] = val;
		arr = tmp;
	}

	@Override
	//==============================================
	//addEnd
	//==============================================

	public void addEnd(int val)
	{
		arr[index++] = val;
	}


	@Override
	//==============================================
	//addPos
	//==============================================

	public void addPos(int pos, int val)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		} else if (pos > arr.length)
		{
			throw new NullPointerException();
		}
		index++;
		for (int i=index; i==pos; i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos]=val;
/*		int[] temp = new int[arr.length];
		for (int i = 0; i < size(); i++)
			if (i < pos)
			{
				temp[i] = arr[i];
			} 
			else if (i == pos)
			{
				temp[pos] = val;
			} 
			else
			{
				temp[i] = arr[i - 1];
			}
		arr = temp;
		*/
	}

	@Override
	//==============================================
	//delStart
	//==============================================

	public void delStart()
	{
		if (index == 0)
		{
			throw new NegativeArraySizeException();
		}
		index--;
		int[] tmp = new int[arr.length];
		for (int i = 0; i < size(); i++)
		{
			tmp[i] = arr[i + 1];
		}
		arr = tmp;
	}

	@Override
	//==============================================
	//delEnd
	//==============================================
	public void delEnd()
	{
		if (index == 0)
		{
			throw new NegativeArraySizeException();
		}
		index--;
	}

	@Override
	//==============================================
	//delPos
	//==============================================

	public void delPos(int pos)
	{
		if (pos >= index)
		{
			throw new NegativeArraySizeException();
		}
		for (int i = pos; i < index; i++)
		{
			arr[i] = arr[i + 1];
		}
		index--;
	}

	
	@Override
	//==============================================
	//min
	//==============================================
	public int min()
	{
		if (index == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int min = arr[0];
		for (int i = 0; i < index; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	@Override
	//==============================================
	//max
	//==============================================

	public int max()
	{
		if (index == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int max = arr[0];
		for (int i = 0; i < index; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}


	@Override
	//==============================================
	//minIndex
	//==============================================

	public int maxIndex()
	{
		if (index == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int indexRes = 0;
		int max = arr[0];
		for (int i = 1; i < index; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
				indexRes = i;
			}
		}
		return indexRes;
	}

	@Override
	//==============================================
	//maxIndex
	//==============================================
	public int minIndex()
	{
		if (index == 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int indexRes = 0;
		int min = arr[0];
		for (int i = 1; i < index; i++)
		{
			if (arr[i] < min)
			{
				indexRes = i;
				min = arr[i];
			}
		}
		return indexRes;
	}

	
	@Override
	//==============================================
	//sort
	//==============================================

	public void sort()
	{
		for (int i = index - 1; i >= 1; i--)
		{
			boolean sorted = true;
			for (int j = 0; j < i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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
	//==============================================
	//reverse
	//==============================================

	public void reverse()
	{
		int j = 0;
		for (int i = index-1 ; i >= 0; i--)
		{
			if (i>=j) 
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}


	@Override
	//==============================================
	//halfreverse
	//==============================================

	public void halfReverse()
	{
		if (arr == null || arr.length == 0)
			throw new NullPointerException();

		int cpos;
		if (index % 2 == 0)
		{
			cpos = index / 2;
		} 
		else
		{
			cpos = index / 2 + 1;
		}
		for (int i = 0, j = cpos; j < index; i++, j++)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
		}

	}
	
	//==============================================
	//setArray
	//==============================================
	@Override
	public void setArray(int[] a)
	{
		init(a);
	}

	@Override
	public void set(int pos, int val)
	{
		if (pos >= index)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[pos] = val;
	}

	//================================================
	//getArray  забираем массив для теста
	//================================================
	@Override
	public int[] getArray()
	{
		int[] temp = new int[index];
		for (int i = 0; i < index; i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}
}
