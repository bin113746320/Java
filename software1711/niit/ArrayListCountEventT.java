package software1711.niit;

import java.sql.SQLTransactionRollbackException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCountEventT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("one");
		lists.add("peach");
		lists.add("pear");
		lists.add("plum");
		System.out.print(" 长度为偶数的个数："+CountEvens(lists));
	} 
	
	private static int CountEvens(ArrayList<String> lists){
		int num=0;
		for(int i=0;i<lists.size();i++)
		{
			System.out.print(lists.get(i)+" ");
			if(lists.get(i).length()%2==0)
			{
				num++;
			}
		}
		return num;
	}

}
