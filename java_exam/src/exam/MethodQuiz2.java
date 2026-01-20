package exam;

public class MethodQuiz2 {
	
	public static void main(String[] args) {
		printPrime(20);
	}
	
	private static void printPrime(int number) {
		for (int i = 5; i <= number; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
	

}
