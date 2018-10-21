package Execption.software1711.niit;

import java.util.Scanner;

public class Test2Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num1=0;
		try{
			System.out.println("输入序号：");
			num1=in.nextInt();
			switch(num1)
			{
			case 1:
				System.out.println("课程名称："+"C#");
				break;
			case 2:
				System.out.println("课程名称："+"Java");
				break;
			case 3:
				System.out.println("课程名称："+"C");
				
				break;
			}
			
		}
		catch(Exception e){
			System.out.println("输入不是数字");
			e.printStackTrace();
			System.exit(1);
		}
		finally{
			System.out.println("欢迎提出建议");
		}
	}
}
