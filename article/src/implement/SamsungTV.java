package implement;

public class SamsungTV implements SamsungSmartTV{

	@Override
	public void turnOn() {
		System.out.println("삼성 티비 온");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성 티비 오프");
		
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("삼성 티비 채널 바꿈" + channelNumber);
		
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("삼성 티비 볼륨 바꿈" + volume);
		
	}

	@Override
	public void runNetflix() {
		System.out.println("삼성 티비 넷플");
	}

	@Override
	public void runMenu() {
		
		System.out.println("삼성 티비 메뉴");
	}

	@Override
	public void runCoupangPlay() {
		
		System.out.println("삼성 티비 쿠팡");
	}
	
}
