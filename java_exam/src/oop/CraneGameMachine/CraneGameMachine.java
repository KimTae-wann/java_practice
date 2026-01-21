package oop.CraneGameMachine;

import java.util.Random;

public class CraneGameMachine {
	private boolean isInsertCoin;
	private int dolls = 10;
	
	public void insertCoin() {
		if (dolls <= 0) {
			isInsertCoin = false;
			System.out.println("지금 인형이 없어요.\n다음에 다시 와주세요");
		}
		else if (isInsertCoin) {
			System.out.println("이미 코인이 있어요!! 게임 고고싱");
		}
		else {
			isInsertCoin = true;
			System.out.println("코인을 넣었어요!!");
		}
	}
	
	public int doGame() {
		if(isInsertCoin) {
			System.out.println("\n***[게임을 시작합니다!!]***\n");
			int craneResult = new Random().nextInt(2); 
			if (craneResult == 1) {
				if (dolls >= 1) {
					System.out.println("인형을 뽑았어요");
					dolls--;
				}
			}
			else {
				System.out.println("인형을 뽑지 못했어요");
			}
			isInsertCoin = false;
			System.out.println("인형뽑기를 종료합니다\n");
			return craneResult;
		}
		System.out.println("코인이 없어요. 코인을 넣어주세요");
		return 0; // 뽑지 못한 경우랑 게임을 못한 경우랑은 다른데
	}
}
