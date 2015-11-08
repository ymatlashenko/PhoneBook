import javax.swing.JFrame;

public class XFrame extends JFrame 
{
	public XFrame() 
	{
		setTitle("My First APP");
		setBounds(200, 200, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new XPanel());
		setVisible(true);
	}
}
