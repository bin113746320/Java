package software1711.niit;

//import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog("毛毛", 90, 80, "拉布拉多");
		Dog dog2=new Dog("欢欢", 80, 70, "藏獒");
		Dog dog3=new Dog("阿毛", 85, 80, "泰迪");
		Dog dog4=new Dog("阿欢", 70, 75, "雪纳瑞");
		Dog dog5=new Dog("小美", 70, 75, "未知");
		
		LinkedList<Dog> dogs=new LinkedList<Dog>();
		//dogs.
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(1,dog3);
		dogs.addLast(dog4);
		dogs.addFirst(dog5);
		
		int num=0;
		for(int i=0;i<dogs.size();i++)
		{
		  num=i+1;
		  System.out.print("Dogs集合中第"+num+"个元素："+dogs.get(i)+"\n");
		}
		
		System.out.print("getFirst的使用\n");
		System.out.print(dogs.getFirst()+"\n");
		System.out.print("getLast的使用\n");
		System.out.print(dogs.getLast()+"\n");
		
		dogs.removeFirst();
		System.out.print("removeFirst的使用\n");
		for(int i=0;i<dogs.size();i++)
		{
		  num=i+1;
		  System.out.print("Dogs集合中第"+num+"个元素："+dogs.get(i)+"\n");
		}
		
		dogs.removeLast();
		System.out.print("removeLast的使用\n");
		for(int i=0;i<dogs.size();i++)
		{
		  num=i+1;
		  System.out.print("Dogs集合中第"+num+"个元素："+dogs.get(i)+"\n");
		}
	}
}
