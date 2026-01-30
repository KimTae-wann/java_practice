package implement;

public class LgTV implements LgSmartTV{

	@Override
	public void turnOn() {
		System.out.println("엘지 티비 온");
	}
	

	@Override
	public void turnOff() {
		System.out.println("엘지 티비 오프");
		
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("엘지 티비 채널 바꿈" + channelNumber);
		
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("엘지 티비 볼륨 바꿈" + volume);
		
	}

	@Override
	public void runNetflix() {
		System.out.println("엘지 티비 넷플");
		
	}

	@Override
	public void runInternet() {
		System.out.println("엘지 티비 인터넷");
		
	}

	@Override
	public void runYoutube() {
		System.out.println("엘지 티비 유튜브");
		
	}	
}
