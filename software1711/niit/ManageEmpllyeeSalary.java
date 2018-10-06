package software1711.niit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import spring.software1711.niit.cn.InfoEmployee;
import spring.software1711.niit.cn.InfoStudent;
import spring.software1711.niit.cn.Login;
import spring.software1711.niit.cn.Student;

public class ManageEmpllyeeSalary extends JFrame implements ActionListener{
	Employee employee;
	JLabel numLabel;
	//JLabel pwLabel;
	JTextField numText;
	//JPasswordField pwText;
	JButton landButton;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public JTextField getNumText() {
		return numText;
	}

	public void setNumText(JTextField numText) {
		this.numText = numText;
	}

	/*public JTextField getPwText() {
		return pwText;
	}

	public void setPwText(JPasswordField pwText) {
		this.pwText = pwText;
	}*/
	
	ManageEmpllyeeSalary(Employee employee){
		this.employee=employee;
		this.setTitle("员工登录界面");
		this.setSize(600,400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.lightGray);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
		init();
	}
	
	public void init(){ 
		this.setLayout(null);
		
		numLabel=new JLabel("姓名：");
		numLabel.setBounds(150, 100, 50, 30);
		add(numLabel);
		
		numText=new JTextField();
		numText.setBounds(250,100, 80, 30);
		add(numText);
		
		numLabel=new JLabel("请选择身份：");
		numLabel.setBounds(150, 150, 80, 30);
		add(numLabel);
		
		JComboBox jcb_id=new JComboBox();
		//jcb_id.setBounds(250, 250, 80, 25);
		JPanel jp=new JPanel();
		jp.setBounds(250, 150, 80, 30);
	//	jp.setBorder(BorderFactory.createTitledBorder("请选择身份"));
		jp.add(jcb_id);
		
		jcb_id.addItem("员工");
		jcb_id.addItem("经理");
		this.add(jp,BorderLayout.NORTH);
		
		landButton=new JButton("登录");
		landButton.setBounds(250, 280, 60, 40);
		landButton.addActionListener(this);
		add(landButton);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employ1=new Employee(20, "*三", 5000, 20150101);
		
		Employee employ2=new Employee(21, "*四", 6000, 20140101);
		Manager manager1=new Manager(23, "*五", 7000, 20120101, 10000, 7);
		ManageEmpllyeeSalary emp1=new ManageEmpllyeeSalary(employ1);
	/*	employ1.addSalary();
		employ1.getInfo();
		
		employ2.getInfo();
		manager1.getInfo();*/
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==landButton)
		{
			if(this.getEmployee().getName().equals(this.getNumText().getText()))
			{
				JOptionPane.showMessageDialog(null,"登陆成功");
				//if(this.getStudent().getPassword().equals(this.getPwText().getText()))
				//{
					
					InfoEmployee info=new InfoEmployee(employee);
				//}
				//else 
				//{
				//	JOptionPane.showMessageDialog(null,"密码错误");
				//}
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"用户名错误");
			}
		}	
	}
}
