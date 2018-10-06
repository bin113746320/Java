package spring.software1711.niit.cn;

import java.awt.Color;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.plaf.ColorUIResource;

public class Market extends JFrame{
	User user;
	JButton inProductButton;
	JButton outProductButton;
	JButton exitButton;
	Market (User user)
	{
		this.user=user;
		this.setTitle("超市管理系统");
		this.setSize(800,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.darkGray);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Init();
	}
	public void Init(){
		this.setLayout(null);
		
		inProductButton=new JButton("进货");
		inProductButton.setBounds(80, 50, 80, 30);
		add(inProductButton);
		
		outProductButton=new JButton("出货");
		outProductButton.setBounds(80, 100, 80, 30);
		add(outProductButton);	
		
		exitButton=new JButton("返回");
		exitButton.setBounds(650, 500, 80, 30);
		add(exitButton);	
	}

}
