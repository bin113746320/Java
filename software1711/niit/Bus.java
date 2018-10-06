package software1711.niit;

public class Bus extends MotoVehicle{
	
	private int seatCount;
	
	public Bus(String no, String brand, String color, double mileage,int seatCount) {
		super(no, brand, color, mileage);
		
		this.seatCount=seatCount;
	}
	
	public void setSeatCount(int SeatCount){
		this.seatCount=SeatCount;
	}
	
	public int getSeatCount(){
		return this.seatCount;
	}
	
    public double caclRent(int days){
    	double price=0;
		if(seatCount<=16)
		{
			price=800*days;
		}
		if(seatCount>16)
		{
			price=1500*days;
		}
		return price;
	}
	

}
