package homework.q1_0123refactor.restaurant;

import homework.q1_0123refactor.menu.*;
import homework.q1_0123refactor.customer.*;

import java.util.ArrayList;
import java.util.List;


public class Restaurant {

	private String name;
	private double drunkLimit;		// 취함 기준
	private int fullLimit;			// 배부름 기준
	private int totalSales = 0;		// 매출액
	private List<Menu> menuList = new ArrayList<>();
	
	public Restaurant(String name, double drunkLimit, int fullLimit) {
		this.name = name;
		this.drunkLimit = drunkLimit;
		this.fullLimit = fullLimit;
	}
	
	public void addMenu(Menu menu) {
		menuList.add(menu);
	}
	
	public void takeOrder(Customer customer, Menu menu) {
		System.out.println("고객명 : " + customer.getName());
		System.out.println(customer.getName() + "의 취함 정도: " + String.format("%.1f", customer.getDrunkenness()));
		System.out.println(customer.getName() + "의 배부름 정도: " + customer.getFullness());
		System.out.println(customer.getName() + "의 소지금: " + customer.getMoney());
		System.out.println("주문 금액: " + menu.getPrice());
		
		// 1. 소지금 확인
		if (customer.getMoney() < menu.getPrice()) {
			System.out.println(customer.getName() + "의 소지금 부족\n");
			return;
		}
		
		// 2. 종류별 기준 확인
		if (menu instanceof Drink) {
			System.out.println(this.name + "식당의 취함 기준: " + drunkLimit);
			if (customer.getDrunkenness() >= drunkLimit) {
				System.out.println("주문 실패 - 너무 취함\n");
				return;
			}
			customer.drink(menu.getValue());
		}
		else if (menu instanceof Food) {
			System.out.println(this.name + "식당의 배부름 기준" + fullLimit);
			if (customer.getFullness() >= fullLimit) {
				System.out.println("주문 실패 - 너무 배부름\n");
				return;
			}
			customer.eat(menu.getValue());
		}
		else {
			System.out.println("주류, 식사류 외는 팔지 않습니다");
			return;
		}
		
		// 3. 주문 성공
		customer.pay(menu.getPrice());
		totalSales += menu.getPrice();
		menu.reduceStock();
		System.out.println("주문 성공\n");
	}
	
	public void printStatus() {
		System.out.println(name + "상태 확인");
		System.out.println("Menu ========");
		for (int i = 0; i < menuList.size(); i++) {
			Menu m = menuList.get(i);
			String unit = (m instanceof Drink )? "%" : "g";
			System.out.println((i + 1) + ". " + m.getType() + " / " + m.getPrice() + "원 / " + m.getValue() + unit + " / " + m.getStock() + "개");
		}
		System.out.println("매출금: " + totalSales + "\n");
	}
}
