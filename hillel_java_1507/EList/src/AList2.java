
public class AList2 implements EList {
	private int maxLength = 100;
	private int[] arr = new int[maxLength];
	private int start = 50;
	private int end = 49;


	@Override
	public int size() 
	{
		//System.out.println(end-start+1);
		return end-start+1;

	}

	@Override
	public void init(int[] ini)
	{
		if (ini == null|| ini.length == 0)
		{
			ini = new int[0];
			start = 50;
			end = 49;
		}
		else
		{
			int d = (ini.length%2==0)?0:1;
			start = (maxLength/2 - ini.length/2);
			end = (maxLength/2 + ini.length/2)-1+d;
			arr = new int[100];
			int j = 0;
			for (int i = start; i <= end; i++) 
			{
				arr[i] = ini[j];
				j++;
			}
		}

	}

	@Override
	public int[] toArray()
	{
		int[] temp = new int[end-start+1];
		int j=0;
		for (int i = start; i <= end; i++)

		{

			temp[j] = arr[i];
			System.out.println(arr[i]);
			j++;
		}
		return temp;
	}

	@Override
	public void clear() 
	{
		init (null);
	}

	@Override
	public int get(int pos) 
	{
		if(pos > size()-1 || pos < 0)
			throw new ListIsEmptyException();

		return arr[start+pos];
	}

	@Override
	public void set(int pos, int val) 
	{
		if(pos > size()-1 || pos < 0)
			throw new ListIsEmptyException();

		arr[start+pos]=val;
	}

	@Override
	public void addStart(int val) 
	{

		start--;
		arr[start]=val;
	}

	@Override
	public void addEnd(int val)
	{
		end++;
		arr[end]=val;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if(pos > size()-1 || pos < 0)
			throw new ListIsEmptyException();

		for (int i=end;i>=start+pos;i--)
		{
			arr[i+1]=arr[i];
		}

		arr[start+pos]=val;
		end++;

	}

	@Override
	public int delStart() 
	{
		if(size()==0)
			throw new ListIsEmptyException();
		
		int tmp=arr[start];
		arr[start]=0;
		start++;
		return tmp;
	}

	@Override
	public int delEnd() 
	{
		if(size()==0)
			throw new ListIsEmptyException();
		int tmp=arr[end];
		arr[end]=0;
		end--;
		return tmp;
	}

	@Override
	public int delPos(int pos)
	{	
		
		
		if(size()==0)
			throw new ListIsEmptyException();
		if(pos > size()-1 || pos < 0 || size()==0)
			throw new IllegalArgumentException();
		
		
		int tmp=arr[start+pos]; 
		for (int i=start+pos; i<=end; i++)
		{
			arr[i]=arr[i+1];
		}
		end--;
		return tmp;
	}

	@Override
	public int min()
	{
		if(size()==0)
			throw new ListIsEmptyException();
		int min=arr[start];
		for (int i = start+1;i<=end;i++)
		{
			if (arr[i]<min)
			{
				min = arr[i];
			}
		}


		return min;
	}

	@Override
	public int max() 
	{
		if(size()==0)
			throw new ListIsEmptyException();
		int max=arr[start];
		for (int i = start+1;i<=end;i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}


		return max;
	}

	@Override
	public int minInd() 
	{
		if(size()==0)
			throw new ListIsEmptyException();
		int min=start;
		for (int i = start+1;i<=end;i++)
		{
			if (arr[i]<arr[min])
			{
				min = i;
			}
		}


		return min-start;
	}

	@Override
	public int maxInd() 
	{
		if(size()==0)
			throw new ListIsEmptyException();
		int max=start;
		for (int i = start+1;i<=end;i++)
		{
			if (arr[i]>arr[max])
			{
				max = i;
			}
		}


		return max-start;		
	}

	@Override
	public void sort()
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		for (int i = size() - 1; i >= 1; i--)
		{
			boolean sorted = true;
			for (int j = 0; j < i; j++)
			{
				if (arr[start + j] > arr[start + j + 1])
				{
					int temp = arr[start + j];
					arr[start + j] = arr[start + j + 1];
					arr[start + j + 1] = temp;
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
	public void reverse() 
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		int[] resArr = new int[size()];
		int j = 0;
		for (int i = size() - 1; i >= 0; i--)
		{
			resArr[j] = arr[start + i];
			j++;
		}
		clear();
		init(resArr);
	
 
	}

	@Override
	public void halfReverse() 
	{
		if (size() == 0)
			throw new ListIsEmptyException();

		int cpos;
		if (size() % 2 == 0)
		{
			cpos = size() / 2;
		} 
		else
		{
			cpos = size() / 2 + 1;
		}
		for (int i = 0, j = cpos; j < size(); i++, j++)
		{
			int temp = get(i);
			set(i, get(j));
			set(j, temp);
		}
	}

}
