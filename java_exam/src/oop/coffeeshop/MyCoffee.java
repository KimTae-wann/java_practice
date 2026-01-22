package oop.coffeeshop;

public class MyCoffee {
	private String coffeeName;	// 커피 이름
	private int coffeePrice;	// 커피 가격
	
	public MyCoffee(String coffeeName, int coffeePrice) {
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}

	public String getMyCoffeeName() {
		return coffeeName;
	}

	public int getMyCoffeePrice() {
		return coffeePrice;
	}
}
