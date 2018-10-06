package software1711.niit;

public class Cat implements Animal{

	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		System.out.println(food.getName());
	}

}
