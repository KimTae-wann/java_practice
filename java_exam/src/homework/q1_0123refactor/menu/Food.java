package homework.q1_0123refactor.menu;

public class Food extends Menu{
	private int weight;

	public Food(String name, int price, int stock, int weight) {
		super(name, price, stock);
		this.weight = weight;
	}
	
	@Override
	public String getType() {
		return "식사류";
	}
	
	@Override
	public double getValue() {
		return weight;
	}
}
