package homework.q1_0123.restaurant;

import homework.q1_0123.menu.*;
import homework.q1_0123.customer.*;

public class Restaurant {

	private String name;
	private double drunkLimit;		// 취함 기준
	private int fullLimit;			// 배부름 기준
	private int totalSales = 0;		// 매출액
	
	private Menu[] menus;			// 메뉴판
	private int menuCount = 0;		// 메뉴 개수
	
	public Restaurant(String name, double drunkLimit, int fullLimit) {
		this.name = name;
		this.drunkLimit = drunkLimit;
		this.fullLimit = fullLimit;
		this.menus = new Menu[10]; 	// 10개 까지 저장 가능
	}
	
	public void addMenu(Menu menu) {
		if (menuCount < menus.length) {
			menus[menuCount++] = menu;
		}
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
		if (menu.getType().equals("주류")) {
			System.out.println(this.name + "식당의 취함 기준: " + drunkLimit);
			if (customer.getDrunkenness() >= drunkLimit) {
				System.out.println("주문 실패 - 너무 취함\n");
				return;
			}
			customer.drink(menu.getAlcohol());
		}
		else if (menu.getType().equals("식사류")) {
			System.out.println(this.name + "식당의 배부름 기준" + fullLimit);
			if (customer.getFullness() >= fullLimit) {
				System.out.println("주문 실패 - 너무 배부름\n");
				return;
			}
			customer.eat(menu.getWeight());
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
		for (int i = 0; i < menuCount; i++) {
			Menu m = menus[i];
			String info = m.getType().equals("주류") ? m.getAlcohol() + "%" : m.getWeight() + "g";
			System.out.println((i + 1) + ". " + m.getType() + " / " + m.getPrice() + "원 / " + info + " / " + m.getStock() + "개");
		}
		System.out.println("매출금: " + totalSales + "\n");
	}
}
