package software1711.niit;

import java.util.ArrayList;

public class ArrayListPenguinT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin penguin1=new Penguin("penguin1", 60, 65, "Q仔");
		Penguin penguin2=new Penguin("penguin2", 70, 75, "Q妹");
		Penguin penguin3=new Penguin("penguin3", 80, 85, "Q仔");
		Penguin penguin4=new Penguin("penguin4", 90, 95, "Q妹");
		Penguin penguin5=new Penguin("penguin5", 70, 80, "Q仔");
		
		ArrayList<Penguin> penguins=new ArrayList<Penguin>();
		penguins.add(penguin1);
		penguins.add(penguin2);
		penguins.add(penguin3);
		penguins.add(penguin4);
		penguins.add(penguin5);
		
		System.out.print("penguins的元素个数:"+penguins.size()+"\n");
		for(int i=0;i<penguins.size();i++)
		{
			System.out.print(penguins.get(i)+"\n");
		}
		System.out.print("删除第一个企鹅后\n");
		penguins.remove(0);
		for(int i=0;i<penguins.size();i++)
		{
			System.out.print(penguins.get(i)+"\n");
		}
		if(penguins.contains(penguin5))
		{
			System.out.print("存在penguin5\n");
			penguins.remove(3);
			System.out.print("删除penguin5企鹅后\n");
		}
		for(int i=0;i<penguins.size();i++)
		{
			System.out.print(penguins.get(i)+"\n");
		}
	}
}
