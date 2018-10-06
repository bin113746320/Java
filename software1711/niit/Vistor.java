package software1711.niit;
public class Vistor {
	private String name;
	private int age;
	public Vistor(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	public int getage()
	{
		return this.age;
	}
	public String getname()
	{
		return this.name;
	}
	public int showprice()
	{
		if(this.age>=18&&this.age<=60)			
		{
			return 20;
		}else if(this.age<18)
		{
			return 10;
		}else 
		{
			return 0;
		}
	}
}
