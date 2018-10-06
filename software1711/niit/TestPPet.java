package software1711.niit;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;


public class TestPPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("ww", 70, 80, "拉布拉多");
		Penguin penguin=new Penguin("xQ", 75, 85, "雄");
		Master mm=new Master("*流", 1000);
		mm.feed(dog);
		mm.feed(penguin);
		
		dog.print();
		penguin.print();
		
		System.out.println("输入领养的宠物类型（狗——1  企鹅——2）");
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		Pet pet=mm.getPet(choice);
		if(pet!=null)
		{
			System.out.println("领养成功");
			mm.feed(pet);
			pet.print();
			mm.play(pet);
			pet.print();
		}
		else{
			System.out.println("领养失败");
		}
	}
}
