package software1711.niit;

import java.util.Scanner;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feeder feeder=new Feeder();
		
		System.out.println("输入喂食的动物（狗——1  猫——2）");
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		
		Animal animal=null;
		Food food=null;
		if(choice==1)
		{
			animal=new Dog_1();
			food=new Fish("骨头");
			
		}
		else if(choice ==2)
		{
		    animal=new Cat();
		    food=new Bone("鱼");
		}
		
		feeder.feed(animal,food);

	}

}
