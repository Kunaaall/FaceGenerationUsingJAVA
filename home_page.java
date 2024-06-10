
// Home Page...

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.*;

class home_page extends JFrame implements ActionListener,ItemListener
{
	JButton b;
	JPanel p;	
	Font f;
	JLabel l,l1,l2,l3,l4,l5;
	ImageIcon i,e1,e2,e3,e4,fs_e1,fs_e2,fs_e3,fs_e4,fs_e5,n1,n2,n3,n4,;
	JComboBox jc,jnose,jear,jlips,jshape;
	LineBorder lb,lb1;	

	home_page()
	{
		super("Face Generation and Recognition.");
			
		p = new JPanel();
		l1 = new JLabel("Select Eye ->");
		l2 = new JLabel("Select Nose ->");
		l3 = new JLabel("Select Ears ->");
		l4 = new JLabel("Select Hairs ->");
		l5 = new JLabel("Select Face Shape ->");

		add(l1);	
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	
		
		
		lb = new LineBorder(Color.red,3);
		lb1 = new LineBorder(Color.blue,1);	
		i = new ImageIcon("images//12.png");
		e1 = new ImageIcon("images//e_1.jpg");
		e2 = new ImageIcon("images//e_2.jpg");
		e3 = new ImageIcon("images//e_3.jpg");
		e4 = new ImageIcon("images//e_4.jpg");
		
		fs_e1 = new ImageIcon("images//fs_1.jpg");
		fs_e2 = new ImageIcon("images//fs_2.png");
		fs_e3 = new ImageIcon("images//fs_3.png");
		fs_e4 = new ImageIcon("images//fs_4.png");
		fs_e5 = new ImageIcon("images//fs_5.png");		

		n1 = new ImageIcon("images//n1.jpg");
		n2 = new ImageIcon("images//n2.png");
		n3 = new ImageIcon("images//n3.png");
		n4 = new ImageIcon("images//n4.png");


		//l = new JLabel(i);
		l=new JLabel();
		l.setBorder(lb);
		add(p);
		p.setBackground(Color.lightGray);
		
		jc = new JComboBox();
		
		jc.addItem(" = Select Eye =");
		jc.addItem(e1);
		jc.addItem(e2);
		jc.addItem(e3);
		jc.addItem(e4);
		
		jc.addItemListener(this);
		add(jc);
	
		jnose = new JComboBox();
		jear = new JComboBox();
		jlips = new JComboBox();
		jshape = new JComboBox();
		//jshape.addItem("==Face Shapes ==");
		jshape.addItem(fs_e1);
		jshape.addItem(fs_e2);
		jshape.addItem(fs_e3);
		jshape.addItem(fs_e4);
		jshape.addItem(fs_e5);

		jnose.addItem(n1);
		jnose.addItem(n2);
		jnose.addItem(n3);
		jnose.addItem(n4);
		//jnose.addItem(n5);


		add(jnose);
		add(jear);
		add(jlips);
		add(jshape);

	
		b = new JButton("Logout");
		f = new Font("Sanserif",Font.BOLD,15);
		setLayout(null);	
		add(b);
		b.setFont(f);
		jc.setFont(f);
		jnose.setFont(f);
		jear.setFont(f);
		jlips.setFont(f);
		jshape.setFont(f);

		b.setBackground(Color.BLACK);
		b.setForeground(Color.white);

		b.addActionListener(this);
		//setLayout(new FlowLayout());

		b.setBounds(1060,10,100,25);

		l1.setBounds(20,100,130,20);
		jc.setBounds(200,100,200,30);

		l2.setBounds(20,190,130,20);
		jnose.setBounds(200,190,200,30);

		l3.setBounds(20,280,130,20);
		jear.setBounds(200,280,200,30);

		l4.setBounds(20,370,130,20);
		jlips.setBounds(200,370,200,30);

		l5.setBounds(20,450,160,20);
		jshape.setBounds(200,450,200,30);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);

		
		

		add(l);
		//l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
		//setSize(i.getIconWidth()+20,i.getIconHeight()+40);
		l.setBounds(0,0,1173,662);
		setSize(1190,700);
		p.setBounds(600,50,550,590);
		p.setBorder(lb1);

	setLocation(
	(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
	(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2-20	
	);

		//setResizable(false);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		Object o = ae.getSource();
		if(o==b)
		{
			new User_Authentication();
			this.dispose();
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
				
	}
	public static void main(String args[])
	{
		new home_page();		
	}
}

