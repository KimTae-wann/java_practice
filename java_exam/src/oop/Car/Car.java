package oop.Car;

public class Car {
	
	private boolean isEngineStart;
	private int speed;
	
	/**
	 * 
	 */
	public void pressEngineStartButton() {
		if (isEngineStart) {
			System.out.println("시동을 끕니다");
			isEngineStart = false;
			speed = 0;
		}
		else {
			System.out.println("시동을 켭니다");
			isEngineStart = true;
			speed = 10;
		}
	}
	
	public void pressGasolinPedal(int press) {
		if (!isEngineStart) {
			System.out.println("먼저 시동을 켜주세요.");
			return;
		}
		
		speed += press;
		if (speed > 240) {
			speed = 240;
			System.out.println("속도 초과! 240으로 조정합니다.");
		}
		System.out.println("속도: " + speed);
	}
	
	public void pressBrakePedal(int press) {
		if (!isEngineStart) {
			System.out.println("먼저 시동을 켜주세요.");
			return;
		}
		
		speed -= press;
		if (speed < 0) {
			speed = 0;
			System.out.println("속도가 0보다 낮을 수 없습니다! 0으로 조정합니다.");
		}
		System.out.println("속도: " + speed);
			
	}
	
	public boolean getEngineStart() {
		return isEngineStart;
	}
	
	public int getSpeed() {
		return speed;
	}
}
