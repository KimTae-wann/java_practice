package oop.CraneGameMachine;

public class CraneGameMachineMain {
	
	public static void main(String[] args) {
		CraneGameMachine craneGameMachine = new CraneGameMachine();
		craneGameMachine.insertCoin();
		craneGameMachine.doGame();
		craneGameMachine.insertCoin();
		craneGameMachine.doGame();
		craneGameMachine.insertCoin();
		craneGameMachine.insertCoin();
	}
}
