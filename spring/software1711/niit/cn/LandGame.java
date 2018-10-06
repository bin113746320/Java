package spring.software1711.niit.cn;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.security.auth.login.FailedLoginException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LandGame extends JFrame implements ActionListener{
	private Player player;
	private Computer computer;
	JCheckBox jcb1,jcb2,jcb3;
	JLabel backgroundLabel=new JLabel();
	JLabel welcomelabel=new JLabel();
	JLabel namelabel=new JLabel();
	JLabel choicelabel=new JLabel();
	JLabel errorLabel=new JLabel();
	JTextField nameText=new JTextField();
	JButton btnGo=new JButton();
	JRadioButton jrb1,jrb2,jrb3;
	
	public LandGame(Player player,Computer computer){
		this.player=player;
		this.computer=computer;
		this.setTitle("登录游戏");
		this.setSize(800,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.green);
		//this.add//(new ImageIcon("src/image/icon_1.jpg"));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Init();
	}
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void Init(){
		this.setLayout(null);
		welcomelabel=new JLabel();
		welcomelabel.setBounds(200,100,400,80);
		welcomelabel.setText("欢迎进入 游戏世界");
		Font font=new Font("楷体",1,40);
		welcomelabel.setForeground(Color.blue);
		welcomelabel.setFont(font);
		add(welcomelabel);
		
		namelabel=new JLabel("玩家昵称：");
		namelabel.setBounds(280,200,80,40);
		add(namelabel);
		
		nameText=new JTextField();
		nameText.setBounds(350,200,80,30);
		add(nameText);
		
		choicelabel=new JLabel("请选择电脑角色：");
		choicelabel.setBounds(280,250,120,40);
		add(choicelabel);
		jrb1=new JRadioButton("曹操");
		jrb1.setBounds(280,300,60,40);
		add(jrb1);
		
		jrb2=new JRadioButton("刘备");
		jrb2.setBounds(340,300,60,40);
		add(jrb2);
		
		jrb3=new JRadioButton("孙权");
		jrb3.setBounds(400,300,60,40);
		add(jrb3);
		
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(jrb1);
		buttonGroup.add(jrb2);
		buttonGroup.add(jrb3);
		
		btnGo=new JButton("开始游戏");
		btnGo.setBounds(330,450,100,40);
		Font f1=new Font("黑体",1,15);
		btnGo.setFont(f1);
		btnGo.addActionListener(this);
		add(btnGo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player=new Player("hu",0);
		Computer computer=new Computer();
		
		LandGame landgame=new LandGame(player,computer);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnGo)
		{
			if(this.getPlayer().getName().equals(nameText.getText()))
			{
				if(jrb1.isSelected())
				{
					this.getComputer().setName("曹操");
					this.getComputer().setScore(0);
					LandPlay landplay=new LandPlay(player,computer);
				}
				else if(jrb2.isSelected())
				{
					this.getComputer().setName("刘备");
					this.getComputer().setScore(0);
					LandPlay landplay=new LandPlay(player,computer);					
				}		
				else if(jrb3.isSelected())
				{
					this.getComputer().setName("孙权");
					this.getComputer().setScore(0);
					LandPlay landplay=new LandPlay(player,computer);					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"未选择玩家角色");
				}
			}
		}
	}
}
