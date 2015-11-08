package calc;

import java.awt.BorderLayout;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcPanel extends JPanel 
{
	JTextField display = null;
	
	public calcPanel() 
	{
		setLayout(null);
		
		display = new JTextField();
		display.setBounds(10, 20, 230, 20);
		display.setEditable(false);
		add(display);
		
		
		
		//JButton btn = new JButton("Click");
		//btn.setBounds(10, 40, 120, 20);
		//add(btn);
		//**********************************************
		JButton btn1 = new JButton("1");
		btn1.setBounds(10,200, 50, 30);
		add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(70,200, 50, 30);
		add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(130,200, 50, 30);
		add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10,160, 50, 30);
		add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(70,160, 50, 30);
		add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(130,160, 50, 30);
		add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10,120, 50, 30);
		add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(70,120, 50, 30);
		add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(130,120, 50, 30);
		add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10,240, 100, 30);
		add(btn0);
		
		JButton btnDelit = new JButton("/");
		btnDelit.setBounds(190,120, 50, 30);
		add(btnDelit);
		
		JButton btnUmnogit = new JButton("*");
		btnUmnogit.setBounds(190,160, 50, 30);
		add(btnUmnogit);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(190,200, 50, 30);
		add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(190,240, 50, 30);
		add(btnPlus);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(250,120, 50, 30);
		add(btnC);
		
		JButton btnRavno = new JButton("=");
		btnRavno.setBounds(250,160, 50, 110);
		add(btnRavno);
		
		
//**********************************************************
		

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText() + "0");
		}
	});
	btn1.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"1");
		}
	});
	btn2.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"2");
		}
	});
	btn3.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"3");
		}
	});
	btn4.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"4");
		}
	});
	btn5.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"5");
		}
	});
	btn6.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"6");
		}
	});
	btn7.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"7");
		}
	});
	btn8.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"8");
		}
	});
	btn9.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText(display.getText()+"9");
		}
	});
	buttonBack.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String temp = display.getText();
			display.setText(temp.substring(0,temp.length()-1));
		}
	});
	buttonSum.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			firstValue = Integer.valueOf(display.getText());
			display.setText("");
			operation = "+";
		}
	});
	buttonMul.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			firstValue = Integer.valueOf(display.getText());
			display.setText("");
			operation = "*";
		}
	});
	buttonDivide.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			firstValue = Integer.valueOf(display.getText());
			display.setText("");
			operation = "/";
		}
	});
	buttonSub.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			firstValue = Integer.valueOf(display.getText());
			display.setText("");
			operation = "-";
		}
	});
	buttonStart.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int secondValue = Integer.valueOf(display.getText());
			if("+".equals(operation))
			{
				display.setText((firstValue+secondValue)+"");
			}
			if("-".equals(operation))
			{
				display.setText((firstValue-secondValue)+"");
			}
			if("*".equals(operation))
			{
				display.setText((firstValue*secondValue)+"");
			}
			if("/".equals(operation))
			{
				display.setText((firstValue/secondValue)+"");
			}
			firstValue = 0;
			operation = "+";
		}
	});
	setLayout(new BorderLayout());
	add(display, BorderLayout.NORTH);
	add(buttonPanel,BorderLayout.CENTER);
	add(buttonStart,BorderLayout.SOUTH);
	buttonPanel.add(button0);
	buttonPanel.add(button1);
	buttonPanel.add(button2);
	buttonPanel.add(button3);
	buttonPanel.add(button4);
	buttonPanel.add(button5);
	buttonPanel.add(button6);
	buttonPanel.add(button7);
	buttonPanel.add(button8);
	buttonPanel.add(button9);
	buttonPanel.add(buttonSum);
	buttonPanel.add(buttonSub);
	buttonPanel.add(buttonMul);
	buttonPanel.add(buttonBack);
	buttonPanel.add(buttonDivide);

	setVisible(true);
		
/*		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, txt.getText());
			}
		});
		
*/
	}
}

