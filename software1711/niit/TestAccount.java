package software1711.niit;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account("12345","*三","321",8880);

		System.out.println("account1的当前余额："+account1.searchbalance());
		account1.save(1120);
		System.out.println("account1的当前余额："+account1.searchbalance());
		account1.withdraw(6900);
		System.out.println("account1的当前余额："+account1.searchbalance());
     
		Account account2=new Account();
		account2.setName("*四");
		account2.setCard("4321");
		account2.setPassword("123");
		account2.setBalance(1111);
		
		System.out.println("当前账户："+account2.getName());
		System.out.println("当前账户账号："+account2.getCard());
		System.out.println("当前账户密码："+account2.getPassword());
		System.out.println("当前账户余额："+account2.getBalance());

	}
}
