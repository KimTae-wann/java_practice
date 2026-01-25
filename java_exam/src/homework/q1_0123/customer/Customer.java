package homework.q1_0123.customer;

import homework.q1_0123.menu.*;

public class Customer {

	private int customerNum;
	private int fullDegree;
	private int alcoholDegree;
	
	public Customer(int customerNum, int fullDegree, int alcoholDegree) {
		this.customerNum = customerNum;
		this.fullDegree = fullDegree;
		this.alcoholDegree = alcoholDegree;
	}

	public int getCustomerNum() {
		return customerNum;
	}
	
	public int getFullDegree() {
		return fullDegree;
	}

	public void setFullDegree(int fullDegree) {
		this.fullDegree = fullDegree;
	}

	public int getAlcoholDegree() {
		return alcoholDegree;
	}

	public void setAlcoholDegree(int alcoholDegree) {
		this.alcoholDegree = alcoholDegree;
	}
	
	public void buy(String menuName,) {
		for (Menu)
		// 순환해서
		// 술이면 alcoholDegree 증가
		// 음식이면 fullDegree 증가
	}
}
