package oop.relaygame;

import java.util.Scanner;

public class RelayGame {

	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame() {
		this.keyboard = new Scanner(System.in);
	}

	public void startGame() {
		System.out.print("시작 단어를 입력해 주세요: ");
		this.startWord = keyboard.nextLine();
		char startLetter;
		while(true) {
			System.out.print("다음 단어를 입력해 주세요: ");
			startLetter = this.startWord.charAt(startWord.length() - 1);
			this.nextWord = this.keyboard.nextLine();
			this.nextWord = this.nextWord.trim();
			
			
			if (this.nextWord.startsWith(String.valueOf(startLetter))) {
				if (this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
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
	
	public static void main() {
		RelayGame game = new RelayGame();
		game.startGame();
	}
}
