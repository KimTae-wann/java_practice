package homework.q1_0123refactor.customer;

import homework.q1_0123.menu.*;

public class Customer {

	private String name;
	private double drunkenness;
	private double fullness;
	private int money;
	
	public Customer(String name, double drunkenness, double fullness, int money) {
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

	public double getFullness() {
		return fullness;
	}

	public int getMoney() {
		return money;
	}

	public void drink(double alcoholVolume) {
		drunkenness += alcoholVolume * 0.1;
	}
	
	public void eat(double foodWeight) {
		fullness += foodWeight;
	}
	
	public void pay(int amount) {
		money -= amount;
	}
}
