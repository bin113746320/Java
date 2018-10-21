package software1711.niit;

import java.util.HashMap;

public class Mfilm {
	String name;

	public Mfilm(String name) {
		this.name = name;
	}
	
	public String toString(){
		String s;
		s=name;
		return s;
	}

	public static Mfilm mostDown(HashMap<Mfilm,Integer> download){
		int num=0;
		Mfilm Film=null;
		for(Mfilm film:download.keySet())
		{
			if(num<download.get(film))
			{
				num=download.get(film);
			}
		}
		for(Mfilm film:download.keySet())
		{
			if(download.get(film)==num)
			{
				Film=film;
			}
		}
		return Film;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mfilm film1=new Mfilm("无双");
		Mfilm film2=new Mfilm("战狼1");
		Mfilm film3=new Mfilm("战狼2");
		Mfilm film4=new Mfilm("动物世界");
		
		HashMap<Mfilm,Integer> download=new HashMap<Mfilm,Integer>();
		download.put(film1, 6000);
		download.put(film2, 8000);
		download.put(film3, 9000);
		download.put(film4, 5000);
		System.out.println("下载次数最多的电影："+mostDown(download));	
	}
}
	
