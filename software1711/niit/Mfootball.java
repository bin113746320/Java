package software1711.niit;

import java.util.HashMap;
import java.util.Scanner;

public class Mfootball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> countrys=new HashMap<String,String>();
		countrys.put("2006", "意大利");
		countrys.put("2002", "巴西");
		countrys.put("1998", "法国");
		countrys.put("1994", "巴西");
		countrys.put("1990", "德国");
		countrys.put("1986", "阿根廷");
		countrys.put("1982", "意大利");
		countrys.put("1978", "阿根廷");
		countrys.put("1974", "德国");
		countrys.put("1970", "巴西");
		countrys.put("1966", "英格兰");
		countrys.put("1962", "巴西");
		countrys.put("1958", "巴西");
		countrys.put("1954", "德国");
		countrys.put("1950", "乌拉圭");
		countrys.put("1938", "意大利");
		countrys.put("1934", "意大利");
		countrys.put("1930", "乌拉圭");
		Scanner input=new Scanner(System.in);
		System.out.println("输入冠军：");
		String country=input.next();
		for(String key:countrys.keySet())
		{
		    if(countrys.get(key).equals(country))
			{
				System.out.println(key);
			}
		}
		System.out.println("输入年份：");
		String year=input.next();
		if(countrys.containsKey(year))
		{
			System.out.println(countrys.get(year));
		}
		else
		{
			System.out.println(year+"年没有举办世界杯");
		}
		
		
		
	}
}













