package homework;

import java.util.Scanner;

public class Q1_0119 {
	
	public static void main(String[] args) {
		for (int i = 2; i <= 100_000; i++) { // 0과 1은 소수가 아니므로, 2부터 100,000까지 소수 판별
			boolean isPrime = true; // 소수인지 판별하는 check 변수
			for (int j = 2; j < i; j++) { // 2부터 본인의 직전 수까지
				if (i % j == 0) { // 나눠본다
					isPrime = false; // 나누어 떨어지면 소수 아님
				}
			}
			if (isPrime == true) { // 소수면
				System.out.println(i + " "); // 출력
			}
		}
	}
	
	/*
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
	*/
}
