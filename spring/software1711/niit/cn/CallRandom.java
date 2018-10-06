package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class CallRandom extends JFrame implements ActionListener{
	// 定义一个文本框textFieldName，JTextField是文本框类
	private JTextField textFieldName;
	// 定义一个按钮btnCreate，JButton是按钮类
	private JButton btnCreate;
		
	public CallRandom(){
		this.setTitle("随机点名");
		this.setSize(800, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.lightGray);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		init();
	}
	
	public void init(){
		//给对象的属性赋初值
		this.setLayout(null);
		textFieldName=new JTextField(); 
		textFieldName.setBounds(250, 80, 300, 200);
		//textFieldName.setText("胡彬");
		Font f=new Font("楷体", 1, 50);
		textFieldName.setFont(f);
		textFieldName.setHorizontalAlignment(JTextField.CENTER);
		textFieldName.setForeground(Color.green);
		this.add(textFieldName);
		
		btnCreate=new JButton("抽取");
		btnCreate.setBounds(360, 350, 80, 50);
		btnCreate.addActionListener(this);
		Font font=new Font("楷体", 1, 22);
		btnCreate.setFont(font);
		//btnCreate.setForeground(Color.orange);
		this.add(btnCreate);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallRandom callrandom=new CallRandom();
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {  //event处理的对象
		// TODO Auto-generated method stub
		Name name=new Name();
		if(event.getSource()==btnCreate)
		{
			//int number=(int)(Math.random()*100)%38+1;
			
			Random rand=new Random();
			int number=rand.nextInt(11);
			textFieldName.setText(name.getName(number));
			
			//随机字母
			//char ch=(char)(rand.nextInt('z'-'a'+1)+'a');
			//textFieldName.setText(Character.toString(ch));
			
		}
		
		
		
	}

}
