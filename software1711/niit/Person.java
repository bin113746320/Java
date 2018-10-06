package software1711.niit;

import java.util.Scanner;

public class Person {
	private String name;
	private int score=0;
	
	public Person() {
	
	}
	
	public Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int showFist()
	{
		System.out.println("请出拳：(1.剪刀 2.石头 3.布):");
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		switch(choice)//
		{
		case 1:System.out.println("你出拳：剪刀");break;
		case 2:System.out.println("你出拳：石头");break;
		case 3:System.out.println("你出拳：布");break;
		}
		return choice;
	}
}





