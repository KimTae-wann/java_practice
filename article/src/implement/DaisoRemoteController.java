package implement;

public class DaisoRemoteController implements LgRemoteController, SamsungRemoteController{

	@Override
	public void turnOn(TV tv) {
		tv.turnOn();
	}

	@Override
	public void turnOff(TV tv) {
		tv.turnOff();
	}

	@Override
	public void changeChannel(TV tv, int channelNumber) {
		tv.changeChannel(channelNumber);
	}

	@Override
	public void changeVolume(TV tv, int volume) {
		tv.changeVolume(volume);
	}

	@Override
	public void runNetflix(SamsungSmartTV tv) {
		tv.runNetflix();
	}

	@Override
	public void runMenu(SamsungSmartTV tv) {
		tv.runMenu();
	}

	@Override
	public void runCoupangPlay(SamsungSmartTV tv) {
		tv.runCoupangPlay();
	}

	@Override
	public void runNetflix(LgSmartTV tv) {
		tv.runNetflix();
	}

	@Override
	public void runInternet(LgSmartTV tv) {
		tv.runInternet();
	}

	@Override
	public void runYoutube(LgSmartTV tv) {
		tv.runYoutube();
	}
	
	

}
