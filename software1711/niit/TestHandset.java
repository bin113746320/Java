package software1711.niit;

public class TestHandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AptitudeHandst handset1=new AptitudeHandst("vivo","X21");
		handset1.info();
		handset1.networkConn();
		handset1.takePicture();
		handset1.call();
		handset1.sendInfo();
		handset1.play();
		CommentHandset handset2=new CommentHandset("nigya","");
		handset2.info();
		handset2.play();
		handset2.call();
	}
}
