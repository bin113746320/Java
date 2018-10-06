package spring.software1711.niit.cn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LandPlay extends JFrame implements ActionListener{
	private Player player;
	private Computer computer;
	JButton btnExit=new JButton();
	JButton btnFist=new JButton(); //石头按钮
	JButton btnScissors=new JButton(); //剪刀按钮
	JButton btnPalm=new JButton(); //布按钮
	JLabel labelPlayer=new JLabel();
	JLabel labelComputer=new JLabel();
	JLabel labelFist=new JLabel();//玩家出拳label
	JLabel labelCompFist=new JLabel();//电脑出拳label
	JLabel labelCompareScore=new JLabel();//比分标签
	JLabel labelColon=new JLabel();//冒号标签
	JTextField playerTextField=new JTextField();
	JTextField compTextField=new JTextField();
	JTextField fistTextFieldP=new JTextField();//玩家TextFiel
	JTextField fistTextFieldC=new JTextField();//电脑TextFiel
	JTextField scoreTextFieldP=new JTextField();//玩家得分
	JTextField scoreTextFieldC=new JTextField();//电脑得分
	
	
	public LandPlay(Player player ,Computer computer)
	{
		this.player=player;
		this.computer=computer;
		this.setTitle("游戏世界");
		this.setSize(800,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.lightGray);
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
		labelPlayer=new JLabel();
		labelPlayer.setBounds(250,100,80,40);
		labelPlayer.setText("玩家姓名：");
		Font font=new Font("楷体",1,15);
		labelPlayer.setForeground(Color.black);
		labelPlayer.setFont(font);
		add(labelPlayer);
		
		playerTextField=new JTextField(this.getPlayer().getName());//this.getPlayer().getName()
		playerTextField.setBounds(330, 100, 80, 30);
		add(playerTextField);
		
		labelFist=new JLabel();
		labelFist.setBounds(250,150,80,40);
		labelFist.setText("玩家出拳：");
		Font font1=new Font("楷体",1,15);
		labelFist.setForeground(Color.black);
		labelFist.setFont(font1);
		add(labelFist);
		
		fistTextFieldP=new JTextField();
		fistTextFieldP.setBounds(330, 150, 80, 30);
		add(fistTextFieldP);
		
		labelComputer=new JLabel();
		labelComputer.setBounds(500,100,80,40);
		labelComputer.setText("虚拟角色：");
		Font f=new Font("楷体",1,15);
		labelComputer.setForeground(Color.black);
		labelComputer.setFont(f);
		add(labelComputer);
		
		compTextField=new JTextField(this.getComputer().getName());
		compTextField.setBounds(580, 100, 80, 30);
		compTextField.setEditable(false);
		add(compTextField);
		
		labelCompFist=new JLabel();
		labelCompFist.setBounds(500, 150, 80, 40);
		labelCompFist.setText("电脑出拳：");
		Font font2=new Font("楷体",1,15);
		labelCompFist.setForeground(Color.black);
		labelCompFist.setFont(font2);
		add(labelCompFist);
		
		fistTextFieldC=new JTextField();
		fistTextFieldC.setBounds(580, 150, 80, 30);
		add(fistTextFieldC);
		
		ImageIcon image1=new ImageIcon("src/image/icon_1.jpg");
		btnFist=new JButton();
	//	btnFist.setMaximumSize(new Dimension(100, 50));
		btnFist.setIcon(image1);
		btnFist.setBounds(250,300,70,60);
	//	btnFist.setBorderPainted(false);
		btnFist.addActionListener(this);
	//	this.setVisible(true);
		add(btnFist);
		
		btnScissors=new JButton(new ImageIcon("src/image/icon_2.jpg"));
		btnScissors.setBounds(375,300,70,60);
		btnScissors.addActionListener(this);
		add(btnScissors);
		
		btnPalm=new JButton(new ImageIcon("src/image/icon_3.jpg"));
		btnPalm.setBounds(500,300,70,60);	
		btnPalm.addActionListener(this);
		add(btnPalm);
		
		labelCompareScore=new JLabel("比分：");
		labelCompareScore.setBounds(350,400,50,30);
		add(labelCompareScore);
		
		scoreTextFieldP=new JTextField();
		scoreTextFieldP.setBounds(400,400,50,30);
		add(scoreTextFieldP);
		
		labelColon=new JLabel("：");
		labelColon.setBounds(460,400,50,30);
		add(labelColon);
		
	    scoreTextFieldC=new JTextField();
	    scoreTextFieldC.setBounds(490,400,50,30);
		add(scoreTextFieldC);
		
		btnExit=new JButton("退出");
		btnExit.setBounds(50,500,80,40);
		btnExit.addActionListener(this);
		add(btnExit);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int dataPlayer=0;
		if(e.getSource()==btnExit)
		{
			this.dispose();
		}
	    else if(e.getSource()==btnFist)
		{
	    	dataPlayer=1;
	    	fistTextFieldP.setText("石头");		
		}
		else if(e.getSource()==btnScissors)
		{
			dataPlayer=2;
			fistTextFieldP.setText("剪刀");
		}
		else if(e.getSource()==btnPalm)
		{
			dataPlayer=3;
			fistTextFieldP.setText("布");	
		}
		
		int dataComputer=(int)(Math.random()*10)%3+1;
		switch(dataComputer)
		{ 
		case 1:fistTextFieldC.setText("石头");break;
		case 2:fistTextFieldC.setText("剪刀");break;
		case 3:fistTextFieldC.setText("布");break;	
		}
		
		if(dataPlayer-dataComputer==-1||dataPlayer-dataComputer==2)
		{
			this.getPlayer().setScore(this.getPlayer().getScore()+1);
			JOptionPane.showMessageDialog(null,"恭喜,您赢了");
			scoreTextFieldP.setText(Integer.toString(this.getPlayer().getScore()));
		}
		else if(dataPlayer-dataComputer==1||dataPlayer-dataComputer==-2)
		{
			this.getComputer().setScore(this.getComputer().getScore()+1);
			JOptionPane.showMessageDialog(null,"很遗憾，您输了");
			scoreTextFieldC.setText(Integer.toString(this.getComputer().getScore()));
		}
		else if(dataPlayer==dataComputer)
		{
			JOptionPane.showMessageDialog(null,"平局");
		}
	}
}
