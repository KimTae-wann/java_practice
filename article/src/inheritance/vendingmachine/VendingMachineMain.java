package inheritance.vendingmachine;

import inheritance.beverage.*;

public class VendingMachineMain {
	
	public static void main(String[] args) {
		Beverage bakas = new Bakas("박카스", 900, 15);
		Beverage monster = new Monster("몬스터", 1500, 20);
		Beverage hotsix = new HotSix("핫식스", 1300, 10);
		Beverage milkis = new Milkis("밀키스", 1400, 5);
		
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.addBeverageMenu(bakas);
		vendingMachine.addBeverageMenu(monster);
		vendingMachine.addBeverageMenu(hotsix);
		vendingMachine.addBeverageMenu(milkis);
		
		vendingMachine.orderBeverage("박카스", 15);
		vendingMachine.orderBeverage("박카스", 10);
		
		vendingMachine.addBeverageStock("박카스", 10);
		vendingMachine.orderBeverage("박카스", 10);
		vendingMachine.addBeverageStock("아이스티", 10);
		
		vendingMachine.printAllBeverage();
	}
}
