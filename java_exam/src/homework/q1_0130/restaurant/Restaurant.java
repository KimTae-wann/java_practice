package homework.q1_0130.restaurant;

import homework.q1_0130.customer.Customer;
import homework.q1_0130.menu.Menu;
import homework.q1_0130.restaurant.Restaurant;
import homework.q1_0130.exceptions.*;


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
		if (menu == null) return; // 메뉴가 null 이면 저장하지 않음
		if (menuCount < menus.length) {
			menus[menuCount++] = menu;
		}
	}
	
	public void takeOrder(Customer customer, Menu menu) {		
		try {
			if (customer == null) throw new NullPointerException("잘못된 고객입니다.");
			if (menu == null) throw new NullPointerException("잘못된 메뉴 입니다.");
			
			System.out.println("고객명 : " + customer.getName());
			System.out.println(customer.getName() + "의 취함 정도: " + String.format("%.1f", customer.getDrunkenness())); 
			System.out.println(customer.getName() + "의 배부름 정도: " + customer.getFullness());
			System.out.println(customer.getName() + "의 소지금: " + customer.getMoney());
			System.out.println("주문 금액: " + menu.getPrice());
			
			// 1. 소지금 확인
			if (customer.getMoney() < menu.getPrice()) {
				throw new NoMoneyException("잔액 부족");
			}
			
			// 2. 종류별 기준 확인
			if (menu.getType().equals("주류")) {
				System.out.println(this.name + "식당의 취함 기준: " + drunkLimit);
				if (customer.getDrunkenness() >= drunkLimit) {
					throw new DrunkenException("주량 기준 초과");
				}
				customer.drink(menu.getAlcohol());
			}
			else if (menu.getType().equals("식사류")) {
				System.out.println(this.name + "식당의 배부름 기준" + fullLimit);
				if (customer.getFullness() >= fullLimit) {
					throw new FullException("배부름 기준 초과");
				}
				customer.eat(menu.getWeight());
			}
			
			// 3. 주문 성공
			customer.pay(menu.getPrice());
			totalSales += menu.getPrice();
			menu.reduceStock();
			System.out.println("주문 성공");
		}
		catch (NullPointerException e) {
			System.out.println("참조값 누락 [" + e.getMessage() + "]");
		}
		catch (OutOfStockException | NoMoneyException | DrunkenException | FullException e) {
			System.out.println("주문 실패 [" + e.getMessage() + "]");
		}
		catch (Exception e) {
			System.out.println("알수없는 오류" + e.getMessage());
		}
		finally {
			System.out.println("-----끝-----\n");
		}
	}
	
	public void printStatus() {
		System.out.println(name + "상태 확인");
		System.out.println("Menu ========");

		int i = 1;
		for (Menu m : menus) {
			if (m != null) { // nullPointerException 걸림
				if (m.getType().equals("주류")) {
					System.out.println((i++) + ". " + m.getType() + " / " + m.getPrice() + "원 / " + m.getAlcohol() + "% / " + m.getStock() + "개");
				}
				else {
					System.out.println((i++) + ". " + m.getType() + " / " + m.getPrice() + "원 / " + m.getWeight() + "g / " + m.getStock() + "개");
				}
			}
		}
		System.out.println("매출금: " + totalSales + "\n");
	}
}
