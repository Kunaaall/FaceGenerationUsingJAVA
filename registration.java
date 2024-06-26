import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

class registration extends JFrame implements ActionListener
{
		JButton b1,b2,b3,b4;
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t3,t4,t5,t6,t7,t8;
		JPasswordField p1,p2;
		ImageIcon i;
		LineBorder lb;
		Font f,f1,f2;
	
		registration()
		{
		super("REGISTRATION");
		lb = new LineBorder(Color.red,5);				

		i = new ImageIcon("images/reg.png");
		l = new JLabel(i);
		l.setBorder(lb);
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		b1=new JButton("SUBMIT");
		b2=new JButton("BACK");
		
		//c=new JCheckBox("VIEW");
		//c.setForeground(Color.cyan);
		f = new Font("Constantia",Font.BOLD,20);
		f1 = new Font("Constantia",Font.BOLD,15);
		f2 = new Font("Copper Black",Font.BOLD,18);

		l1=new JLabel("NAME");
		l1.setForeground(Color.white);

		l2=new JLabel("EMAIL");
		l2.setForeground(Color.white);

		l3=new JLabel("PHONE NO");
		l3.setForeground(Color.white);
		
		l4=new JLabel("DOB");
		l4.setForeground(Color.white);

		l5=new JLabel("PASSWORD");
		l5.setForeground(Color.white);

		l6=new JLabel("CONFIRM PASSWORD");
		l6.setForeground(Color.white);

		t3.setBackground(Color.white);
		t3.setForeground(Color.black);

		t4.setBackground(Color.white);
		t4.setForeground(Color.black);

		t5.setBackground(Color.white);
		t5.setForeground(Color.black);

		t6.setBackground(Color.white);
		t6.setForeground(Color.black);

		t7.setBackground(Color.white);
		t7.setForeground(Color.black);

		t8.setBackground(Color.white);
		t8.setForeground(Color.black);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);

		b1.setFont(f2);
		b2.setFont(f2);
		//button(back/sumbit)
		b1.setBounds(620,490,350,40);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.black);
		b1.setBorderPainted(true);

		b2.setBounds(620,550,350,40);
		b2.setBackground(Color.gray);
		b2.setForeground(Color.BLACK);
		b2.setBorderPainted(true);

		

		l1.setBounds(623,50,350,30);
		l2.setBounds(623,120,350,30);
		l3.setBounds(623,190,350,30);
		l4.setBounds(623,260,350,30);
		l5.setBounds(623,330,350,30);
		l6.setBounds(623,400,350,30);
		
		t3.setBounds(620,80,350,40);
		t4.setBounds(620,150,350,40);
		t5.setBounds(620,220,350,40);
		t6.setBounds(620,290,350,40);
		t7.setBounds(620,360,350,40);
		t8.setBounds(620,430,350,40);

		b1.setOpaque(false);
		b2.setOpaque(false);
		
		

		add(b1);
		add(b2);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);

		add(l);
		l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
		
	

		setLayout(null);
		

		t3.setOpaque(false);
		t4.setOpaque(false);
		t5.setOpaque(false);
		t6.setOpaque(false);
		t7.setOpaque(false);
		t8.setOpaque(false);

		setResizable(false);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1000,700);
		setLocation(
	(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,	(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
	);
		setUndecorated(true);
		setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object o = ae.getSource();
		if(o==b1)
		{
			
			int result = JOptionPane.showConfirmDialog(this,"You want to exit?", "EXIT", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(result == JOptionPane.YES_OPTION)
			{
				new User_Authentication();
				this.dispose();
			}
			else
			{
				System.out.print("stay");
			}
		}
		if(o==b2)
		{
			System.out.println("Valid User.");
			JOptionPane.showMessageDialog(this,"Go To Login","Successfully",JOptionPane.INFORMATION_MESSAGE);

			new User_Authentication();
			this.dispose();

		}
	
	 	{ 
             
			{
                p1.setEchoChar((char) 0);
            } 
		
			{
                p1.setEchoChar('*');
            }
        }
}
	public static void main(String args[])
	{
		new registration();		
	}
	
}
	