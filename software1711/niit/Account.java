package software1711.niit;

public class Account {
	private String card;
	private String name;
	private String password;
	private float balance; 
	//构造方法
	public Account()
	{		
		System.out.println("无参");
	}
	public Account(String card, String name, String password, float balance) {
		this.card = card;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	//属性方法
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void save(int money){
		this.balance=this.balance+money;
	} 
	
	public void withdraw(int money){
		if(this.balance<=0)
		{
			System.out.println("余额不足！！！");
		}else {
			this.balance=this.balance-money;
		}
	} 
    public float searchbalance(){
		return this.balance;
	}
}
