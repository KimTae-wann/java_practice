package homework.q1_0123refactor.menu;

public class Drink extends Menu{
	private double alcoholVolume;

	public Drink(String name, int price, int stock, double alcoholVolume) {
		super(name, price, stock);
		this.alcoholVolume = alcoholVolume;
	}
	
	@Override
	public String getType() {
		return "주류";
	}
	
	@Override
	public double getValue() {
		return alcoholVolume;
	}
}
