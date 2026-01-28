package inheritance.vehicle;

public sealed class SportsCar extends Vehicle permits BatMobile{

	public SportsCar(String modelName) {
		super(modelName);
	}

	public void turboMode() {
		if (super.getIsOn()) {
			System.out.println("터보모드 on");
		}
		else {
			System.out.println("시동을 먼저 걸어주세요");
		}
		
	}
}
