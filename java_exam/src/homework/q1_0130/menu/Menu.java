package homework.q1_0130.menu;

import homework.q1_0130.exceptions.*;

public class Menu {

	
	private String type;	// 식사류 or 주류
	private String name;	// 메뉴 이름ㄴ
	private int price;		// 가격
	private int weight;		// 무게
	private double alcohol;	// 도수
	private int stock;		// 재고수
	
	
	public Menu(String type, String name, int price, int weight, double alcohol, int stock) {
		this.type = type;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.alcohol = alcohol;
		this.stock = stock;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getWeight() {
		return weight;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public int getStock() {
		return stock;
	}

	public void reduceStock() {
//		if (stock > 0) {
//			stock--;
//		}
		if (this.stock <= 0) {
			throw new OutOfStockException("[" + name + "] 재고없음");
		}
		this.stock--;
	}
}
