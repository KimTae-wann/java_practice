package homework.q1_0123;

import java.util.*;

import homework.q1_0123.restaurant.*;
import homework.q1_0123.menu.*;
import homework.q1_0123.customer.*;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant restaurant = new Restaurant(70, 50);
		Menu menuList = new Menu();
		menuList.addMenu(new Food("순대국", 10, 1000));
		menuList.addMenu(new Food("순대국 특", 20, 2000));
		menuList.addMenu(new Drink("소주", 20, 5000));
		menuList.addMenu(new Drink("와인", 10, 4000));
		Customer[] customers = {new Customer(1, 30, 50), new Customer(2, 30, 20), new Customer(3, 70, 50)};
		
		while(true) {
			System.out.println("몇 번 손님이 주문하나요?? (1 ~ 3) / 종료: 0");
			int customerNum = sc.nextInt();
			sc.nextLine();
			String menuName = sc.nextLine();
			for (Customer customer : customers) {
				if (customer.getCustomerNum() == customerNum) {
					// 구매 가능 체크
					if (restaurant.canOrder(customer)) {
						customer.buy(menuName);
					}
				}
			}
		}
	}

}
