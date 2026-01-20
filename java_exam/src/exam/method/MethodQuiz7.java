package exam.method;

public class MethodQuiz7 {

	public static void main(String[] args) {
		String result;
		result = getEvenOdd(4, 5);
		System.out.println(result);
		result = getEvenOdd(3, 5);
		System.out.println(result);
	}
	
	private static String getEvenOdd(int a, int b) {
		if (a * b % 2 == 0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
	}
}
