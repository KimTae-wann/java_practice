package exam.method;

public class MethodQuiz9 {
	
	public static void main(String[] args) {
		double avg = getAverage(150, 3);
		System.out.printf("%.2f", avg);
	}
	
	private static double getAverage(int score, int scoreNum) {
		 return (double)score / scoreNum;
	}
}
