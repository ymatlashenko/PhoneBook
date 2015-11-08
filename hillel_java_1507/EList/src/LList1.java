public class LList1 implements EList
{
	//---------------------------------------------
	// ����� Node ����� ������� � ���� �������
	//---------------------------------------------
	private class Node
	{
		int data;
		Node next = null;

		public Node(int val)
		{
			data = val;
		}
	}
	//---------------------------------------------
	// ��������� ���������� �� ��� � ������ �������
	//---------------------------------------------
	Node root = null;

	//==============================================
	//init
	//==============================================
	@Override
	public void init(int[] a)
	{
		/*if (a == null)
		{
			throw new ListIsEmptyException();
		}*/
		clear();
		if(a == null || a.length == 0)
		{
			Node root = null;
			return;
		}

		for (int i = a.length - 1; i >= 0; i--)
		{
			addStart(a[i]);
		}
	}
	//==============================================
	//toArray
	//==============================================
	@Override
	public int[] toArray()
	{
		int[] ar = new int[size()];
		Node tmp = root;
		int i = 0;
		while (tmp != null)
		{
			ar[i++] = tmp.data;
			tmp = tmp.next;
		}
		return ar;
	}

	//==============================================
	//addStart
	//==============================================
	@Override
	public void addStart(int val)
	{
		Node tmp = new Node(val);
		tmp.next = root;
		root = tmp;

	}
	//==============================================
	//addEnd
	//==============================================
	@Override
	public void addEnd(int val) 
	{
		if (size()==0||root == null)
		{
			root = new Node(val);
			return;
		}
		else 
		{
		Node cur = root;
		while(cur.next != null) 
		{
			cur = cur.next;
		}
		
		cur.next = new Node(val);
		}
	}
	//==============================================
	//addPos
	//==============================================
	@Override
	public void addPos(int pos, int val)
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		if(pos > size()-1 || pos < 0 || size()==0)
			throw new ListIsEmptyException();
		if (pos == 0)
		{
			addStart(val);
		} 
		else
		{
		Node tmp = root;
		Node tmpVal = new Node(val);
		for (int i = 1; i < pos; i++)
		{
			tmp = tmp.next;
		}
		tmpVal.next = tmp.next;
		tmp.next = tmpVal;
		}
	}
	//==============================================
	//delStart
	//==============================================
	@Override
	public int delStart()
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		if (size() == 1)
		{
			clear();
		} else
		{
			root = root.next;
		}
		return 0;
	}
	//==============================================
	//delEnd
	//==============================================
	@Override
	public int delEnd()
	{
		if (size() == 0)
			throw new ListIsEmptyException();

		if (size() == 1)
		{
			clear();
		} else
		{
			Node tmp = root;
			Node tempPreView = null;
			while (tmp.next != null)
			{
				tempPreView = tmp;
				tmp = tmp.next;
			}
			tempPreView.next = null;
		}
		return 0;
	}
	//==============================================
	//delPos
	//==============================================
	@Override
	public int delPos(int pos)
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		if(pos > size()-1 || pos < 0 || size()==0)
			throw new IllegalArgumentException();
		else if (size() == 1)
		{
			clear();
		} 
		else
		{
			Node tmp = root;
			Node tmpVal = null;
			for (int i = 0; i < pos; i++)
			{
				tmpVal = tmp;
				tmp = tmp.next;
			}
			tmpVal.next = tmp.next;
		}
		return 0;
	}
	//==============================================
	//max
	//==============================================
	@Override
	public int max()
	{
		if (size() == 0)
			throw new ListIsEmptyException();

		int ret = root.data;
		Node tmp = root.next;
		while (tmp != null)
		{
			if (tmp.data > ret)
			{
				ret = tmp.data;
			}
			tmp = tmp.next;
		}
		return ret;
	}
	//==============================================
	//min
	//==============================================
	@Override
	public int min()
	{
		if (size() == 0)
			throw new ListIsEmptyException();
			
		int ret = root.data;
		Node tmp = root.next;
		while (tmp != null)
		{
			if (tmp.data < ret)
			{
				ret = tmp.data;
			}
			tmp = tmp.next;
		}
		return ret;
	}
	//==============================================
	//minIndex
	//==============================================
	@Override
	public int minInd()
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		int minVal = root.data;
		int minIndex = 0;
		int count = 0;
		Node tmp = root.next;
		while (tmp != null)
		{
			count++;
			if (tmp.data < minVal)
			{
				minIndex = count;
				minVal = tmp.data;
			}
			tmp = tmp.next;
		}
		return minIndex;
	}
	//==============================================
	//maxIndex
	//==============================================
	@Override
	public int maxInd()
	{
		if (size() == 0)
		{
			throw new ListIsEmptyException();
		}
		int maxVal = root.data;
		int maxIndex = 0;
		int count = 0;
		Node tmp = root.next;
		while (tmp != null)
		{
			count++;
			if (tmp.data > maxVal)
			{
				maxIndex = count;
				maxVal = tmp.data;
			}
			tmp = tmp.next;
		}
		return maxIndex;
	}
	//==============================================
	//reverse
	//==============================================
	@Override
	public void reverse()
	{
		Node tmp = root;
		root = null;
		while (tmp != null)
		{
			addStart(tmp.data);
			tmp = tmp.next;
		}
	}
	//==============================================
	//sort
	//==============================================
	@Override
	public void sort()
	{
		if (size() == 0)
		{
		//	throw new ListIsEmptyException();
			return;
		}
		for (int i = size() - 1; i >= 1; i--)
		{
			boolean sorted = true;
			for (int j = 0; j < i; j++)
			{
				if (get(j) > get(j + 1))
				{
					int temp = get(j);
					set(j, get(j + 1));
					set(j + 1, temp);
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
	//set
	//==============================================
	@Override
	public void set(int pos, int val)
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		if(pos > size()-1 || pos < 0 || size()==0)
			throw new ListIsEmptyException();
		Node tmp = root;
		for (int i = 0; i < pos; i++)
		{
			tmp = tmp.next;
		}
		tmp.data = val;
	}
	//==============================================
	//get
	//==============================================
	@Override
	public int get(int pos)
	{
		if (size() == 0)
			throw new ListIsEmptyException();
		
		if(pos > size()-1 || pos < 0 || size()==0)
			throw new ListIsEmptyException();
		Node tNode = root;
		for (int i = 0; i < pos; i++)
		{
			tNode = tNode.next;
		}
		return tNode.data;
	}
	//==============================================
	//size
	//==============================================
	@Override
	public int size()
	{
		int ret = 0;
		Node tmp = root;
		while (tmp != null)
		{
			ret++;
			tmp = tmp.next;
		}
		return ret;
	}
	//==============================================
	//clear
	//==============================================
	@Override

	public void clear()
	{
		root = null;
	}
	//==============================================
	//halfReverse
	//==============================================
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




