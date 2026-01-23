package homework.q1_0123.menu;

public class Food extends Menu{

	private final String menuName;
	private final int weight;
	private final int price;
	
	public Food(String menuName, int weight, int price) {
		this.menuName = menuName;
		this.weight = weight;
		this.price = price;
	}
	
	public String getMenuName() {
		return menuName;
	}

	public int getWeight() {
		return weight;
	}

	public int getPrice() {
		return price;
	}
}
