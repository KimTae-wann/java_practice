package inheritance.vehicle;

public sealed class Vehicle permits SportsCar, EV{
	
	private String modelName;
	private boolean isOn;
	
	public Vehicle(String modelName) {
		this.modelName = modelName;
		this.isOn = false;
	}

	public boolean getIsOn() {
		return isOn;
	}
	
	public void turnOn() {
		isOn = true;
		System.out.println("시동 ON");
	}
	
	public void turnOff() {
		isOn = false;
		System.out.println("시동 OFF");
	}
}
