package software1711.niit;

public class Student {
	private String sNO;
	private String sName;
	private String sSex;
	private int sAge;
	private float sJava;
	
	public Student(String sNo) {
		this.sNO = sNO;
	}

	
	public Student(String sNO, String sName) {
		this.sNO = sNO;
		this.sName = sName;
	}
	
	public Student(String sNO, String sName, String sSex) {
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
	}
	
	public Student(String sNO, String sName, String sSex, int sAge) {
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
	}
	
	public Student(String sNO, String sName, String sSex, int sAge, float sJava) {
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	
	public String getsNO() {
		return sNO;
	}

	public void setsNO(String sNO) {
		this.sNO = sNO;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsSex() {
		return sSex;
	}

	public void setsSex(String sSex) {
		this.sSex = sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public float getsJava() {
		return sJava;
	}

	public void setsJava(float sJava) {
		this.sJava = sJava;
	}
	
	public void print(){
		System.out.println("学号："+this.sNO+" 姓名："+this.sName+" 性别："
	             +this.sSex+" 年龄："+this.sAge+" Java成绩："+this.sJava);
	}
}
