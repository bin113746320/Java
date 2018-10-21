package software1711.niit;
import java.util.ArrayList;
import java.util.HashMap;

public class MStudent {
	private String id;
	private String name;
	
	public MStudent(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		String S=null;
		S=this.getId()+" "+this.getName();
		return S;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MStudent student1=new MStudent("123456", "张三");
		MStudent student2=new MStudent("123654", "李四");
		MStudent student3=new MStudent("124563", "*五");
		MStudent student4=new MStudent("128765", "TOM");
		ArrayList<MStudent> Pstudents=new ArrayList<MStudent>();
		Pstudents.add(student1);
		Pstudents.add(student2);
		
		ArrayList<MStudent> Qstudents=new ArrayList<MStudent>();
		Qstudents.add(student3);
		Qstudents.add(student4);
		
		HashMap<String, ArrayList<MStudent>> ClassP = new HashMap<String,ArrayList<MStudent>>();
		ClassP.put("普通班",Pstudents);
		//HashMap<String, ArrayList<MStudent>> ClassQ = new HashMap<String,ArrayList<MStudent>>();
		ClassP.put("强化班",Qstudents);
		
		for(String s:ClassP.keySet())
		{
			System.out.println(s+"学生：");
			//System.out.println(s+":"+ClassP.get(s));
			if("普通班".equals(s))
			{
				//ArrayList<MStudent> lists=ClassP.get(s);
				for(MStudent S:ClassP.get(s))
				{
					System.out.println(S);
				}
				
			}
			if("强化班".equals(s))
			{
				//ArrayList<MStudent> lists=ClassP.get(s);
				for(MStudent S:ClassP.get(s))
				{
					System.out.println(S);
				}
				
			}
		}
		
		/*for(String s:ClassQ.keySet())
		{
			System.out.println(s+":"+ClassQ.get(s));
		}*/

	}

}
