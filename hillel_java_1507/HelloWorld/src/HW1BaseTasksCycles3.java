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
		stringInput = JOptionPane.showInputDialog("¬ведите число, найдем его корень методом перебора: ");
		number = Integer.parseInt(stringInput);
		for (int i=1; i<number; ++i){
			if ((i*i) >= number) {
				JOptionPane.showMessageDialog (null," орень от "+ number+" примерно равен "+i);
				break;
			}else{
		}
	}
		

}
}
