import javax.swing.JOptionPane;
public class HW1BaseTasksConditionalOperators5 {
	public static void main (String[] args){
		int rating;
		
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("������� ������� �������� (����� �� 0 �� 100) ");
		rating = Integer.parseInt(stringInput);
		
		
		if ((rating)>=(0) && (rating)<=(19)){
			System.out.println("������ ��������: F");
			
		}else if ((rating)>=(20) && (rating)<=(39)){
			System.out.println("������ ��������: E");
			
		}else if ((rating)>=(40) && (rating)<=(59)){
			System.out.println("������ ��������: D");
			
		}else if ((rating)>=(60) && (rating)<=(74)){
			System.out.println("������ ��������: C");
			
		}else if ((rating)>=(75) && (rating)<=(89)){
			System.out.println("������ ��������: B");
			
		}else if ((rating)>=(90) && (rating)<=(100)){
			System.out.println("������ ��������: A");
			
		}else {
			System.out.println("�� ����� �������� �������� ��������");
		}
		
	}
	
}
