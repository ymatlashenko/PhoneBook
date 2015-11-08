import javax.swing.*;
public class HW1BaseTasksConditionalOperators2 {
	public static void main (String[] args){
		int x;
		int y;
		String stringInput;         //For holding the string values until converted
		stringInput = JOptionPane.showInputDialog("Введите координату Х. ");
		x = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("Введите координату Y. ");
		y = Integer.parseInt(stringInput);
		
				
		if ((x)>0 && (y)>0){
			System.out.println("Точка с координатами X= "+x+" ; Y= "+y+ " принадлежит к четверти 1");
			
		}else if ((x)<0 && (y)>0){
			System.out.println("Точка с координатами X= "+x+" ; Y= "+y+ " принадлежит к четверти 2");
		}else if ((x)<0 && (y)<0){
			System.out.println("Точка с координатами X= "+x+" ; Y= "+y+ " принадлежит к четверти 3");
		}else if ((x)>0 && (y)<0){
			System.out.println("Точка с координатами X= "+x+" ; Y= "+y+ " принадлежит к четверти 4");
		}
		
		
		
	}
	

}
