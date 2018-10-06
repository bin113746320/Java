package software1711.niit;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle1=new Circle(2);
		System.out.println("circle1的面积："+circle1.area()+"    "+"circle1的周长："+circle1.around());
		
		System.out.println("输入circle2的半径：");
		Scanner input=new Scanner(System.in);
		double radius=input.nextDouble();
		
		Circle circle2=new Circle();
		circle2.setRadius(radius);
		
		System.out.println("circle2的面积："+circle2.area()+"    "+"circle2的周长："+circle2.around());
	}
}


