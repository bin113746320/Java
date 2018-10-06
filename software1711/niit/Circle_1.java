package software1711.niit;

public class Circle_1 {
	private double radius;
	
	public Circle_1(){
		this.radius=0;
	}
	
	public Circle_1(double radius) {
		this.radius = radius;
	}   
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	
    public double getPerimeter(){
    	return 2*Math.PI*this.radius;
	}
    
    void show(){
    	System.out.println("圆的半径："+this.radius+"\t圆的周长："+getPerimeter()+"\t圆的面积"+getArea());
    }
	

}
