import javax.swing.JOptionPane;
public class HW1BaseTasksConditionalOperators3 {
	public static void main (String[] args){
		int a;
		int b;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("Введите первое число ");
		a = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("Введите второе число ");
		b = Integer.parseInt(stringInput);
		
		if ((a)>0 && (b)>0){
			System.out.println("Сумма числа A и B равняется "+(a+b));
			
		}else {
			System.out.println("Одно из чисел не является положительным");
		}	
		
	}
	
}