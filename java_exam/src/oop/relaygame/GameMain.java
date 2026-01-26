package oop.relaygame;

import java.util.Scanner;

public class GameMain {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String startWord;
		String endWord;
		char startLetter;
		char endLetter;
		
		
		System.out.print("시작 단어를 입력해 주세요: ");
		startWord = sc.nextLine();
		while(true) {
			System.out.print("다음 단어를 입력해 주세요: ");
			endWord = sc.nextLine();
			endWord = endWord.trim();
			
			startLetter = endWord.charAt(0);
			endLetter = startWord.charAt(startWord.length() - 1);
			
			//if (String.valueOf(startLetter).equals(String.valueOf(endLetter))) {
			if (endWord.startsWith(String.valueOf(startLetter))) {
				if (endWord.length() >= 3) {
					startWord = endWord;
				}
				else {
					System.out.println("게임 종료");
					break;
				}
			}
			else {
				System.out.println("게임 종료");
				break;
			}
		}
	}
}
