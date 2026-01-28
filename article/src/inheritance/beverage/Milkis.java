package inheritance.beverage;

public class Milkis extends Beverage{

	public Milkis(String beverageName, int beveragePrice, int beverageStock) {
		super(beverageName, beveragePrice, beverageStock);
	}
	
	@Override
	public void whatIsBeverageName() {
		System.out.println("이 음료는 " + super.getBeverageName() + "입니다.");
	}	
}
