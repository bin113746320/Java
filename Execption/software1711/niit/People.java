package Execption.software1711.niit;

public class People {
	private int age;
	private String sex;
	public People(){
		
	}
	
	public People(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age)throws Exception{
		if(age>30||age<18)
		{
			throw new Exception("年龄必须在18到30内");
		}
		else
		{
			this.age=age;
		}
	}
	
	public String getSex(){
		return this.sex;
	}
	
	
	public void setSex(String sex)throws Exception{
		if(sex.equals("男")||sex.equals("女"))
		{
			this.sex=sex;
		}
		else
		{
			throw new Exception("性别必须是\"男\"或\"女\"");
		}
	}
	
	public String toString(){
		String s=new String();
		s="年龄："+getAge()+"  性别："+getSex();
		//System.out.println("年龄："+getAge()+"  性别："+getSex());
		return s;
	}


}
