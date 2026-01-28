package inheritance.zoo;

public class Zoo {
	
	public static void main(String[] args) {
		// polymorphism
		Animal duck = new Bird("오리", "꽥꽥", 15.0, 20.0, 50.0);
		Animal duck2 = new Bird("오리", "꽥꽥", 15.0, 20.0, 50.0);
		
		System.out.println("== 비교 : " + (duck == duck2));
		System.out.println("equals 비교 : " + duck.equals(duck2));
		
		Animal eager = new Bird("독수리", "읏차", 30.0, 20.0, 50.0);
		duck.howling();
		duck.move();
//		duck.fly();
//		duck.land()
		if (duck instanceof Bird bird) {
			((Bird) duck).fly();	// 과거 방법 -> 이때는 instanceof에서 인스턴스 미생성 한다.
			((Bird) duck).land();
			bird.fly();				// 현재 방법
			bird.land();
			
			bird.fly();
		}
		System.out.println(duck);
		
		Animal lion = new Animal("사자", "크아앙", 30.0, 30.0, 100.0);
		Animal tiger = new Animal("호랑이", "어흥", 50.0, 55.0, 200.0);
		
		duck.attack(tiger);
		
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		lion.attack(tiger);
		tiger.attack(lion);
		
		lion.attack(duck);
		lion.attack(eager);
	}
}
