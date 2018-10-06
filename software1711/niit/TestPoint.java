package software1711.niit;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1=new Point();
		Point point2=new Point();
		Scanner input=new Scanner(System.in);
		
		System.out.println("输入x1的值");
		int x1=input.nextInt();
		point1.setX(x1);
		
		System.out.println("输入y1的值");
		int y1=input.nextInt();
		point1.setY(y1);
		
		System.out.println("输入x2的值");
		int x2=input.nextInt();
		point2.setX(x2);
		
		System.out.println("输入y2的值");
		int y2=input.nextInt();
		point2.setY(y2);
		
		System.out.println("两点间的距离："+point1.distance(point2));
	}
}
