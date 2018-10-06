package software1711.niit;

import java.util.function.Predicate;

public class Car extends MotoVehicle {
	
	private String cartype;
	
	public Car(String no, String brand, String color, double mileage,String cartype) {
		super(no, brand, color, mileage);
		
		this.cartype=cartype;
	}
	
	public void setCartype(String cartype){
		this.cartype=cartype;
	}
	
	public String getCartype(){
		return this.cartype;
	}

	public double caclRent(int days){
		int price=0;
		
		if("别克林荫大道".equals(cartype))
		{
			price=300*days;
		}
		if("宝马550i".equals(cartype))
		{
			price=500*days;
		}
		if("别克商务GLB".equals(cartype))
		{
			price=600*days;
		}
		
		return price;
	}

}
