package spring.software1711.niit.cn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import software1711.niit.Employee;

public class InfoEmployee extends JFrame implements ActionListener{
	Employee employee;
	JLabel nameLabel;
	JLabel ageLabel;
	JLabel salaryLabel;
	JLabel hiredayLabel;
	JTextField nameText;
	JTextField ageText;
	JTextField salaryText;
	JTextField hiredayText;
	JButton exitButton;
	
	public InfoEmployee (Employee employee)
	{
		this.employee=employee;
		this.setTitle("员工信息");
		this.setSize(800,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.cyan);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Init();
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void Init(){
	    this.setLayout(null);
	
		nameLabel=new JLabel("姓名：");
		nameLabel.setBounds(10, 40, 50, 25);
		add(nameLabel);
		
		nameText=new JTextField();
		nameText.setBounds(60,40, 80, 25);
		nameText.setText(this.getEmployee().getName());
		add(nameText);
		
		

		//idText=new ()
		//idText.setBounds(10, 40, 50, 25);
		//add(idText);
		
		ageLabel=new JLabel("年龄：");
		ageLabel.setBounds(100, 150, 80, 25);
		add(ageLabel);
		
		ageText=new JTextField();
		ageText.setBounds(180, 150, 80, 25);
		ageText.setText(Integer.toString(this.getEmployee().getAge()));//setText(Character.toString(ch))
		add(ageText);
		
		salaryLabel=new JLabel("薪水：");
		salaryLabel.setBounds(100, 200, 80, 25);
		add(salaryLabel);
		
		salaryText=new JTextField();
		salaryText.setBounds(180, 200, 80, 25);
		salaryText.setText(Double.toString(this.getEmployee().getSalary()));
		add(salaryText);
		
		hiredayLabel=new JLabel("雇佣日期：");
		hiredayLabel.setBounds(100, 250, 80, 25);
		add(hiredayLabel);

		hiredayText=new JTextField();
		hiredayText.setBounds(180, 250, 80, 25);
		hiredayText.setText(Double.toString(this.getEmployee().getHireDay()));
		add(hiredayText);
		
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
