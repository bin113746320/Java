package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InfoStudent extends JFrame implements ActionListener{
	Student student;
	JLabel numLabel;
	JLabel nameLabel;
	JLabel javaLabel;
	JTextField numText;
	JTextField nameText;
	JTextField javaText;
	JButton exitButton;
	
	InfoStudent (Student student)
	{
		this.student=student;
		this.setTitle("学生信息");
		this.setSize(800,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.cyan);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Init();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void Init(){
	    this.setLayout(null);
		numLabel=new JLabel("学号：");
		numLabel.setBounds(10, 10, 50, 25);
		add(numLabel);
		
		numText=new JTextField();
		numText.setBounds(60,10, 80, 25);
		numText.setText(this.getStudent().getNumber());
		add(numText);
				
		nameLabel=new JLabel("姓名：");
		nameLabel.setBounds(10, 40, 50, 25);
		add(nameLabel);
		
		nameText=new JTextField();
		nameText.setBounds(60,40, 80, 25);
		nameText.setText(this.getStudent().getName());
		add(nameText);
		
		javaLabel=new JLabel("Java成绩：");
		javaLabel.setBounds(100, 150, 80, 25);
		add(javaLabel);
		
		javaText=new JTextField();
		javaText.setBounds(180, 150, 80, 25);
		javaText.setText(Integer.toString(this.getStudent().getScoreJava()));//setText(Character.toString(ch))
		add(javaText);
		
		exitButton=new JButton("返回");
		exitButton.setBounds(50, 500, 60, 40);
		exitButton.addActionListener(this);
		add(exitButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exitButton)
		{
			this.dispose();
		}
	}
}
