package oop;

public class CarTest {
	
	public static void main(String[] args) {
		Car car = new Car(); // 기본 생성자 호출로 인스턴스 필드 초기화
		System.out.println(car); // 참조값 출력
		//boolean carEngineState = car.isEngineStart; // boolean false 초기화
		//int carSpeed = car.speed; // int 0 초기화
		boolean carEngineStart = car.getEngineStart();
		System.out.println("carEngineStart = " + carEngineStart);
		int carSpeed = car.getSpeed();
		System.out.println("carSpeed = " + carSpeed);

		car.pressGasolinPedal(60);
		car.pressEngineStartButton(); // 시동 On
		
		car.pressGasolinPedal(60);
		car.pressGasolinPedal(60);
		car.pressGasolinPedal(60);
		car.pressGasolinPedal(60);
		car.pressBrakePedal(70);
		car.pressBrakePedal(70);
		car.pressBrakePedal(70);
		car.pressBrakePedal(70);
		
		car.pressEngineStartButton(); // 시동 off
		car.pressBrakePedal(70);
	}
}
