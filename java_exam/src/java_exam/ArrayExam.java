package java_exam;

import java.util.Scanner;

public class ArrayExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 반의 인원을 입력하세요: ");
		int peopleNum = sc.nextInt();
		
		int[] scoreArray = new int[peopleNum];
		for (int i = 0; i < peopleNum; i++) {
			System.out.print((i + 1) + "번째 성적을 입력하세요: ");
			scoreArray[i] = sc.nextInt();
		}
		System.out.println("한 반의 성적 총합: " + getSumAllScores(scoreArray));
		System.out.println("한 반의 평균 성적: " + getAverage(scoreArray));
		System.out.println("한 반의 학점: " + getCourseCredit(scoreArray));
		System.out.println("한 반의 등급: " + getABCDE(scoreArray));
		return ;
	}
	
	private static int getSumAllScores(int[] scoreArray) {
		int sum = 0;
		for (int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
		}
		return sum;
	}
	
	private static double getAverage(int[] scoreArray) {
		int sum = getSumAllScores(scoreArray);
		//return sum / 4d;
		return (double) sum / scoreArray.length;
	}
	
	private static double getCourseCredit(int[] scoreArray) {
		double average = getAverage(scoreArray);
		return average > 55 ? (average - 55) / 10 : 0;
	}
	
	private static String getABCDE(int[] scoreArray) {
		double grade = getCourseCredit(scoreArray);
		if (grade >= 4.1 && grade <= 4.5) {
			return "A+";
		}
		else if (grade >= 3.6 && grade <= 4.0) {
			return "A";
		}
		else if (grade >= 3.1 && grade <= 3.5) {
			return "B+";
		}
		else if (grade >= 2.6 && grade <= 3.0) {
			return "B";
		}
		else if (grade >= 1.6 && grade <= 2.5) {
			return "C";
		}
		else if (grade >= 0.6 && grade <= 1.5) {
			return "D";
		} else {
			return "F";
		}
	}
}
