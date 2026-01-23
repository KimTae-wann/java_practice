package homework.q1_0123.menu;

public class Drink extends Menu{

	private String drinkName;
	private int alcohol;
	private int price;
	
	public Drink(String drinkName, int alcohol, int price) {
		this.drinkName = drinkName;
		this.alcohol = alcohol;
		this.price = price;
	}

	public int getAlcohol() {
		return alcohol;
	}
	
	public int getPrice() {
		return price;
	}
}
