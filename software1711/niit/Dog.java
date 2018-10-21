package software1711.niit;

public class Dog extends Pet{
	
	private String strain;   //品种

	public Dog(String name,int health,int love,String strain) {
		super(name, health, love);  //调用父类的构造方法
	
		this.strain = strain;
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public void print()
	{
		System.out.println("大家好！ "+"我的名字是 "+super.getName()+" 我的健康值 "+super.getHealth()+" 亲密度 "
				+super.getLove()+" 我的品种："+this.strain);
	}
	
	public String toString(){
		String s=new String();
		s="大家好！ "+"我的名字是 "+super.getName()+" 我的健康值 "+super.getHealth()+" 亲密度 "
				+super.getLove()+" 我的品种："+this.strain;
		return s;
	}
	
	public void eat(){
		if(getHealth()>100){
			System.out.println("狗不饿smile");
		}else {
			setHealth(getHealth()+3);
		}
	}
	
	public void playflyDisc(){
		setHealth(getHealth()-10);
		setLove(getLove()+5);
	}
	
	
	
}



