
import javax.swing.*;

class jatin extends JFrame 
{
	JButton b;
	jatin()
	{
		super("My First JFrame.");
		b = new JButton("Click Me");
		add(b);
		setLayout(null);
		b.setBounds(100,100,120,30);
		
		setSize(500,500);
		setLocation(300,100);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new jatin();
	}
}
