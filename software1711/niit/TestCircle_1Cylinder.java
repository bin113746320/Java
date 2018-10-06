package software1711.niit;

public class TestCircle_1Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_1 circle1=new Circle_1(3);
		circle1.show();
		Cylinder cylinder=new Cylinder(circle1.getRadius(), 4);
		cylinder.showVolume();
	}

}
