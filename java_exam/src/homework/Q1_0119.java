package homework;

import java.util.Scanner;

public class Q1_0119 {
	
	static boolean[] notPrimeNumber = new boolean[100001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		printPrimeNumber(num);
	}

	
	private static void printPrimeNumber(int num) {
		for (int i = 2; i * i <= num; i++) {
			if(!notPrimeNumber[i]) {
				for (int j = i * i; j <= num; j += i) {
					notPrimeNumber[j] = true;
				}
			}
		}
		
		for (int i = 2; i <= num; i++) {
			if (!notPrimeNumber[i]) {
				System.out.println(i);
			}
		}
	}
}
