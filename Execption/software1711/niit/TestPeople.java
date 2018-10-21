package Execption.software1711.niit;

import java.util.Scanner;

public class TestPeople {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		People people=new People() ;
		
		System.out.println("输入年龄：");
		Scanner in=new Scanner(System.in);
		int age=in.nextInt();
		System.out.println("输入性别：");
		String sex=in.next();
		people.setAge(age);
		people.setSex(sex);
		System.out.println(people);
	}
}
