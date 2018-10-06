package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SuperMarket extends JFrame implements ActionListener{
	User user;
	JLabel uerLabel;
	JLabel passwordLabel;
	JTextField uerTextField;
	JPasswordField passwordTextField;
	JButton landButton;
	
	public JTextField getUerTextField() {
		return uerTextField;
	}

	public void setUerTextField(JTextField uerTextField) {
		this.uerTextField = uerTextField;
	}

	public JTextField getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(JPasswordField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public SuperMarket(User user) {
		// TODO Auto-generated constructor stub
		this.user=user;
		this.setTitle("登录界面");
		this.setSize(600, 400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Init();
	}
	
	public void Init()
	{
		this.setLayout(null);
		
		uerLabel=new JLabel("用户名:");
		uerLabel.setBounds(200, 100, 100, 30);
		add(uerLabel);
		
		uerTextField=new JTextField();
		uerTextField.setBounds(250,100, 100, 25);
		add(uerTextField);
		
		passwordLabel=new JLabel("密码:");
		passwordLabel.setBounds(200, 140, 100, 30);
		add(passwordLabel);
		
		passwordTextField=new JPasswordField();
		passwordTextField.setBounds(250,140, 100, 25);
		add(passwordTextField);
		
		landButton=new JButton("登录");
		landButton.setBounds(260, 300, 70, 40);
		landButton.addActionListener(this);
		add(landButton);
		
	}
	public static void main(String[] args)
	{
		User user=new User();
		user.setUserName("胡彬");
		user.setUserPassword("123456");
		new SuperMarket(user);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==landButton)
		{
			if(this.getUser().getUserName().equals(this.getUerTextField().getText()))
			{
				if(this.getUser().getUserPassword().equals(this.getPasswordTextField().getText()))
				{
					JOptionPane.showMessageDialog(null,"登陆成功");
					Market market=new Market(user);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"用户名或密码错误");
				}	
			}	
		}
	}
  }

