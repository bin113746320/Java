package software1711.niit;

public class TestPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1=new Dog("贝贝", 10, 10, "藏獒");
		Dog dog2=new Dog("欢欢", 20, 20, "吉娃娃");
		Penguin pp=new Penguin("QQ", 30, 30, "Q仔");
		Penguin pp1=new Penguin("WW", 40, 40, "Q妹");
		
		dog1.print();//子类直接使用父类的方法
		dog2.print();
		pp.print();
		pp1.print();
	}

}
