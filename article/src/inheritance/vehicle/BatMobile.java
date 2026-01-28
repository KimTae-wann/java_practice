package inheritance.vehicle;

public non-sealed class BatMobile extends SportsCar{

	public BatMobile(String modelName) {
		super(modelName);
	}
	
	public void batportSeperate() {
		System.out.println("배트포트 분리");
	}
}
