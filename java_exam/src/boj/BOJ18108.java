package boj;

import java.util.Scanner;

public class BOJ18108 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int yearGap = 2541 - 1998;
		
		System.out.println(year - yearGap);
	}
}
