
public class ClassArray 
{
	
	
	//***************
	//* min element *
	//***************
	public static int minElement (int arr[])
	{

		int length= arr.length;
		int min = arr[0];
		for (int i=0; i<length; i++)
		{
			if (arr[i] < min)	
			{
				min=arr[i];
			}
		}
		return min;
	}

	
	
	//***************
	//* max element *
	//***************

	public static int maxElement (int arr[])
	{

		int length= arr.length;
		int max = 0;
		for (int i=0; i<length; i++)
		{
			if (arr[i] > max)	
			{
				max=arr[i];
			}
		}
		return max;
	}

	
	
	//******************
	//* id max element *
	//******************

	public static int idMaxElement (int arr[])
	{

		int length= arr.length;
		int max = 0;
		int idMax = 0;
		for (int i=0; i<length; i++)
		{
			if (arr[i] > max)	
			{
				max=arr[i];
				idMax = i;

			}
		}

		return idMax;
	}

	
	
	//******************
	//* id min element *
	//******************

	public static int idMinElement (int arr[])
	{

		int length= arr.length;
		int min = 0;
		int idMin = 0;
		for (int i=0; i>length; i++)
		{
			if (arr[i] < min)	
			{
				min=arr[i];
				idMin = i;

			}
		}

		return idMin;
	}
	
	
	
	//********************
	//* sum Odd element *
	//********************

	public static int sumOddElement (int arr[])
	{
		int length= arr.length;
		int sum = 0;
		for (int i=0; i<length; i++)
		{
			if (i%2!=0)
			{
				sum = sum + arr[i];
			}							
		}
		return sum;

	}

	//*****************
	//* reverse array *
	//*****************

	public static int [] reverseArray (int arr[])
	{
		int length= arr.length;
		int tmp = 0;
		for (int i=0; i<length/2; i++)
		{
			tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=tmp;					
		}
		return arr;

	}
	
	
		//*************************************
		//* кол-во нечетных элементов массива *
		//*************************************

	public static int quantityOddElement (int arr[])
	{
		int quantity =0;
		int length= arr.length;
		for (int i=0; i<length; i++)
		{
			
			if (arr[i]%2 != 0)
			{
				quantity = quantity+1;
			}
							
		}
		
		return quantity;
	}
	
	
	
	
	
	
	
	//***************************************************
	//*ѕомен€ть местами первую и вторую половину массива*
	//***************************************************

	
	public static int [] swapHalf (int arr[])
	{
		int mod = arr.length%2;
		for (int i=0; i<arr.length/2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[arr.length/2+i+mod];
			arr[arr.length/2+i+mod]=tmp;					
		}
		return arr;
	}
	

	//**************************************************
	//*ќтсортировать массив пузырьком (Bubble)         *
	//**************************************************
//	for(int i = 0; i < a.length - 1; i++)
//	    for(int j = 0; j < a.length - i - 1; j++)
//	        if(a[j] > a[j + 1])
//	            swap(a[j], a[j + 1]);
	public static int [] sortBubble (int arr[])
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=tmp;	
				}
			}
		}
		return arr;
		
	}


	//*************************************************
	//*ќтсортировать массив  выбором (Select)         *
	//*************************************************

	
	public static int[] sortSelect (int[] arr)
	{
	    int min, temp;

	    for (int index = 0; index < arr.length-1; index++)
	    {
	        min = index;
	        for (int scan = index+1; scan < arr.length; scan++)
	            if (arr[scan] < arr[min])
	                min = scan;

	        // Swap the values
	        temp = arr[min];
	        arr[min] = arr[index];
	        arr[index] = temp;
	    }
	    return arr;
	}
	
	
	

	//***************************************************
	//*ќтсортировать массив  вставками (Insert)         *
	//***************************************************


	public static int [] sortInsert(int[] arr) 
	{
	    for(int i = 1; i < arr.length; i++)
	    {
	        int temp = arr[i];
	        int prevKey = i - 1;
	            while(prevKey >= 0 && arr[prevKey] > temp)
	            {
	                arr[prevKey+1] = arr[prevKey];
	                arr[prevKey] = temp;
	                prevKey--;
	            }
	    }
	    return arr;
	}








}


