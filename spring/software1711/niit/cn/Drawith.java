package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.imageio.stream.ImageInputStream;
import javax.naming.InitialContext;
import javax.net.ssl.ExtendedSSLSession;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Drawith extends JFrame implements ActionListener{
	private BankCard card;
	JButton btnMoney;
	JButton exitButton;

	Drawith(BankCard card)
	{
		this.card=card;
		this.setTitle("取款");
		this.setSize(800,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);	
		this.getContentPane().setBackground(Color.lightGray);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Init();
	}
	
	public void Init()
	{
		this.setLayout(null);
		btnMoney=new JButton("1000");
		btnMoney.setBounds(680, 100, 80, 40);
		btnMoney.addActionListener(this);
		this.add(btnMoney);
		
		this.setLayout(null);
		exitButton=new JButton("返回");
		exitButton.setBounds(50, 380, 80, 40);
		exitButton.addActionListener(this);
		this.add(exitButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnMoney)
		{
			if(card.getBalance()<1000)
			{
				JOptionPane.showMessageDialog(null,"余额不足");
			}
			else
			{
				card.setBalance(card.getBalance()-1000);
			    JOptionPane.showMessageDialog(null,"取款成功");
			}
		}
		else if(e.getSource()==exitButton)
		{
			this.dispose();
		}
	}
}
