package oop.vendingmachine;

public class MyVendingMachineMain {
	
	public static void main(String[] args) {
		MyBeverage bakas = new MyBeverage("박카스", 900, 15);
		MyBeverage monster = new MyBeverage("몬스터", 1500, 20);
		MyBeverage hotsix = new MyBeverage("핫식스", 1300, 10);
		MyBeverage milkis = new MyBeverage("밀키스", 1400, 5);
		
		MyVendingMachine myVendingMachine = new MyVendingMachine();
		myVendingMachine.addBeverageMenu(bakas);
		myVendingMachine.addBeverageMenu(monster);
		myVendingMachine.addBeverageMenu(hotsix);
		myVendingMachine.addBeverageMenu(milkis);
		
		myVendingMachine.orderBeverage("박카스", 15);
		myVendingMachine.orderBeverage("박카스", 10);
		
		myVendingMachine.addBeverageStock("박카스", 10);
		myVendingMachine.orderBeverage("박카스", 10);
		myVendingMachine.addBeverageStock("아이스티", 10);
		
		myVendingMachine.printAllBeverage();
	}
}
