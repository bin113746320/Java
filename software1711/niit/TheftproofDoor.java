package software1711.niit;

public class TheftproofDoor extends Door implements Lock,DoorBell{

@Override
public void open() {
	// TODO Auto-generated method stub
	System.out.println("用力推，门开了");
}

@Override
public void close() {
	// TODO Auto-generated method stub
	System.out.println("用力推，门开了");
}

@Override
public void lockUp() {
	// TODO Auto-generated method stub
	System.out.println("向左转三圈，锁开了");
}

@Override
public void lockClose() {
	// TODO Auto-generated method stub
	System.out.println("向右转三圈，锁上了");
}

@Override
public void takePhoto() {
	// TODO Auto-generated method stub
	System.out.println("叮叮咚,咔擦，照片已储存");
}
}
