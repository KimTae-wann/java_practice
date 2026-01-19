package exam.FlowControlQuiz;

public class FlowControlQuiz1 {
	
	public static void main(String[] args) {
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		
		int sum = korScore + engScore + mathScore + progScore;
		double average = sum / 4d;
		
		if (average >= 95) {
			System.out.println("A+");
		}
		else if (average >= 90) {
			System.out.println("A");
		}
		else if (average >= 85) {
			System.out.println("B+");
		}
		else if (average >= 80) {
			System.out.println("B");
		}
		else if (average >= 70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}

}
