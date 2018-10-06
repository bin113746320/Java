package software1711.niit;

public class Person1 {
	private String name;
	private char sex;
	private int age;
	
	public Person1() {
	}

	public Person1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		String s="姓名："+name+"性别："+sex+"年龄："+age;
		return s;
	}
}
