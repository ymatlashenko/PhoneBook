import javax.swing.*;
public class HW1BaseTasksConditionalOperators2 {
	public static void main (String[] args){
		int x;
		int y;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("������� ���������� �. ");
		x = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("������� ���������� Y. ");
		y = Integer.parseInt(stringInput);
		
				
		if ((x)>0 && (y)>0){
			System.out.println("����� � ������������ X= "+x+" ; Y= "+y+ " ����������� � �������� 1");
			
		}else if ((x)<0 && (y)>0){
			System.out.println("����� � ������������ X= "+x+" ; Y= "+y+ " ����������� � �������� 2");
		}else if ((x)<0 && (y)<0){
			System.out.println("����� � ������������ X= "+x+" ; Y= "+y+ " ����������� � �������� 3");
		}else if ((x)>0 && (y)<0){
			System.out.println("����� � ������������ X= "+x+" ; Y= "+y+ " ����������� � �������� 4");
		}
		
		
		
	}
	

}
