package software1711.niit;

import javax.management.monitor.MonitorSettingException;

public class Customer {
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double caculateMoney(int days,MotoVehicle[] motos){
		double total=0;
		for(int i=0;i<motos.length;i++)
		{
			if(motos[i] instanceof Car)
			{
				Car car=(Car)motos[i];
				total+=car.caclRent(days);
			} 
			if(motos[i] instanceof Bus)
			{
				Bus bus=(Bus)motos[i];
				total+=bus.caclRent(days);
			} 
			if(motos[i] instanceof Truck)
			{
				total+=motos[i].caclRent(days);
			}
			System.out.println("车的相关信息："+"车牌号："+motos[i].getNo()+" 颜色："
			                 +motos[i].getColor()+" 里程："+motos[i].getMileage());	
		}
		return total;
	}
}
