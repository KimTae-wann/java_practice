package exam.method;

public class MethodQuiz4 {
	
	public static void main(String[] args) {
		printAge(20);
	}
	
	private static void printAge(int age) {
		if (age >= 19) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년");
		}
	}
}
