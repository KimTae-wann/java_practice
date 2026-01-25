package homework.q1_0123.restaurant;

import homework.q1_0123.menu.*;
import homework.q1_0123.customer.*;

public class Restaurant {

	private final int maxFullDegree; 
	private final int maxAlcoholDegree;
	
	// 배 부름과 취함의 정도는 식당마다 기준이 다름
	public Restaurant(int maxFullDegree, int maxAlcoholDegree) {
		this.maxFullDegree = maxFullDegree;
		this.maxAlcoholDegree = maxAlcoholDegree;
	}

	public boolean canOrder(Customer customer) {
		if (customer.getFullDegree() < maxFullDegree && customer.getAlcoholDegree() < maxAlcoholDegree) {
			System.out.println("주문 가능합니다");
			return true;
		}
		else {
			System.out.println("주문 불가능합니다");
			return false;
		}
	}
}
