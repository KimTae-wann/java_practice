package inheritance.vehicle;

public class Vehicle {
	
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
}
