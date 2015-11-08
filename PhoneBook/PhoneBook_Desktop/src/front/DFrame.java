package front;
import javax.swing.JFrame;

public class DFrame extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public DFrame() 
	{
		setTitle("Db Job");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		add(new DPanel());
		
		setVisible(true);
	}
}
