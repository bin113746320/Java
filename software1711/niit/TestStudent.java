package software1711.niit;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student=new Student[5];
		Student student1=new Student("17123");
		//student[0]=("17123");
		student1.setsName("*三");
		student1.setsSex("女");
		student1.setsAge(20);
		student1.setsJava(75);
		
		Student student2=new Student("17223","*四");
		student2.setsSex("男");
		student2.setsAge(21);
		student2.setsJava(80);
		
		Student student3=new Student("17323","*五","女");
		student3.setsAge(22);
		student3.setsJava(85);
		
		Student student4=new Student("17323","*六","男",23);
		student4.setsJava(90);
		
		Student student5=new Student("17323","*七","女",24,95);
		
		student[0]=student1;
		student[1]=student2;
		student[2]=student3;
		student[3]=student4;
		student[4]=student5;
		
		for(int i=0;i<student.length;i++)
		{
			student[i].print();
		}
		
		int sum=0;
		for(int i=0;i<student.length;i++)
		{
			sum+=student[i].getsJava();
		}
		System.out.println("Java的总成绩为："+sum/5);
		
		float Max=student[0].getsJava();
		String name=student[0].getsName();
		for(int i=1;i<student.length;i++)
		{
			if(student[i].getsJava()>Max)
			{
				Max=student[i].getsJava();
				name=student[i].getsName();
			}
		}
		System.out.println("最高成绩："+Max+",姓名："+name);
	
		float Min=student[0].getsJava();
		String Name=student[0].getsName();
		for(int i=1;i<student.length;i++)
		{
			if(student[i].getsJava()<Min)
			{
				Max=student[i].getsJava();
				Name=student[i].getsName();
			}
		}
		System.out.println("最低成绩："+Min+",姓名："+Name);

	}
}
