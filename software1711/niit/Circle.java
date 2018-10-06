package software1711.niit;


public class Circle {
	
	private double radius;
	
	public Circle() { 
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}
	
	public double around()
	{
		return Math.PI*this.radius*2;
	}

}
