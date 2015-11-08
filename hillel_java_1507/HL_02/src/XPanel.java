import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class XPanel extends JPanel 
{
	JTextField txt = null;
	
	public XPanel() 
	{
		setLayout(null);
		
		txt = new JTextField();
		txt.setBounds(10, 10, 120, 20);
		add(txt);
		
		JButton btn = new JButton("Click");
		btn.setBounds(10, 40, 120, 20);
		add(btn);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, txt.getText());
			}
		});
	}
}
