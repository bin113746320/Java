package spring.software1711.niit.cn;

import java.util.HashMap;
import java.util.Iterator;

public class HashM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> country=new HashMap<String,String>();
		country.put("CN", "China");
		country.put("US","America");
		country.put("JP", "Japan");
		country.put("UK","England");//britain
		
		/*for(String key:country.keySet())
		{
			System.out.println(country.get(key));
		}
		
		System.out.println("country中有 "+country.size()+" 组数据");
		
		country.remove("JP");
		System.out.println("country中有 "+country.size()+" 组数据");
		
		System.out.println(country);
		
		if(country.containsKey("CN"))
		{
			System.out.println(country.get("UK"));
		}
		
		System.out.println(country.keySet());
		System.out.println(country.values());*/
		
		Iterator it=country.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(country.get(it.next()));
		}
		
	}
}
