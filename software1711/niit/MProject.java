package software1711.niit;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.SpringLayout.Constraints;

public class MProject {

	private static final Object Key = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> projects  =new HashMap<String,String>();
		projects.put("Tom","CoreJava");
		projects.put("John","Oracle");
		projects.put("SuSan","Oracle");
		projects.put("Jerry","JDBC");
		projects.put("Jim","Unix");
		projects.put("Kevin","JSP");
		projects.put("Lucy","JSP");
		projects.put("Allen","JDBC");
		
		if(projects.containsKey("Lucy"))
		{
			projects.put("Lucy", "JDBC");
		}
		
		for(String key:projects.keySet())
		{
			System.out.println(key+": "+projects.get(key));
		}
		

		for(String key:projects.keySet())
		{
			if(projects.get(key).equals("JSP"))
			{
				System.out.println(key+": "+projects.get(key));
			}
		}
		
		/*Iterator it=projects.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(key+projects.get(it.next()));
		}*/
	}
}
