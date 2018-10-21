package software1711.niit;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("170271","Tom","男",18,100);
		Student student2=new Student("170272","Jerry","女",22,90);
		Student student3=new Student("170273","Owen","男",25,80);
		Student student4=new Student("170274","Jim","女",30,75);
		Student student5=new Student("170275","Steve","女",28,85);
		Student student6=new Student("170276","Kevin","男",24,70);
		ArrayList<Student> lists=new ArrayList<Student>();
		lists.add(student1);
		lists.add(student2);
		lists.add(student3);
		lists.add(student4);
		lists.add(student5);
		lists.add(student6);
		System.out.println("平均年龄："+AgeAverage(lists));
		System.out.println("平均成绩："+ScoreAverage(lists));
	}
	private static double AgeAverage(ArrayList<Student> lists){
		double average=0;
		int sum=0;
		for(Student S:lists)
		{
			sum+=S.getsAge();
		}
		return sum/lists.size();
	}
	private static double ScoreAverage(ArrayList<Student> lists){
		double average=0;
		int sum=0;
		for(int i=0;i<lists.size();i++)
		{
			sum+=lists.get(i).getsJava();
		}
		return sum/lists.size();
	}
}
