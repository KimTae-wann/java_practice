package exam.method;

public class MethodQuiz8 {
	
	public static void main(String[] args) {
		int sum = getSumOfFive(1, 2, 3, 4, 5);
		System.out.println(sum);
	}
	
	private static int getSumOfFive (int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
}
