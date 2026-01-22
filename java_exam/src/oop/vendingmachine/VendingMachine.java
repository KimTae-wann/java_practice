//package oop.vendingmachine;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MyVendingMachine {
//	private List<MyBeverage> beverageMenus;
//	
//	public MyVendingMachine() {
//		beverageMenus = new ArrayList<>();
//	}
//
//	public void orderBeverage(String beverageName, int quantity) {
//		for (MyBeverage beverage : beverageMenus) {
//			if (beverage.getBeverageName().equals(beverageName)) {
//				if (beverage.getBeverageStock() <= 0) {
//					System.out.println("상품이 품절되었습니다");
//					return ;
//				}
//				beverage.setBeverageStock(beverage.getBeverageStock() - quantity);
//				System.out.println(beverage.getBeverageName() + "을(를) " + quantity + "개 주문 받았습니다");
//				System.out.println("총 가격은 " + beverage.getBeveragePrice() * quantity + "원 입니다");
//				return ;
//			}
//		}
//		System.out.println(beverageName + "은(는) 존재하지 않는 음료입니다");
//		return ;
//	}
//	
//	public void addBeverageMenu(MyBeverage myBeverage) {
//		for (MyBeverage beverage : beverageMenus) {
//			if (beverage.getBeverageName().equals(myBeverage.getBeverageName())) {
//				System.out.println(myBeverage.getBeverageName() + "은(는) 이미 존재하는 메뉴입니다");
//				System.out.println("재고에 추가합니다");
//				beverage.setBeverageStock(beverage.getBeverageStock() + myBeverage.getBeverageStock());
//				return ;
//			}
//		}
//		beverageMenus.add(myBeverage);
//	}
//	
//	public void addBeverageStock(String addBeverage, int productNum) {
//		for (MyBeverage beverage : beverageMenus) {
//			if (beverage.getBeverageName().equals(addBeverage)) {
//				System.out.println(addBeverage+ "이(가) " + productNum + "개 추가되었습니다");
//				beverage.setBeverageStock(beverage.getBeverageStock() + productNum);
//				return ;
//			}
//		}
//		
//	}
//	
//	public void printAllBeverage() {
//		System.out.println("\n***남은 재고 수 출력 ***");
//		for (MyBeverage beverage : beverageMenus) {
//			System.out.println(beverage.getBeverageName() + " " + beverage.getBeverageStock() + "개 남았습니다.");
//		}
//		System.out.println("***남은 재고 수 출력 끝 ***\n");
//	}
//}


package oop.vendingmachine;

public class VendingMachine {
	private Beverage[] beverageMenus;
	private int currentBeverage;
	private final int maxBeverage = 20;
	
	public VendingMachine() {
		currentBeverage = 0;
		beverageMenus = new Beverage[maxBeverage];
		for (Beverage beverage : beverageMenus) {
			beverage = null;
		}
	}
	
	public void addBeverage(Beverage addBeverage) {
		for (Beverage beverage : beverageMenus) {
			if (beverage == null) {
				break;
			}
			if (beverage.getBeverageName().equals(addBeverage.getBeverageName())) {
				System.out.println(addBeverage.getBeverageName() + "은(는) 이미 존재하는 메뉴입니다");
				System.out.println("재고에 추가합니다");
				beverage.setBeverageStock(beverage.getBeverageStock() + beverage.getBeverageStock());
				return ;
			}
		}
		beverageMenus[currentBeverage++] = addBeverage;
	}
	
	public int orderBeverage(String beverageName, int quantity) {
		for (Beverage beverage : beverageMenus) {
			if (beverage == null) {
				break;
			}
			if (beverage.getBeverageName().equals(beverageName)) {
				if (beverage.getBeverageStock() <= 0) {
					System.out.println(beverageName + "이 품절되었습니다");
					return 0;
				}
				beverage.setBeverageStock(beverage.getBeverageStock() - quantity);
				System.out.println(beverage.getBeverageName() + "을(를) " + quantity + "개 주문 받았습니다");
				return beverage.getBeveragePrice() * quantity;
			}
		}
		System.out.println(beverageName + "는 없는 음료입니다.");
		return 0;
	}
	
	public void addBeverageStock(String addBeverage, int productNum) {
		for (Beverage beverage : beverageMenus) {
			if (beverage == null) {
				break;
			}
			if (beverage.getBeverageName().equals(addBeverage)) {
				System.out.println(addBeverage+ "이(가) " + productNum + "개 추가되었습니다");
				beverage.setBeverageStock(beverage.getBeverageStock() + productNum);
				return ;
			}
		}
		System.out.println(addBeverage + "는 없는 음료입니다.\n※재고를 넣기 전에 먼저 음료를 추가해주세요※");
	}
	
	public void printAllBeverage() {
		System.out.println("\n★★★★남은 재고 수 출력 ★★★★");
		for (Beverage beverage : beverageMenus) {
			if (beverage == null) {
				break;
			}
			System.out.println(beverage.getBeverageName() + " " + beverage.getBeverageStock() + "개 남았습니다.");
		}
		System.out.println("★★★★남은 재고 수 출력 끝 ★★★★\n");
	}
}
