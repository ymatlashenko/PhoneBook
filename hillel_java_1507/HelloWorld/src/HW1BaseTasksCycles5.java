import javax.swing.JOptionPane;
public class HW1BaseTasksCycles5 {
	public static void main (String[] args){
		int n=0;
		int a=0;
		int b=0;
		int i=0;
		String str2="";
		String str="";
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("������� ����� n, ��������� ������� � ��� ���� � �� �����. ");
		n = Integer.parseInt(stringInput);
		
		while (n>0){
			a=n%10;
			n=n/10;
		    i++;
		    b=b+a;
		    str = Integer.toString(a);
		    str2= str2+str;
		}
		System.out.println("���������� ���� - "+i);
		System.out.println("����� ���� - "+b);
		System.out.println("����� ��������. "+str2);


		  
		
		
		
	}
}
