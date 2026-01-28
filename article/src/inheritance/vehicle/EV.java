package inheritance.vehicle;

public non-sealed class EV extends Vehicle{

	private int battery;
	
	public EV(String modelName, int battery) {
		super(modelName);
		this.battery = battery;
	}

	public void checkBattery() {
		System.out.println("현재 배터리는 " + this.battery + "입니다.");
	}

}
