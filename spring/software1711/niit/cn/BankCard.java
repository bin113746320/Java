package spring.software1711.niit.cn;

public class BankCard {
	private String id;
	private String passward;
	private int balance;
	
	public BankCard(String id, String passward, int balance) {
		super();
		this.id = id;
		this.passward = passward;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
