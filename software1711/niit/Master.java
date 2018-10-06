package software1711.niit;

public class Master {
	private String name;	
	private int money;
	
	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void feed(Pet pet){
		pet.eat();
	}
	
	public Pet getPet(int typeId){
		Pet pet=null;
		if(typeId==1)
		{
			pet=new Dog("*七",80,90,"zao");
		}else if(typeId==2)
		{
			pet=new Penguin("ke爱", 85, 95, "雌");
		}
		return pet;
	}
	
	public void play(Pet pet){
		if(pet instanceof Dog)  //如果pet对象是Dog类的实例
		{
		    Dog dog=(Dog)pet;   //就把pet对象强制转换成狗类型
		    dog.playflyDisc();
		}
		if(pet instanceof Penguin)  //如果pet对象是Dog类的实例
		{
			Penguin penguin=(Penguin)pet;   //就把pet对象强制转换成狗类型
			penguin.swimming();
		}
	}
}
