package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login extends JFrame implements ActionListener {
	Student student;
	JLabel numLabel;
	JLabel pwLabel;
	JTextField numText;
	JPasswordField pwText;
	JButton landButton;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public JTextField getNumText() {
		return numText;
	}

	public void setNumText(JTextField numText) {
		this.numText = numText;
	}

	public JTextField getPwText() {
		return pwText;
	}

	public void setPwText(JPasswordField pwText) {
		this.pwText = pwText;
	}
	
	Login(Student student){
		this.student=student;
		this.setTitle("学生登录界面");
		this.setSize(600,400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.lightGray);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
		init();
	}
	
	public void init(){ 
		this.setLayout(null);
		
		numLabel=new JLabel("学号：");
		numLabel.setBounds(200, 100, 50, 25);
		add(numLabel);
		
		numText=new JTextField();
		numText.setBounds(250,100, 80, 25);
		add(numText);
		
		pwLabel=new JLabel("密码：");
		pwLabel.setBounds(200, 150, 50, 25);
		add(pwLabel);
		
		pwText=new JPasswordField();
		pwText.setBounds(250,150, 80, 25);
		add(pwText);
		
		landButton=new JButton("登录");
		landButton.setBounds(250, 280, 60, 40);
		landButton.addActionListener(this);
		add(landButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("小明","12345","55555",85);
		Login login=new Login(student);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==landButton)
		{
			if(this.getStudent().getNumber().equals(this.getNumText().getText()))
			{
				if(this.getStudent().getPassword().equals(this.getPwText().getText()))
				{
					JOptionPane.showMessageDialog(null,"登陆成功");
					InfoStudent info=new InfoStudent(student);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"密码错误");
				}
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"用户名错误");
			}
		}	
	}

}
