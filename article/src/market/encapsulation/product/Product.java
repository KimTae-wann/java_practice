package market.encapsulation.product;

public class Product {

	private final int price;
	private final int weight;

	public Product(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public int getWeight() {
		return weight;
	}
}
