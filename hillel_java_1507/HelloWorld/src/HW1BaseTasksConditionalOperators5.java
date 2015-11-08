import javax.swing.JOptionPane;
public class HW1BaseTasksConditionalOperators5 {
	public static void main (String[] args){
		int rating;
		
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("¬ведите рейтинг студента (число от 0 до 100) ");
		rating = Integer.parseInt(stringInput);
		
		
		if ((rating)>=(0) && (rating)<=(19)){
			System.out.println("ќценка студента: F");
			
		}else if ((rating)>=(20) && (rating)<=(39)){
			System.out.println("ќценка студента: E");
			
		}else if ((rating)>=(40) && (rating)<=(59)){
			System.out.println("ќценка студента: D");
			
		}else if ((rating)>=(60) && (rating)<=(74)){
			System.out.println("ќценка студента: C");
			
		}else if ((rating)>=(75) && (rating)<=(89)){
			System.out.println("ќценка студента: B");
			
		}else if ((rating)>=(90) && (rating)<=(100)){
			System.out.println("ќценка студента: A");
			
		}else {
			System.out.println("¬ы ввели неверное значение рейтинга");
		}
		
	}
	
}
