package exam;

public class ArithmeticQuiz4 {

	public static void main(String[] args) {
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;
		
//		int totalScore = subjectA + subjectB + subjectC + subjectD;
//		double average = (double)totalScore / 4;
//		double score = (double)(Math.round((average - 55) * 10)) /10;
		
		int[] subjects = {subjectA, subjectB, subjectC, subjectD};
		int totalScore = 0;
		for (int i = 0; i < subjects.length; i++) {
			totalScore += subjects[i];
		}
		double average = (double)totalScore / subjects.length;
		double score = (double)(Math.round((average - 55) * 10)) / 100;
		
		System.out.println("점수 총합: " + totalScore);
		System.out.println("점수 평균: " + average);
		System.out.println("학점 결과: " + score);
	}
}
