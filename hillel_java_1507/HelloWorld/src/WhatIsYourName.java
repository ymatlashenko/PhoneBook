import javax.swing.*;
public class WhatIsYourName {
	public static void main (String[] args){
		String name;
		name=JOptionPane.showInputDialog("������ ����! ��� ��� �����?");
		JOptionPane.showMessageDialog(null, "������� �������������,\n"+name+"!");
	}
}
