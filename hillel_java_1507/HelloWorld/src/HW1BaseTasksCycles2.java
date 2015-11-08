import javax.swing.*;

/**
 * 
 */

/**
 * @author operator
 *
 */
public class HW1BaseTasksCycles2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number = 0;
		boolean whetherANumberIsPrime = true;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("Введите число, проверим, простое оно или нет: ");
		number = Integer.parseInt(stringInput);
		for (int i=2; i<number; ++i)
		{
			if ((number%i) == 0) 
			{
			whetherANumberIsPrime = false;	
			}else{
		}
	}
		if (whetherANumberIsPrime) {
			JOptionPane.showMessageDialog (null,"Число "+ number+" является простым числом");
		}else{
			JOptionPane.showMessageDialog (null,"Число "+ number+" НЕ является простым числом");

		}

}
}
