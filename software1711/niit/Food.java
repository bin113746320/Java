package software1711.niit;

public abstract class Food {
	
	private String name;

	public Food(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setFood(String name) {
		this.name = name;
	}
	
}
