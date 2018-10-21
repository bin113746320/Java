package software1711.niit;

import java.util.ArrayList;

public class ArrayListT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog("毛毛", 90, 80, "拉布拉多");
		Dog dog2=new Dog("欢欢", 80, 70, "藏獒");
		Dog dog3=new Dog("阿毛", 85, 80, "泰迪");
		Dog dog4=new Dog("阿欢", 70, 75, "雪纳瑞");
		Dog dog5=new Dog("小美", 70, 75, "未知");
		
		ArrayList<Dog> dogs=new ArrayList<Dog>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		dogs.add(dog5);
		
		System.out.print("Dogs集合中元素的个数为："+dogs.size()+"\n");
		int num=0;
		for(int i=0;i<dogs.size();i++)
		{
		  num=i+1;
		  System.out.print("Dogs集合中第"+num+"个元素："+dogs.get(i)+"\n");
		}
		//删除第二个
		dogs.remove(1);
		System.out.print("删除后\n");
		for(int i=0;i<dogs.size();i++)
		{
		  num=i+1;
		  System.out.print("Dogs集合中第"+num+"个元素："+dogs.get(i)+"\n");
		}
		
		
		System.out.print("删除dog5\n");
		if(dogs.contains(dog5))
		{
			dogs.remove(dog5);
		}
		for(int i=0;i<dogs.size();i++)
		{
		  num=i+1;
		  System.out.print("Dogs集合中第"+num+"个元素："+dogs.get(i)+"\n");
		}
		
		
	}
}
