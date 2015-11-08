import javax.swing.JOptionPane;
public class HW1BaseTasksCycles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amountOfEvenNumbers = 0;
		int sumOfEvenNumbers = 0;
		for (int i=1; i<99; ++i){
			if ((i%2) == 0) {
				amountOfEvenNumbers = amountOfEvenNumbers +1;
				sumOfEvenNumbers = sumOfEvenNumbers + i;
			}
		}
		JOptionPane.showMessageDialog (null,"Количество четных чисел: "+ amountOfEvenNumbers);
		JOptionPane.showMessageDialog (null,"Сумма четных чисел: "+ sumOfEvenNumbers);

	}

}
