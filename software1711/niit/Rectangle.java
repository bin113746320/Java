package software1711.niit;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}
	public void area()
	{
		System.out.println("矩形长为："+this.length+"，矩形宽为："+this.width);
		System.out.println("矩形面积为："+this.length*this.width);
	}
}
