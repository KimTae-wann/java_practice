package exam.method;

public class MethodQuiz3 {
	
	public static void main(String[] args) {
		printMax(10,20);
	}

	private static void printMax(int a, int b) {
		if (a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
}
