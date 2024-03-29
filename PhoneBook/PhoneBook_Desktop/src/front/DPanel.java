package front;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	JTable tbl = null;
	TModel mdl = null;
	
	public DPanel()
	{
		setLayout(null);
		
		mdl = new TModel();
		tbl = new JTable(mdl);
		JScrollPane sp = new JScrollPane(tbl);
		sp.setBounds(10, 10, 400, 400);
		add(sp);
		
		JButton btnRead = new JButton("Update");
		btnRead.setBounds(10,500, 120, 20);
		add(btnRead);
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				mdl.setDS();
				tbl.revalidate();
			}
		});
	}
	
	
}
