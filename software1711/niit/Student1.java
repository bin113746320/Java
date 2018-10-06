package software1711.niit;

public class Student1 extends Person1{
	private String no;
	private double scoreOfEn;
	private double scoreOfMath;
	private double scoreOfCh;
	
	public Student1(String name,String no, double scoreOfEn, double scoreOfMath,
			double scoreOfCh) {
		super(name);
		this.no = no;
		this.scoreOfEn = scoreOfEn;
		this.scoreOfMath = scoreOfMath;
		this.scoreOfCh = scoreOfCh;
	}
	
	public double aver()
	{
		double total=this.scoreOfEn+this.scoreOfMath+this.scoreOfCh ;
		return total/3;
	}
	 
	public double max()
	{
		double max=0;
		if(this.scoreOfEn>this.scoreOfMath)
		{
			max=this.scoreOfEn;
		}
		else{
			max=this.scoreOfMath;
		}
		
		if(this.scoreOfCh>max){
			max=this.scoreOfCh;
		}
		return max;
	}
	
	public double min()
	{
		double min=0;
		if(this.scoreOfEn>this.scoreOfMath)
		{
			min=this.scoreOfMath;
		}
		else{
			min=this.scoreOfEn;
		}
		
		if(this.scoreOfCh<min){
			min=this.scoreOfCh;
		}
		return min;
	}
	
	public String toString()
	{
		String s="学号："+this.no+" 姓名："+super.getName()+" 性别："+super.getSex()+" 平均分："+aver()
				+" 最高分："+max()+" 最低分："+min();
		return s;
	}
}
