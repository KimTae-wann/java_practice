package homework.q1_0123refactor;

import java.util.*;

import homework.q1_0123refactor.restaurant.*;
import homework.q1_0123refactor.menu.*;
import homework.q1_0123refactor.customer.*;

public class RestaurantMain {

	public static void main(String[] args) {
		
		Restaurant vips = new Restaurant("VIPS", 10.0, 1000);
		Restaurant outback = new Restaurant("OUTBACK", 10.0, 1000);
		
		Menu vipsMenu1 = new Drink("소주", 5000, 100, 19.0);
		Menu vipsMenu2 = new Drink("맥주", 6000, 80, 6.0);
		Menu vipsMenu3 = new Drink("보드카", 5000, 15, 40.0);
		Menu vipsMenu4 = new Food("스테이크", 10000, 200, 500);
		Menu vipsMenu5 = new Food("파스타", 8000, 70, 300);
		vips.addMenu(vipsMenu1);
		vips.addMenu(vipsMenu2);
		vips.addMenu(vipsMenu3);
		vips.addMenu(vipsMenu4);
		vips.addMenu(vipsMenu5);
		
		Menu outbackMenu1 = new Drink("소주", 5000, 100, 19.0);
		Menu outbackMenu2 = new Drink("맥주", 6000, 80, 6.0);
		Menu outbackMenu3 = new Drink("보드카", 5000, 15, 40.0);
		Menu outbackMenu4 = new Food("스테이크", 10000, 200, 500);
		Menu outbackMenu5 = new Food("파스타", 8000, 70, 300);
		outback.addMenu(outbackMenu1);
		outback.addMenu(outbackMenu2);
		outback.addMenu(outbackMenu3);
		outback.addMenu(outbackMenu4);
		outback.addMenu(outbackMenu5);
		
		Customer customer1 = new Customer("고객1", 0, 0, 50000);
		Customer customer2 = new Customer("고객2", 0, 0, 30000);
		Customer customer3 = new Customer("고객3", 0, 0, 10000);

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
