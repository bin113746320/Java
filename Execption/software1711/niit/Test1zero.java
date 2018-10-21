package Execption.software1711.niit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			divide();
		}
		catch(InputMismatchException e){
			e.printStackTrace();
		}
        catch(ArithmeticException e){
        	e.printStackTrace();
		}
		
		
		/*Scanner in=new Scanner(System.in);
		int num1=0;
		int num2=0;
		try{
			System.out.println("请输入被除数:");
			num1=in.nextInt();
			System.out.println("请输入除数:");
			num2=in.nextInt();
		}
		catch(ArithmeticException e){
			System.err.println("出现错误：被除数和除数必须为整数");
		}
		catch(InputMismatchException e)
		{
			System.err.println("出现错误：除数不能为零");
			//e.printStackTrace();
			//System.exit(1);唯一finally不能执行
			//return;
		}
		finally{
			System.out.println(String.format("%d/%d=%d", num1, num2,num1/num2));
			System.out.println("谢谢使用");
			
		}*/
	}
	private static void divide(){
		Scanner in=new Scanner(System.in);
		int num1=0;
		int num2=0;
		System.out.println("请输入被除数:");
		num1=in.nextInt();
		System.out.println("请输入除数:");
		num2=in.nextInt();
		System.out.println(String.format("%d/%d=%d", num1, num2,num1/num2));
		System.out.println("谢谢使用");

	}
}
