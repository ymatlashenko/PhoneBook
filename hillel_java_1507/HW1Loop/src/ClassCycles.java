

public class ClassCycles
{
	// 1_1 ***Сумма четных чисел*****************************
	//*******************************************************
	public static int sumOfEven1to99 ()
	{
		int sumOfEvenNumbers = 0;
		for (int i=1; i<99; ++i)
		{
			if ((i%2) == 0) 
			{
				sumOfEvenNumbers = sumOfEvenNumbers + i;
			}
		}
		return sumOfEvenNumbers;
	}

	// 1_2 ***Количество четных чисел************************
	//*******************************************************

	public static int amountOfEven1to99 ()
	{
		int amountOfEvenNumbers = 0;
		for (int i=1; i<99; ++i)
		{
			if ((i%2) == 0) 
			{
				amountOfEvenNumbers = amountOfEvenNumbers +1;
			}
		}
		return amountOfEvenNumbers;
	}

	// 2 ***простое ли число*****************************
	//***************************************************

	public static Boolean primeNumber (int a) 
	{
		boolean whetherANumberIsPrime = false;
		for (int i=2; i<a; ++i)
		{
			if ((a%i) == 0) 
			{
				whetherANumberIsPrime = true;	
			}else
			{
			}
		}
		return whetherANumberIsPrime;


	}	
	// 3 ***Найти корень натурального числа******************
	//*******************************************************


	public static int root  (int number) 
	{
		for (int i=1; i<number; ++i)
		{
			if ((i*i) >= number)
			{
				number = i;
				break ;
			}
			else
			{
			}
			
		}
		return number;
	}

	// 4 ***Вычислить факториал числа n. n! = 1*2*…*n-1*n;!**
	//*******************************************************

	public static int factorial  (int number) 
	{
		int a = 1;

		for (int i=1;i<number;++i)
	{
		a=a*(i+1) ;	
	}
		return a;
	}
	// 5 ***Посчитать сумму цифр заданного числа*************
	//*******************************************************

	public static int sumNum  (int number) 
	{
		int a=0;
		int b=0;
		while (number>0)
		{
			a=number%10;
			number=number/10;		 
			b=b+a;
		}  
		return b;
	}
	


	// 6 *** Отзеркалить число ******************************
	//*******************************************************
	public static int mirrorNum  (int number) 
	{
		int a=0;
		String str="";
		while (number>0)
		{
			a=number%10;
			number=number/10;		 
		    str= str+Integer.toString(a);
		}  
		return Integer.parseInt(str);
	}

}



