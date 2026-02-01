package homework.q1_0130;


import homework.q1_0130.customer.Customer;
import homework.q1_0130.menu.Menu;
import homework.q1_0130.restaurant.Restaurant;
import homework.q1_0130.exceptions.*;

public class RestaurantMain {
	
	public static void main(String[] args) {
		
		Restaurant vips = new Restaurant("VIPS", 5.0, 500);
		Menu steak = new Menu("식사류", "스테이크", 20_000, 600, 0, 1);
		Menu vodka = new Menu("주류", "보드카", 100_000, 0, 40.0, 2);
		vips.addMenu(steak);
		
		Customer c1 = new Customer("고객1", 0, 0, 50_000);
		Customer c2 = new Customer("고객2", 5.0, 500, 100_000);
		
		vips.takeOrder(c1, steak);	// 정상
		vips.takeOrder(c1, null);	// 메뉴 누락 (NullPointerException)
		vips.takeOrder(c1, steak);	// 재고 부족 (OutOfStockException)
		vips.takeOrder(c2, steak);	// 배부름 초과 (FullException)
		vips.takeOrder(c2, vodka);	// 주량 초과 (DrunkenException)
		vips.takeOrder(c1, vodka);	// 잔액 부족 (NoMoneyException)
		
		vips.printStatus();
	}
}
