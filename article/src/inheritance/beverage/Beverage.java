package inheritance.beverage;

public abstract class Beverage {
	private String beverageName;
	private int beveragePrice;
	private int beverageStock;
	
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

	public abstract void whatIsBeverageName();
}
