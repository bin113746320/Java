package spring.software1711.niit.cn;

public class Student {
	private String name;
	private String number;
	private String password;
	private int scoreJava;
	public Student(String name, String number, String password,int scoreJava) {
		this.name = name;
		this.number = number;
		this.password = password;
		this.scoreJava=scoreJava;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(int scoreJava) {
		this.password = password;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	

}
