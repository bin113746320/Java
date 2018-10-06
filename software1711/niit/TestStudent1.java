package software1711.niit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu1=new Student1("张三","171212", 85, 80, 90);
		stu1.setSex('男');
		stu1.setAge(21);
		System.out.print("student1: "+stu1.toString());//
	}
}