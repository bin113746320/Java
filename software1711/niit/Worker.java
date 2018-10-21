package software1711.niit;

import java.util.ArrayList;
import java.util.Iterator;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.print.attribute.standard.RequestingUserName;
import javax.swing.SpringLayout.Constraints;


public class Worker {
	private int age;
	private String name;
	private double salary;
	
	public Worker(){}
	public Worker(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void work(){
		System.out.println(name+"work");
	}
	public  boolean equals(Worker worker){
		if(worker.getName().equals(this.name)
		   &&worker.getAge()==this.age&&
		   worker.getSalary()==this.salary)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker1=new Worker("zhang3",18,3000);
		Worker worker2=new Worker("li4",25,3500);
		Worker worker3=new Worker("wang5",22,3200);
		Worker worker4=new Worker("zhao6",24,3300);
		ArrayList<Worker> workers=new ArrayList<Worker>();
		workers.add(worker1);
		workers.add(worker2);
		workers.add(worker3);
		workers.add(1,worker4);
	
		for(int i=0;i<workers.size();i++)
		{
			if(workers.get(i).getName().equals("wang5"))
			{
				workers.remove(i);
			}
		}
	
		for(int i=0;i<workers.size();i++)
		{
			System.out.println("姓名："+workers.get(i).getName()+"  年龄："+workers.get(i).getAge()+"  工资："+workers.get(i).getSalary());
		}
		
		Iterator it=workers.iterator();
		while(it.hasNext())
		{
			((Worker) it.next()).work();
		}
		
		if(worker1.equals(worker2))
		{
			System.out.println("两名员工不同");
		}
		
	}
}
