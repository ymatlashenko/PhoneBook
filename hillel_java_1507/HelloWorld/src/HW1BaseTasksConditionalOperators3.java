import javax.swing.JOptionPane;
public class HW1BaseTasksConditionalOperators3 {
	public static void main (String[] args){
		int a;
		int b;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("������� ������ ����� ");
		a = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("������� ������ ����� ");
		b = Integer.parseInt(stringInput);
		
		if ((a)>0 && (b)>0){
			System.out.println("����� ����� A � B ��������� "+(a+b));
			
		}else {
			System.out.println("���� �� ����� �� �������� �������������");
		}	
		
	}
	
}