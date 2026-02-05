package fp.basic.calc;

public class Main {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		//int result = calculator.calc(1, 2, ((num1, num2) -> num1 + num2));
		int result = calculator.calc(1, 2, ((num1, num2) -> {
			return num1 + num2;
		}));
		System.out.println(result);
		
		System.out.println("--------------------------------------------------");
		// num1 ^ num2
		result = calculator.calc(3, 2, ((num1, num2) -> (int) Math.pow(num1, num2)));
		// JDK 25부터 
		//result = calculator.calc(3, 2, Math::powExact);
		System.out.println(result);
		
		System.out.println("--------------------------------------------------");
		// num1, num2 max
		result = calculator.calc(1, 2, ((num1, num2) -> Math.max(num1, num2)));
		System.out.println(result);
		
		System.out.println("--------------------------------------------------");
		// num1, num2 min
		result = calculator.calc(1, 2, ((num1, num2) -> Math.min(num1, num2)));
		System.out.println(result);
		
		System.out.println("--------------------------------------------------");
		// num1이 num2의 제곱수라면 0을 반환 아니면 1을 반환
		result = calculator.calc(64, 8, ((num1, num2) -> {
			int tempNum = (int)Math.sqrt(num1);
			while(true) {
				if (tempNum < num2) {
					break;
				}
				if (tempNum == num2) {
					System.out.println("제곱수임");
					return 1;
				}
				tempNum = (int)Math.sqrt(tempNum);
			}
			System.out.println("제곱수 아님");
			return 1;
		}));
	}
}
