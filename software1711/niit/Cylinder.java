package software1711.niit;

import java.nio.channels.ShutdownChannelGroupException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Cylinder extends Circle{
	private double hight;
	public Cylinder(double right,double hight) {
		super(right);
		this.hight = hight;
	}
	public double getVolume(){
		return Math.PI*super.getRadius()*super.getRadius()*this.hight;
	}
	void showVolume(){
		System.out.println("圆的体积"+this.getVolume());
	}
	
}
