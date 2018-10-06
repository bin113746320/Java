package software1711.niit;

public class Truck extends MotoVehicle {
	int weight;

	public Truck(String no, String brand, String color, double mileage,
			int weight) {
		super(no, brand, color, mileage);
		this.weight = weight;
	}
	
	 public double caclRent(int days){
	    	double price=0;
			if(weight<=100000)
			{
				price = 2000*days;
			}
			if(weight>100000)
			{
				price = 3000*days;
			}
			return price;
		}

}
