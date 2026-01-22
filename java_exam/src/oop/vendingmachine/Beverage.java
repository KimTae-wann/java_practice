//package oop.vendingmachine;
//
//public class MyBeverage {
//	private String beverageName;	// 음료 이름
//	private int beveragePrice;		// 음료 가격
//	private int beverageStock;		// 음료 수량
//	
//	public MyBeverage(String beverageName, int beveragePrice, int beverageStock) {
//		this.beverageName = beverageName;
//		this.beveragePrice = beveragePrice;
//		this.beverageStock = beverageStock;
//	}
//
//	public String getBeverageName() {
//		return beverageName;
//	}
//
//	public int getBeveragePrice() {
//		return beveragePrice;
//	}
//
//	public int getBeverageStock() {
//		return beverageStock;
//	}
//
//	public void setBeverageStock(int beverageStock) {
//		this.beverageStock = beverageStock;
//	}
//}

package oop.vendingmachine;

public class Beverage {
	private String beverageName;	// 음료 이름
	private int beveragePrice;		// 음료 가격
	private int beverageStock;		// 음료 수량
	
	public Beverage(String beverageName, int beveragePrice, int beverageStock) {
		this.beverageName = beverageName;
		this.beveragePrice = beveragePrice;
		this.beverageStock = beverageStock;
	}

	public String getBeverageName() {
		return beverageName;
	}

	public int getBeveragePrice() {
		return beveragePrice;
	}

	public int getBeverageStock() {
		return beverageStock;
	}

	public void setBeverageStock(int beverageStock) {
		this.beverageStock = beverageStock;
	}
}
