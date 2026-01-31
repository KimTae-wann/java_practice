package homework.q1_0130;


import homework.q1_0130.customer.Customer;
import homework.q1_0130.menu.Menu;
import homework.q1_0130.restaurant.Restaurant;
import homework.q1_0130.exceptions.*;

public class RestaurantMain {
	
	public static void main(String[] args) {
		
		Restaurant vips = new Restaurant("VIPS", 10.0, 1000);
		Restaurant outback = new Restaurant("OUTBACK", 10.0, 1000);
		
		Menu vipsMenu1 = new Menu("주류", "소주", 5000, 0, 19.0, 100);
		Menu vipsMenu2 = new Menu("주류", "맥주", 6000, 0, 6.0, 80);
		Menu vipsMenu3 = new Menu("주류", "보드카", 5000, 0, 40.0, 15);
		Menu vipsMenu4 = new Menu("식사류", "스테이크", 10000, 500, 0.0, 200);
		Menu vipsMenu5 = new Menu("식사류", "파스타", 8000, 300, 0.0, 70);
		vips.addMenu(vipsMenu1);
		vips.addMenu(vipsMenu2);
		vips.addMenu(vipsMenu3);
		vips.addMenu(vipsMenu4);
		vips.addMenu(vipsMenu5);
		
		Menu outbackMenu1 = new Menu("주류", "소주", 5000, 0, 19.0, 100);
		Menu outbackMenu2 = new Menu("주류", "맥주", 6000, 0, 6.0, 80);
		Menu outbackMenu3 = new Menu("주류", "보드카", 5000, 0, 40.0, 15);
		Menu outbackMenu4 = new Menu("식사류", "스테이크", 10000, 500, 0.0, 200);
		Menu outbackMenu5 = new Menu("식사류", "파스타", 8000, 300, 0.0, 70);
		outback.addMenu(outbackMenu1);
		outback.addMenu(outbackMenu2);
		outback.addMenu(outbackMenu3);
		outback.addMenu(outbackMenu4);
		outback.addMenu(outbackMenu5);
		
		Customer customer1 = new Customer("고객1", 0, 0, 50000);
		Customer customer2 = new Customer("고객2", 0, 0, 30000);
		Customer customer3 = new Customer("고객3", 0, 0, 10000);

		// 나는 NullPointerException 밖에 해당 사항이 없는거같은데, 강사님 코드는 메뉴리스트를 배열로 관리한다.
		// 나도 메서드의 파라미터를 인덱스로 받아야 ArrayIndexOutOfBoundsException 을 처리할 수 있을텐데
		// 메서드 파라미터 구조를 바꿔야 할까?
		vips.takeOrder(customer1, vipsMenu1);
		vips.takeOrder(customer1, vipsMenu1);
		outback.takeOrder(customer1, outbackMenu3);
		vips.takeOrder(customer1, vipsMenu3);
		vips.takeOrder(customer1, vipsMenu2);
		
		vips.takeOrder(customer1, vipsMenu5);
		outback.takeOrder(customer1, outbackMenu5);
		vips.takeOrder(customer1, vipsMenu4);
		
		outback.takeOrder(customer2, outbackMenu4);
		vips.takeOrder(customer2, vipsMenu2);
		vips.takeOrder(customer2, vipsMenu1);
		outback.takeOrder(customer2, outbackMenu5);
		outback.takeOrder(customer2, outbackMenu3);
		
		vips.takeOrder(customer3, vipsMenu1);
		vips.takeOrder(customer3, vipsMenu4);
		
		vips.printStatus();
		outback.printStatus();
	}
}
