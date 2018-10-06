package software1711.niit;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ClassVar {
	private int i=0;
	public static int j=0;
	public void print(){
		System.out.println("i="+i);
		System.out.println("j="+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassVar lv1=new ClassVar();
		lv1.i++;
		lv1.j++;
		lv1.print();
		ClassVar lv2=new ClassVar();
		lv2.i++;
		lv2.j++;
		lv2.print();
		ClassVar lv3=new ClassVar();
		lv3.print();
	}
}
