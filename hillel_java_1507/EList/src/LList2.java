public class LList2 implements EList
{
	//---------------------------------------------
	// ����� Node ����� ������� � ��� �������
	//---------------------------------------------
	private class Node
	{
		int data;
		Node next = null;
		Node prev = null;

		public Node(int val)
		{
			data = val;
		}
	}

	Node rootStart = null;
	Node rootEnd = null;
	//==============================================
	//init
	//==============================================
	@Override
	public void init(int[] a)
	{
		clear();
		for (int i = a.length - 1; i >= 0; i--)
		{
			addStart(a[i]);
		}
//		if (a.length == 0)
//		{
//			addStart(0);
//		} else
//		{
//			
//		}
	}
	//==============================================
	//size
	//==============================================
	@Override
	public int size()
	{		
		int count = 0;
		Node tmp = rootStart;
		while (tmp != null)
		{
			count++;
			tmp = tmp.next;
		}
		return count;
	}
	//==============================================
	//clear
	//==============================================
	@Override
	public void clear()
	{
		rootStart = null;
		rootEnd = null;
	}
	//==============================================
	//addStart
	//==============================================
	@Override
	public void addStart(int val)
	{
		
			Node tmp = new Node(val);
			if (rootStart == null)
			{
				rootStart = tmp;
				rootEnd = tmp;
			} 
			else
			{
				tmp.next = rootStart;
				rootStart.prev = tmp;
				rootStart = tmp;
			}
		
	}
	//==============================================
	//addEnd
	//==============================================
	@Override
	public void addEnd(int val)
	{
		
			Node tmp = new Node(val);
			if (rootStart == null)
			{
				rootStart = tmp;
				rootEnd = tmp;
			} 
			else
			{
				tmp.prev = rootEnd;
				rootEnd.next = tmp;
				rootEnd = tmp;
			}
		
	}
	//==============================================
	//addPos
	//==============================================
	@Override
	public void addPos(int pos, int val)
	{
		Node tmp = new Node(val);
		Node rootTmp;
		if (pos > size())
		{
			throw new ListIsEmptyException();
		}
		if (pos == 0)
		{
			addStart(val);
		} 
		else if (pos == size())
		{
			addEnd(val);
		} 
		else
		{
			if (pos <= size() / 2)
			{
				rootTmp = rootStart;
				for (int i = 0; i < pos; i++)
				{
					rootTmp = rootTmp.next;
				}
			} else
			{
				rootTmp = rootEnd;
				for (int i = 1; i < size() - pos; i++)
				{
					rootTmp = rootTmp.prev;
				}
			}
			rootTmp.prev.next = tmp;
			tmp.prev = rootTmp.prev;
			tmp.next = rootTmp;
			rootTmp.prev = tmp;
		}
	}
	//==============================================
	//delStart
	//==============================================
	@Override
	public int delStart()
	{
		if (size() == 1)
		{
			clear();
		} 
		else
		{
			rootStart = rootStart.next;
			rootStart.prev = null;
		}
		return 0;
	}
	//==============================================
	//delEnd
	//==============================================
	@Override
	public int delEnd()
	{
		if (size() == 1)
		{
			clear();
		} 
		else
		{
			rootEnd = rootEnd.prev;
			rootEnd.next = null;
		}
		return 0;
	}
	//==============================================
	//delPos
	//==============================================
	@Override
	public int delPos(int pos)
	{
		
			Node rootTmp;
			if (pos == 0)
			{
				delStart();
			} else if (pos == size() - 1)
			{
				delEnd();
			} else
			{
				if (pos <= size() / 2)
				{
					rootTmp = rootStart;
					for (int i = 0; i < pos; i++)
					{
						rootTmp = rootTmp.next;
					}
				} else
				{
					rootTmp = rootEnd;
					for (int i = 1; i < size() - pos; i++)
					{
						rootTmp = rootTmp.prev;
					}
				}
				rootTmp.prev.next = rootTmp.next;
				rootTmp.next.prev = rootTmp.prev;
			}
			return 0;
		
	}
	//==============================================
	//max
	//==============================================
	@Override
	public int max()
	{
		if(size() == 0 && rootStart == null )
		{
			   throw new ListIsEmptyException();
		}
		else
		{
		Node tmp = rootStart.next;
		int res = rootStart.data;
		while (tmp != null)
		{
			if (tmp.data > res)
			{
				res = tmp.data;
			}
			tmp = tmp.next;
		}
		return res;
		}
	}
	//==============================================
	//min
	//==============================================
	@Override
	public int min()
	{
		if(size() == 0 && rootStart == null )
			   throw new NullPointerException();
		
		Node tmp = rootStart.next;
		int res = rootStart.data;
		while (tmp != null)
		{
			if (tmp.data < res)
			{
				res = tmp.data;
			}
			tmp = tmp.next;
		}
		return res;
	}
	//==============================================
	//minIndex
	//==============================================
	@Override
	public int minInd()
	{
		Node tmp = rootStart.next;
		int min = rootStart.data;
		int count = 1;
		int res = 0;
		while (tmp != null)
		{
			if (tmp.data < min)
			{
				min = tmp.data;
				res = count;
			}
			tmp = tmp.next;
			count++;
		}
		return res;
	}
	//==============================================
	//maxIndex
	//==============================================
	@Override
	public int maxInd()
	{
		if(size() == 0 && rootStart == null )
		{
			   throw new ListIsEmptyException();
		}
		Node tmp = rootStart.next;
		int max = rootStart.data;
		int count = 1;
		int res = 0;
		while (tmp != null)
		{
			if (tmp.data > max)
			{
				max = tmp.data;
				res = count;
			}
			tmp = tmp.next;
			count++;
		}
		return res;
	}
	//==============================================
	//reverse
	//==============================================
	@Override
	public void reverse()
	{
		Node temp = rootStart;
		rootStart = null;
		while (temp != null)
		{
			addStart(temp.data);
			temp = temp.next;
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
	//toArray
	//==============================================
	@Override
	public int[] toArray()
	{
		int[] res;
		
			Node tmp = rootStart;
			res = new int[size()];
			int i = 0;
			while (tmp != null)
			{
				res[i++] = tmp.data;
				tmp = tmp.next;
			}
		
		return res;
	}
	//==============================================
	//set
	//==============================================
	@Override
	public void set(int pos, int val)
	{
		int size = size();
		Node rootTmp;
		if (pos == 0)
		{
			rootStart.data = val;
		} else if (pos == size)
		{
			rootStart.prev.data = val;
		} else
		{
			if (pos <= size / 2)
			{
				rootTmp = rootStart;
				for (int i = 0; i < pos; i++)
				{
					rootTmp = rootTmp.next;
				}
			} else
			{
				rootTmp = rootEnd;
				for (int i = 1; i < size - pos; i++)
				{
					rootTmp = rootTmp.prev;
				}
			}
			rootTmp.data = val;
		}
	}
	//==============================================
	//get
	//==============================================
	@Override
	public int get(int pos)
	{
		Node rootTmp;
		if (pos == 0)
		{
			return rootStart.data;
		} else if (pos == size())
		{
			return rootStart.prev.data;
		} else
		{
			if (pos <= size() / 2)
			{
				rootTmp = rootStart;
				for (int i = 0; i < pos; i++)
				{
					rootTmp = rootTmp.next;
				}
			} else
			{
				rootTmp = rootEnd;
				for (int i = 1; i < size() - pos; i++)
				{
					rootTmp = rootTmp.prev;
				}
			}
			return rootTmp.data;
		}
	}
	//==============================================
	//halfReverse
	//==============================================
	@Override
	public void halfReverse() 
	{
		if(rootStart == null)
		{
			   throw new NullPointerException();
		}
		int size = size();
		
		if (size == 0)
			throw new NullPointerException();

		int cpos;
		if (size % 2 == 0)
		{
			cpos = size / 2;
		} 
		else
		{
			cpos = size / 2 + 1;
		}
		for (int i = 0, j = cpos; j < size; i++, j++)
		{
			int temp = get(i);
			set(i, get(j));
			set(j, temp);
		}
	}

}
