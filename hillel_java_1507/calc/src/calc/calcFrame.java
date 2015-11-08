package calc;
import javax.swing.JFrame;

public class calcFrame extends JFrame 
{
	public calcFrame() 
	{
		setTitle("My First APP");
		setBounds(200, 200, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new calcPanel());
		setVisible(true);
	}
}
