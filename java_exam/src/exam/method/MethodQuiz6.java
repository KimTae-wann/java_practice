package exam.method;

import java.util.Random;

public class MethodQuiz6 {
	
	public static void main(String[] args) {
		int[] randomNumbers = getUniqueNumber();
		
		System.out.print("[");
		for (int i = 0; i < randomNumbers.length - 1; i++) {
			System.out.print(randomNumbers[i] + ", ");
		}
		System.out.println(randomNumbers[randomNumbers.length - 1] + "]");
	}
	
	private static int[] getUniqueNumber() {
		Random random = new Random();
		int[] randomNumbers = new int[7];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (randomNumbers[i] == randomNumbers[j]) {
					i--;
					break;
				}
			}
		}
		return randomNumbers;
		
	}
}
