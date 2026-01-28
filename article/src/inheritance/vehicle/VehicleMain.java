package inheritance.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		System.out.println("배트 모빌\n");
		BatMobile batMobile1 = new BatMobile("배트모빌1");
		batMobile1.turnOn();
		batMobile1.turboMode();
		batMobile1.batportSeperate();
		
		Vehicle batMobile2 = new BatMobile("배트모빌2");
		batMobile2.turnOn();
		if (batMobile2 instanceof SportsCar sportsCar) {
			sportsCar.turboMode();
		}
		if (batMobile2 instanceof BatMobile batMobile) {
			batMobile.batportSeperate();
		}
		
		
		System.out.println("\n 전기차\n");
		EV eV1 = new EV("전기차1", 100);
		eV1.turnOn();
		eV1.checkBattery();

		Vehicle eV2 = new EV("전기차2", 50);
		eV2.turnOn();
		if (eV2 instanceof EV eV) {
			eV.checkBattery();	
		}
	}
}
