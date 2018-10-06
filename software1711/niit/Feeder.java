package software1711.niit;

public class Feeder {
	
	public void feed(Animal animal,Food food)
	{
		if(animal instanceof Dog_1)
		{
			Dog_1 dog=(Dog_1)animal;
			Fish fish=(Fish)food;
			System.out.println("给狗喂食：");
			dog.eat(fish);
		}
		else 
		{
			Cat cat=(Cat)animal;
			Bone bone=(Bone)food;
			System.out.println("给猫喂食：");
			cat.eat(bone);
		}
	}

}
