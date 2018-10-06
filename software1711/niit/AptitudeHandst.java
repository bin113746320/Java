package software1711.niit;

public class AptitudeHandst extends Handset implements TheakePicture,Network,PlayWiring{
	public AptitudeHandst(String brand, String type) {
		super(brand, type);
	}

	@Override
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println("智能机，联网");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("智能机，拍照");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("智能机，发信息");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("智能机，打电话");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(super.getBrand()+","+super.getType());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("智能机，播放视频");
	}

}
