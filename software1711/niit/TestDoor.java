package software1711.niit;

public class TestDoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheftproofDoor tDoor=new TheftproofDoor();
		System.out.println("回家");
		tDoor.takePhoto();
		tDoor.lockUp();
		tDoor.open();
		System.out.println("离家");
		tDoor.lockClose();
		tDoor.close();

	}

}
