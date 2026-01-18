package java_exam;

public class IfExam {
	
	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 100);
		System.out.println(randomNumber);
		
		int radix = randomNumber / 10 * 10;
		
		if (radix >= 10 && radix < 20) {
			System.out.println(radix + "대의 숫자입니다.");
		}
		else if (radix >= 20 && radix < 30) {
			System.out.println(radix + "대의 숫자입니다.");
		}
		else if (radix >= 30 && radix < 40) {
			System.out.println(radix + "대의 숫자입니다.");
		}
		else {
			System.out.println("40대 이상의 숫자입니다.");
		}
		
		if (randomNumber >= 90) {
			System.out.println("90 범위의 숫자입니다.");
		}
		else if (randomNumber >= 80) {
			System.out.println("80 범위의 숫자입니다.");
		} else {
			System.out.println("80 보다 적은 숫자입니다.");
		}
	}
}
