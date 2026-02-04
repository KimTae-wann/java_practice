package coffee;

public class Coffee {
	private CoffeeType type;
	private String coffeeName;	// 커피 이름
	private int coffeePrice;	// 커피 가격
	private int coffeeStock;	// 하루 동안 판매 가능한 커피의 양
	
	public Coffee(CoffeeType coffeeType, String coffeeName, int coffeePrice, int coffeeStock) {
		this.type = coffeeType;
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
		this.coffeeStock = coffeeStock;
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
	public int getCoffeeStock() {
		return coffeeStock;
	}
	public void setCoffeeStock(int coffeeStock) {
		this.coffeeStock = coffeeStock;
	}
	
	
	
}
