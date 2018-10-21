package spring.software1711.niit.cn;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MessageBox extends JFrame implements ActionListener{
	JLabel dataLabel; 
	JTextField dataTextField;
	//JButton button;
	public MessageBox()
	{
		this.setTitle("数据输入界面");
		this.setSize(800,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.lightGray);
		init();
	}
	
	public JTextField getDataTextField() {
		return dataTextField;
	}

	public void setDataTextField(JTextField dataTextField) {
		this.dataTextField = dataTextField;
	}
	
	public void init()
	{
		this.setLayout(null);
		
		dataLabel=new JLabel("输入数据：");
		dataLabel.setBounds(250, 150, 100, 50);
		this.add(dataLabel);
		
		dataTextField=new JTextField();
		dataTextField.setBounds(330, 160, 100, 30);
		dataTextField.addActionListener(this);
		this.add(dataTextField);
		
		/*button=new JButton("确定");
		button.setBounds(250, 350, 100, 50);
		//button.addActionListener(this);
		this.add(button);*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBox messagebox=new MessageBox();	
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==dataTextField)
		{
			if(this.getDataTextField().getText()!=null)
			{
				if(Integer.parseInt(this.getDataTextField().getText())>110||
					Integer.parseInt(this.getDataTextField().getText())<80)
				{
					JOptionPane.showMessageDialog(null,"数据输入有误！");
				}
			}
		}	
	}
}
