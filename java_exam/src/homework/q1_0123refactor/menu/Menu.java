package homework.q1_0123refactor.menu;

public abstract class Menu {

	protected String name;
	protected int price;
	protected int stock;

	public Menu(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public abstract String getType();
	public abstract double getValue();

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	
	public void reduceStock() {
		if (stock > 0) {
			stock--;
		}
	}
}
