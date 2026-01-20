package exam.method;

public class MethodQuiz1 {
	
	public static void main(String[] args) {
		printSum(10);
	}
	
	private static void printSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
