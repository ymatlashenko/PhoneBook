import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author operator
 *
 */
public class HW1BaseTasksCycles3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("������� �����, ������ ��� ������ ������� ��������: ");
		number = Integer.parseInt(stringInput);
		for (int i=1; i<number; ++i){
			if ((i*i) >= number) {
				JOptionPane.showMessageDialog (null,"������ �� "+ number+" �������� ����� "+i);
				break;
			}else{
		}
	}
		

}
}
