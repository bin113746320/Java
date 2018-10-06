package software1711.niit;

import java.util.Scanner;

import javax.activation.MailcapCommandMap;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TestMotoVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("苏A8888","别克","红",30000,"别克林荫大道");
		Car car2=new Car("苏B8778","宝马","黑",40000,"宝马550i");
		Car car3=new Car("苏C8668","别克","白",50000,"别克商务舱GLB");
		Car car4=new Car("京B8888","宝马","黑",40000,"宝马550i");
		Bus bus1=new Bus("苏A8888","金杯","银灰",30000,16);
		Bus bus2=new Bus("苏B8778","金龙","浅蓝",40000,48);
		Truck truck1=new Truck("皖A3333", "解放", "红", 100000, 100000);
		Truck truck2=new Truck("京B9999", "大众", "红", 100000, 200000);
		
		Customer customer1=new Customer("阿军");
		Customer customer2=new Customer("*九");
		
		MotoVehicle[] motos=new MotoVehicle[4];
		motos[0]=car1;
		motos[1]=car2;
		motos[2]=car4;
		motos[3]=bus2;
		int days=5;
		System.out.println("租凭人："+customer1.getName()+"\n总租金："+customer1.caculateMoney(days,motos));
		
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎租凭");
		System.out.println("请输入租车数量：");
		int num=input.nextInt();
		MotoVehicle[] motos_1=new MotoVehicle[num];
		double totalRent=0;
		int count=0;
		
		do {
			int count1=count+1;
			System.out.println("第 "+count1+" 辆车");
			System.out.println("请选择车型：(轿车——1 汽车——2 卡车——3)");
			int tt=input.nextInt();
			if(tt==1){
				System.out.println("请输入租凭车的类型：别克林荫大道——1  宝马550i——2  别克商务舱GLB——3");
				
				int type=input.nextInt();
				
				switch(type){
				case 1:motos_1[count]=car1;
				break;
				case 2:motos_1[count]=car2;
				break;
				case 3:motos_1[count]=car3;
				break;	
			   }
			}
			else if(tt==2){
				System.out.println("请输入租凭车的型号(16座——1  48座——2)");
				int type=input.nextInt();
			    switch(type){
			    case 1:motos_1[count]=bus1;
			    break;
			    case 2:motos_1[count]=bus2;
			    break;
				}
			}
			else if(tt==3)
			{
				System.out.println("请输入租凭车的型号(10吨——1  20吨——2)");
				int Type=input.nextInt();
				
			    switch(Type){
			    case 1:motos_1[count]=truck1;
			    break;
			    case 2:motos_1[count]=truck2;
			    break;
			    }
			}
		    count++;
		} while (count<num);
		
		System.out.println("请输入租凭天数");
		int Days=input.nextInt();
		
		System.out.println("租凭人："+customer2.getName()+"\n总租金："+customer2.caculateMoney(Days,motos_1));
	}
}
