package inheritance.zoo;

public class Bird extends Animal{

	private double walkingSpeed;
	private boolean isFly;
	
	public Bird(String name, String voice, double speed, double damage, double hitPoint) {
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}
		
	public boolean getIsFly() {
		return isFly;
	}

	public void fly() {
		this.isFly = true;
		super.setSpeed(70);
	}
	
	public void land() {
		this.isFly = false;
		super.setSpeed(this.walkingSpeed);
	}

	@Override
	public String toString() {
		String str = "Bird [name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}
}
