package software1711.niit;

public class Manager extends Employee {
	private double bonus;
    private int holidays;
	
	public Manager(int age, String name,double salary, int hireDay,double bonus, int holidays) {
		super(age,name,salary,hireDay);
		this.bonus = bonus;
		this.holidays = holidays;
	}
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public int getHolidays() {
		return holidays;
	}

	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}
	
	public void addSalary(){
	   setSalary(super.getSalary()+prize);
	}

	public double getSalary(){
		return super.getSalary();
	}
	
	public void getInfo() {
		System.out.println("姓名:"+this.getName()+"\n职务：经理"+"\n年龄："+super.getAge()+
	                "\n月薪："+this.getSalary()+"\n奖金："+getBonus()
	                +"\n入职日期："+this.getHireDay()+"\n假期："+this.getHolidays()+"\n");
	}
}
