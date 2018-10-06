package software1711.niit;

import javax.naming.InitialContext;

import java.util.Scanner;

public class Game {
	private Person personPlayer;
	private Computer computerPlayer;
	private int count=0;
	
	public Game(Person personPlayer, Computer computerPlayer, int count) {
		this.personPlayer = personPlayer;
		this.computerPlayer = computerPlayer;
		this.count = count;
	}
	public Game() {
	}
	public Person getPersonPlayer() {
		return personPlayer;
	}
	public void setPersonPlayer(Person personPlayer) {
		this.personPlayer = personPlayer;
	}
	public Computer getComputerPlayer() {
		return computerPlayer;
	}
	public void setComputerPlayer(Computer computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	Person myname=new Person();
	Computer enemy=new Computer();
	public void init()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的名字:");
		String name=input.nextLine();		
		myname.setName(name);
		System.out.println("请选择对方角色（1.刘备 2.孙权 3.曹操）:");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:enemy.setName("刘备");	
		       break;
		case 2:enemy.setName("孙权");
		       break;
		case 3:enemy.setName("曹操");
		       break;
		}	
		System.out.println("对战："+myname.getName() +"VS"+enemy.getName());
	}
	
	public void caculateResult()
	{
		int personscore;
		int computerscore;
		if(personshow-computershow==1||personshow-computershow==-2)
		{
			personscore=myname.getScore()+1;
			myname.setScore(personscore);
			System.out.println("恭喜，你赢了");
		}
		else if(personshow-computershow==-1||
				personshow-computershow==2)
		{
			computerscore=enemy.getScore()+1;
			enemy.setScore(computerscore);
			System.out.println("很遗憾，你输了");
		}
		else 
		{
			System.out.println("平局");
		}
	}
	
	int personshow;
	int computershow;
	public void beginGame()
	{ 
		Scanner input=new Scanner(System.in);
	    System.out.println("要开始吗？（y-开始/n-退出）:");
		char decision=input.next().charAt(0);
		
		if(decision=='y')
		{
			char ch;
			do
			{
				personshow=myname.showFist();		
				computershow=enemy.showFist();
				this.count++;
				caculateResult();
				System.out.println("是否开始下一轮？（y-开始/n-退出）:");
				ch=input.next().charAt(0);
			}
			while(ch=='y');
		}
		else 
		{
			return;
		}
	}
	
	public void showResult()
	{
		System.out.println("********************************");
		System.out.println("对战次数："+this.count+"\n");
		System.out.println(myname.getName()+"  VS  "+enemy.getName());
		System.out.println("姓名\t"+"得分"+"\n"+myname.getName()+"\t"+
		myname.getScore() +"\n"+enemy.getName()+" \t"+enemy.getScore());
	}
}
