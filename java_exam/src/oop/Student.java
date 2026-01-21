package oop;

public class Student {
	private int javaScore;
	private int pythonScore;
	private int cppScore;
	private int csharpScore;
	private int[] scores;
	
	
	public Student(int javaScore, int pythonScore, int cppScore, int csharpScore) {
		this.javaScore = javaScore;
		this.pythonScore = pythonScore;
		this.cppScore = cppScore;
		this.csharpScore = csharpScore;
		scores = new int[]{javaScore, pythonScore, cppScore, csharpScore};
	}
	
	private int getSumAllScores() {
		int sumScore = 0;
		for (int score : scores) {
			sumScore += score;
		}
		return sumScore;
	}
	private double getAverage() {
		int sumScore = getSumAllScores();
		return (double)sumScore / scores.length;
	}
	private double getCourseCredit() {
		double credit = getAverage();
		return (credit - 55) / 10;
	}
	
	public String getABCDEF() {
		double grade = getCourseCredit();
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
