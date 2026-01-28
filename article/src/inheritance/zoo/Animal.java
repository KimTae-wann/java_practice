package inheritance.zoo;

public class Animal {
	
	private String name;
	private String voice;
	private double speed;
	private double damage;
	private double hitPoint;
	
	public Animal(String name, String voice, double speed, double damage, double hitPoint) {
		this.name = name;
		this.voice = voice;
		this.speed = speed;
		this.damage = damage;
		this.hitPoint = hitPoint;
	}

	public String getName() {
		return name;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void howling() {
		System.out.println(this.name + " : " + this.voice);
	}
	
	public void move() {
		System.out.println(this.name + " : " + this.speed + "km/h 의 속도로 움직임");
	}
	
	
	public void attack(Animal other) {
		if (this.isDead()) {
			System.out.println(this.name + "이 이미 죽어서 행동 할 수 없습니다.");
			return ;
		}
		if (!(this instanceof Bird ) && other instanceof Bird bird) {
			if (bird.getIsFly()) {
				System.out.println(other.getName() + "이 날고 있어서 공격불가");
				return ;
			}
		}
		System.out.println(this.name + "이 " + other.getName() + "에게 공격하려합니다.");
		if (!other.isDead()) {
			other.attacked(this.damage);
		}
		else {
			System.out.println(other.getName() + "이 이미 죽었습니다.");
		}
	}
	
	public void attacked(double damage) {
		if (hitPoint > damage) {
			this.hitPoint -= damage;
		}
		else {
			this.hitPoint = 0;
		}
	}
	
	public boolean isDead() {
		return this.hitPoint <= 0; 
	}
}
