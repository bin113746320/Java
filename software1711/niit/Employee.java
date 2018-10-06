package software1711.niit;

import java.text.DateFormat; 

import javax.print.attribute.standard.RequestingUserName;

public class Employee extends People implements IEmployee{
	private double salary;
    private int hireDay;
	
	public Employee(int age, String name,double salary, int hireDay) {
		super(age,name);
		this.salary = salary;
		this.hireDay = hireDay;
	}
	
	public double getSalary(){
		return this.salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}

	public int getHireDay(){
		return hireDay;
	}
	
	public void getInfo()
	{
		System.out.println("姓名:"+this.getName()+"\n职务：员工"+"\n年龄："+
						    super.getAge()+"\n月薪："+this.salary+"\n入职日期："+this.hireDay+"\n");
	}

	@Override
	public void addSalary() {
		// TODO Auto-generated method stub
		salary+=prize;
		//return prize;
	}

}


