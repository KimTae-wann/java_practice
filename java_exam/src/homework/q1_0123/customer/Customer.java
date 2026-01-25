package homework.q1_0123.customer;

import homework.q1_0123.menu.*;

public class Customer {

	private String name;
	private double drunkenness;
	private int fullness;
	private int money;
	
	public Customer(String name, double drunkenness, int fullness, int money) {
		this.name = name;
		this.drunkenness = drunkenness;
		this.fullness = fullness;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}

	public double getDrunkenness() {
		return drunkenness;
	}

	public int getFullness() {
		return fullness;
	}

	public int getMoney() {
		return money;
	}

	public void drink(double alcoholVolume) {
		drunkenness += alcoholVolume * 0.1;
	}
	
	public void eat(int foodWeight) {
		fullness += foodWeight;
	}
	
	public void pay(int amount) {
		money -= amount;
	}
}
