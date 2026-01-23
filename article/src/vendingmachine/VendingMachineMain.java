//package oop.vendingmachine;
//
//public class MyVendingMachineMain {
//	
//	public static void main(String[] args) {
//		MyBeverage bakas = new MyBeverage("박카스", 900, 15);
//		MyBeverage monster = new MyBeverage("몬스터", 1500, 20);
//		MyBeverage hotsix = new MyBeverage("핫식스", 1300, 10);
//		MyBeverage milkis = new MyBeverage("밀키스", 1400, 5);
//		
//		MyVendingMachine myVendingMachine = new MyVendingMachine();
//		myVendingMachine.addBeverageMenu(bakas);
//		myVendingMachine.addBeverageMenu(monster);
//		myVendingMachine.addBeverageMenu(hotsix);
//		myVendingMachine.addBeverageMenu(milkis);
//		
//		myVendingMachine.orderBeverage("박카스", 15);
//		myVendingMachine.orderBeverage("박카스", 10);
//		
//		myVendingMachine.addBeverageStock("박카스", 10);
//		myVendingMachine.orderBeverage("박카스", 10);
//		
//		myVendingMachine.printAllBeverage();
//	}
//}

package vendingmachine;

import vendingmachine.beverage.Beverage;
import vendingmachine.machine.VendingMachine;

public class VendingMachineMain {
	
	public static void main(String[] args) {
		Beverage bakas = new Beverage("박카스", 900, 15);
		Beverage monster = new Beverage("몬스터", 1500, 20);
		Beverage hotsix = new Beverage("핫식스", 1300, 10);
		Beverage milkis = new Beverage("밀키스", 1400, 5);
		
		VendingMachine vendingMachine = new VendingMachine(20);
		vendingMachine.addBeverageMenu(bakas);
		vendingMachine.addBeverageMenu(monster);
		vendingMachine.addBeverageMenu(hotsix);
		vendingMachine.addBeverageMenu(milkis);
		
		int price;
		price = vendingMachine.orderBeverage("박카스", 15);
		price = vendingMachine.orderBeverage("박카스", 10);
		vendingMachine.addBeverageStock("박카스", 10);
		price = vendingMachine.orderBeverage("박카스", 10);

		price = vendingMachine.orderBeverage("몬스터", 10);
		price = vendingMachine.orderBeverage("핫식스", 10);
		vendingMachine.addBeverageStock("아이스티", 10);
		
		vendingMachine.printAllBeverage();
	}
}
