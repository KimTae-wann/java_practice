package java_exam;

import java.util.Scanner;

public class UpDownGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double randomNumber = Math.random();
		int answer = (int) (randomNumber * 100);
		int value;
		
		while (true) {
			System.out.print("숫자를 입력하세요. (0 ~ 99) ");
			value = sc.nextInt();
			if (answer == value) {
				System.out.println("정답입니다!");
				break;
			}
			else if (answer > value) {
				System.out.println("Up!");
			}
			else {
				System.out.println("Down!");
			}
		}
	}
}
