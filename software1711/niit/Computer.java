package software1711.niit;

public class Computer {
	private String name;
	private int score=0;
	
	public Computer() {
		
	}
	
	public Computer(String name, int score) {
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
		int data=(int)(Math.random()*10)%3+1;
		switch(data)
		{ 
		case 1:System.out.println(this.getName()+"出拳：剪刀");break;
		case 2:System.out.println(this.getName()+"出拳：石头");break;
		case 3:System.out.println(this.getName()+"出拳：布");break;	
		}
		return data;
	}
}
