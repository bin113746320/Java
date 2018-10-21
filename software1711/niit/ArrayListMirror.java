package software1711.niit;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("1");
		lists.add("2");
		lists.add("3");
		lists.add("4");
		Mirror(lists);
		Iterator it=lists.iterator();
		System.out.println("迭代：");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("增强型for循环：");
		for(String x:lists)
		{
			System.out.println(x);
		}
		System.out.println(lists);
	}
	
	private static void Mirror(ArrayList<String> lists){
		for(int i=lists.size()-1;i>=0;i--)
		{
			lists.add(lists.get(i));
		}
	}
}
