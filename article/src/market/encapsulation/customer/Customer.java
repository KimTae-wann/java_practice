package market.encapsulation.customer;

import market.encapsulation.seller.*;
import market.encapsulation.product.*;

public class Customer {
	
	private int customerNum;
	private int capital;						// 자본금
	private int currentBagWeight;				// 구매한 상품
	private final int maxLift;					// 들 수 있는 장바구니 무게
	
	public Customer(int customerNum, int capital, int maxLift) {
		this.customerNum = customerNum;
		this.capital = capital;
		this.maxLift = maxLift;
	}
	
	public int getCustomerNum() {
		return customerNum;
	}

	public boolean buy(Seller seller, int amount) {
		Product p = seller.getProduct();
		
		int totalCost = p.getPrice() * amount;
		int totalWeight = p.getWeight() * amount;
 		
		if (amount == 0) {
			System.out.println("1개 이상부터 구매 가능합니다.");
			return false;
		}
		if (capital < totalCost) {
			System.out.println("돈이 부족합니다");
			return false;
		}
		
		if (maxLift < currentBagWeight + totalWeight) {
			System.out.println(customerNum +"번 고객은 더 이상 장바구니를 들 수 없습니다.");
			return false;
		}
		
		currentBagWeight += totalWeight;
		capital -= totalCost;
		return true;
	}
}
