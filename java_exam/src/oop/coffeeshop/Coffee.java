package oop.coffeeshop;

public class Coffee {
	private String coffeeName;	// 커피 이름
	private int coffeePrice;	// 커피 가격
	
	public Coffee(String coffeeName, int coffeePrice) {
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	
	
}
