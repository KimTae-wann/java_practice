package implement;

/**
 * TV
 * SamsungSmartTV	LgSmartTv
 * SamsungTV		LgTV	
 */

public interface TV {

	void turnOn();
	void turnOff();
	
	void changeChannel(int channelNumber);
	void changeVolume(int volume);
}
