package software1711.niit;

public class TestVistor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vistor vistor=new Vistor("张三", 28);
		System.out.println(vistor.getname()+"的年龄为："+vistor.getage()+","+"门票价格为："+vistor.showprice());
	}
}
