import static java.lang.Math.*;

public class ClassFunction 
{



	//*******************************************************
	//**ѕолучить строковое название дн€ недели по номеру дн€* 
	//*******************************************************

	public static String weekNumToString (int a)
	{
		if (a==1)
		{
			return "понедельник";
		}else if (a==2)
		{
			return "вторник";
		}else if (a==3)
		{
			return "среда";
		}else if (a==4)
		{
			return "четверг";
		}else if (a==5)
		{
			return "п€тница";
		}else if (a==6)
		{
			return "суббота";
		}else if (a==7)
		{
			return "воскресенье";
		}
		return "нет такого дн€";

	}





/*	//*********************************************************
	//**¬водим число (0-999), получаем строку с прописью числа*
	//*********************************************************
	public static String Num999ToString (int number)
	{
		String [] hundreds = {"","сто","двести","триста","четыреста","п€тьсот","шестьсот","семьсот","восемьсот","дев€тьсот"};
		String [] tens = {"","дес€ть","двадцать","тридцать","сорок","п€тьдес€т","шестьдес€т","семдес€т","восемдес€т","дев€носто"};
		String [] units = {"","один","два","три","четыре","п€ть","шесть","семь","восемь","дев€ть"};
		String str="";

		int a=0;
		int b=0;
		while (number>0)
		{
			a=number%10;
			number=number/10;		 
			b=b+a;
			str= str+Integer.toString(a);
		}  
		int reverseNumber = Integer.parseInt(str);

		if (b == 3)
		{

			while (reverseNumber>0)
			{
				a=reverseNumber%10;
				number=number/10;
				//		str= 

				//b=b+a;
				//str= str+Integer.toString(a);
			}
		}
		return str;



	}

*/



	//**********************************************************************
	//**¬водим число (0-9999999999999999), получаем строку с прописью числа*
	//**********************************************************************

	public final static int DG_POWER=6;

	private final static String[][] a_power = new String[][]
			{
		{"0", ""            , ""             ,""              },  // 1
		{"1", "тыс€ча "     , "тыс€чи "      ,"тыс€ч "        },  // 2
		{"0", "миллион "    , "миллиона "    ,"миллионов "    },  // 3
		{"0", "миллиард "   , "миллиарда "   ,"миллиардов "   },  // 4
		{"0", "триллион "   , "триллиона "   ,"триллионов "   },  // 5
		{"0", "квадриллион ", "квадриллиона ","квадриллионов "},  // 6
		{"0", "квинтиллион ", "квинтиллиона ","квинтиллионов "}   // 7
			};

			private final static String[][] digit = new String[][]
					{
				{""       ,""       , "дес€ть "      , ""            ,""          },
				{"один "  ,"одна "  , "одиннадцать " , "дес€ть "     ,"сто "      },
				{"два "   ,"две "   , "двенадцать "  , "двадцать "   ,"двести "   },
				{"три "   ,"три "   , "тринадцать "  , "тридцать "   ,"триста "   },
				{"четыре ","четыре ", "четырнадцать ", "сорок "      ,"четыреста "},
				{"п€ть "  ,"п€ть "  , "п€тнадцать "  , "п€тьдес€т "  ,"п€тьсот "  },
				{"шесть " ,"шесть " , "шестнадцать " , "шестьдес€т " ,"шестьсот " },
				{"семь "  ,"семь "  , "семнадцать "  , "семьдес€т "  ,"семьсот "  },
				{"восемь ","восемь ", "восемнадцать ", "восемьдес€т ","восемьсот "},
				{"дев€ть ","дев€ть ", "дев€тнадцать ", "дев€носто "  ,"дев€тьсот "}
					};

					public static String toString (int sum)
					{
						int    i,mny;
						StringBuffer result= new StringBuffer("");
						long divisor; //делитель
						int psum = sum;

						int one  = 1;
						int four = 2;
						int many = 3;


						int hun  = 4;
						int dec  = 3;
						int dec2 = 2;

						if(sum == 0) return "ноль "; //если число=0, то сразу выходим
						if(sum <  0){ result.append("минус "); psum = -psum;}//если число отрицательное, добавл€ем в строку слово "минус"

						for(i=0,divisor=1; i<DG_POWER; i++) 
						{
							divisor *= 1000;
						}

						for(i=DG_POWER-1; i>=0; i--)
						{
							divisor /= 1000;
							mny = (int)(psum / divisor);
							psum %= divisor;//остаток от делени€ на делитель

							if(mny==0)
							{
								if(i>0) continue;
								result.append( a_power[i][one] );
							}
							else
							{
								if(mny>=100)
								{
									result.append( digit[mny/100][hun]);
									mny%=100;
								}
								if(mny>=20 )
								{ result.append( digit[mny/10 ][dec]);
								mny%=10;
								}
								if(mny>=10 )
								{ 
									result.append( digit[mny-10 ][dec2]); 
								}

								else
								{
									if(mny>=1  ) result.append( digit[mny][ "0".equals(a_power[i][0]) ? 0 : 1 ] );
								}
								switch(mny)
								{
								case  1: result.append( a_power[i][one] ); break;
								case  2: 
								case  3:
								case  4: result.append( a_power[i][four]); break;
								default: result.append( a_power[i][many]); break;
								};
							}
						}
						return result.toString();
					}

					public static String toString(double num )
					{
						return toString( (int)num) + "."+ toString( (int)(num*100 - ((int)num)*100) );
					}




					//*******************************************************
					//**
					//*******************************************************






					//*******************************************************
					//**Ќайти рассто€ние между двум€ точками в двумерном декартовом пространстве
					//*******************************************************



					public static int distance (int x1, int x2, int y1, int y2)
					{
						int a = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
						int dist = (int) sqrt(a);
						return dist;
					}






					//*******************************************************
					//**
					//*******************************************************

}
