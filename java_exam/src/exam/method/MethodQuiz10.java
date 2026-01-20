package exam.method;

public class MethodQuiz10 {

	public static void main(String[] args) {
		String grade;
		grade = getGrade(95);
		System.out.println(grade);
		grade = getGrade(85);
		System.out.println(grade);
		grade = getGrade(75);
		System.out.println(grade);
		grade = getGrade(65);
		System.out.println(grade);
		grade = getGrade(55);
		System.out.println(grade);
	}
	
	private static String getGrade(int score) {
		if (score >= 90) {
			return "A";
		}
		else if (score >= 80) {
			return "B";
		}
		else if (score >= 70) {
			return "C";
		}
		else if (score >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	}
}
