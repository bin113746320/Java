package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ATM extends JFrame implements ActionListener{
	private BankCard bankCard;
	JButton btnQuery, btnDrawith,btnExit;
	JLabel infoLabel; 
	public ATM(BankCard bankCard)
	{
		this.bankCard=bankCard;
		this.setTitle("中国建设银行");
		this.setSize(800,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.lightGray);
		init();
	}
	
	public BankCard getBankCard() {
		return bankCard;
	}

	public void setBankCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void init()
	{	
		this.setLayout(null);
		
		infoLabel=new JLabel();
		infoLabel.setBounds(250, 150, 150, 60);
		infoLabel.setText("欢迎使用！");
		Font f=new Font("楷体", 1, 26);
		infoLabel.setFont(f);
		infoLabel.setForeground(Color.BLUE);
		this.add(infoLabel);
		
		btnQuery=new JButton("查询");
		btnQuery.setBounds(680, 100, 60, 40);
		btnQuery.addActionListener(this);
		this.add(btnQuery);
		
		
		btnDrawith=new JButton("取款");
		btnDrawith.setBounds(680, 200, 60, 40);
		btnDrawith.addActionListener(this);
		this.add(btnDrawith);
		
		btnExit=new JButton("退卡");
		btnExit.setBounds(50, 380, 60, 40);
		btnExit.addActionListener(this);
		this.add(btnExit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCard bankcard=new BankCard("123456789", "54545", 8888);
		ATM atm=new ATM(bankcard);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getSource()==btnQuery)
		{
			JOptionPane.showMessageDialog(null,"余额："+this.getBankCard().getBalance());
		}
		else if(event.getSource()==btnDrawith)
		{
			Drawith drawith=new Drawith(this.getBankCard());
		}
		else if(event.getSource()==btnExit)
		{
			JOptionPane.showMessageDialog(null,"欢迎下次光临！");
			this.dispose();
		}
		
	}
}
