import javax.swing.JOptionPane;
public class HW1BaseTasksCycles4 {
	public static void main (String[] args){
		int n=0;
		int a=1;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("Введите число n, посчитаем его факториал. ");
		n = Integer.parseInt(stringInput);
		
		for (int i=1;i<n;++i){
		a=a*(i+1) ;	
		}
		System.out.println("факториал числа N равняется "+a);
		
		
		
		
	}
}
