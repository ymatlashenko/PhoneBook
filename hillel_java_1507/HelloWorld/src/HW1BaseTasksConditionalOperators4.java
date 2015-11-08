import javax.swing.JOptionPane;
public class HW1BaseTasksConditionalOperators4 {
	public static void main (String[] args){
		int a;
		int b;
		int c;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("Введите первое число A ");
		a = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("Введите второе число B ");
		b = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("Введите третье число C ");
		c = Integer.parseInt(stringInput);
		
		if ((a)>(b) && (a)>(c)){
			System.out.println("Большее из чисел - A. A+3= "+(a+3));
			
		}else if ((b)>(a) && (b)>(c)){
			System.out.println("Большее из чисел - B. B+3= "+(b+3));
			
		}else if ((c)>(a) && (c)>(b)){
			System.out.println("Большее из чисел - C. C+3= "+(c+3));
			
		}
		
	}
	
}
