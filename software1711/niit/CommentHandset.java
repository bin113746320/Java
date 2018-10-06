package software1711.niit;

public class CommentHandset extends Handset implements PlayWiring {
	public CommentHandset(String brand, String type) {
		super(brand, type);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("普通机,播放音频");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("普通机，发信息");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("普通机，打电话");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(super.getBrand()+","+super.getType());
	}

}
