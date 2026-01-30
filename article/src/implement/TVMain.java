package implement;

public class TVMain {
	
	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTV);
		lgRemoteCon.runYoutube(lgTV);
		lgRemoteCon.turnOff(lgTV);
		System.out.println();
		
		SamsungSmartTV samsungTV = new SamsungTV();
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		
		samsungRemoteCon.turnOn(samsungTV);
		samsungRemoteCon.runCoupangPlay(samsungTV);
		samsungRemoteCon.changeVolume(samsungTV, 50);
		samsungRemoteCon.turnOff(samsungTV);
		//lgRemoteCon.runNetflix(samsungTV);
		System.out.println();
		
		DaisoRemoteController daisoRemoteCon = new DaisoRemoteController();
		daisoRemoteCon.turnOn(samsungTV);
		daisoRemoteCon.turnOn(lgTV);
		daisoRemoteCon.runNetflix(samsungTV);
		daisoRemoteCon.runNetflix(lgTV);
	}

}
