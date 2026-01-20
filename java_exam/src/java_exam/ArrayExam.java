package java_exam;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class ArrayExam {
	
	public static void main(String[] args) {
		/*
		int[] scoreArray = new int[7];
		scoreArray[0] = 70;
		scoreArray[1] = 80;
		scoreArray[2] = 90;
		scoreArray[3] = 60;
		scoreArray[4] = 50;
		scoreArray[5] = 80;
		scoreArray[6] = 70;
		*/
		//scoreArray[7] = 1231231231; // runtime Error
		/*
		System.out.println(scoreArray[0]);
		System.out.println(scoreArray[1]);
		System.out.println(scoreArray[2]);
		System.out.println(scoreArray[3]);
		System.out.println(scoreArray[4]);
		System.out.println(scoreArray[5]);
		System.out.println(scoreArray[6]);
		*/
		/*
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
		}
		*/
		
		/*
		// solve1
		int[] lottery = new int[6];
		for (int i = 0; i < lottery.length; i++) {
			lottery[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; ) {
				if (lottery[j] == lottery[i]) {
					lottery[i] = (int) (Math.random() * 45 + 1);
					j = 0;
				}
				j++;
			}	
		}
		*/
		/*
		// solve2
		int[] lottery = new int[6];
		for (int i = 0; i < lottery.length; i++) {
			boolean isDuplicate = true; // 중복여부
			while(isDuplicate) { // 중복일때까지 반복
				lottery[i] = (int) (Math.random() * 45 + 1);
				isDuplicate = false; // 중복x
				for (int j = 0; j < i; j++) {
					if (lottery[j] == lottery[i]) {
						isDuplicate = true; // 중복
						break;
					}
				}
			}
		}
		*/
		/*
		// solve3
		int[] lottery = new int[6];
		int cnt = 0;
		Random random = new Random();
		while (cnt < 6) {
			int num = random.nextInt(45) + 1;
			boolean isDuplicate = false;
			
			int j = 0;
			while (j < cnt) {
				if (lottery[j] == num) {
					isDuplicate = true;
					break;
				}
				j++;
			}
			
			if (!isDuplicate) {
				lottery[cnt] = num;
				cnt++;
			}
		}
		*/
		/*
		// solve4
		Set<Integer> lottery = new HashSet<>();
		Random random = new Random();
		
		while (lottery.size() < 6) {
			lottery.add(random.nextInt(45) + 1);
		}
		
		System.out.println("로또 번호: " + lottery);
		*/
		/*
		// solve5
		int[] lottery = new int[6];
		int cnt = 0;
		int randomNumber;
		boolean isDuplicate = false;
		while(cnt < lottery.length) {
			randomNumber = (int) (Math.random() * 45 + 1);
			isDuplicate = false;
			
			for (int i = 0; i < cnt; i++) {
				if (lottery[i] == randomNumber) {
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) {
				lottery[cnt] = randomNumber;
				cnt++;
			}
		}
		*/
		// solve6
		int[] lottery = new int[6];
		for (int i = 0; i < lottery.length; i++) {
			lottery[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lottery[i] == lottery[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < lottery.length; i++) {
			System.out.println(lottery[i]);
		}
		
	}
}
