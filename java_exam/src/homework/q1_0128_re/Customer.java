package homework.q1_0128_re;

import homework.q1_0128.ConvenienceStore;
import homework.q1_0128.DepartmentStore;
import homework.q1_0128.NormalMart;
import homework.q1_0128.Product;

public class Customer {

	private int account; 	// 보유 금액
	private int point; 		// 보유 포인트
	private CustomerGrade customerGrade; // 회원 등급

	public Customer(int account, int point, CustomerGrade customerGrade) {
		this.account = account;
		this.point = point;
		this.customerGrade = customerGrade;
	}

	public int getAccount() {
		return account;
	}

	public int getPoint() {
		return point;
	}

	public CustomerGrade getCustomerGrade() {
		return customerGrade;
	}

	public void pay(int amount) {
		this.account -= amount;
	}
	
	public void usePoint(int amount) {
		this.account -= amount;
	}
	
	public void addPoint(int amount) {
		this.account += amount;
	}
	
	/*
	 * 아래 buy 메서드는 구매자가 구매하는 행위를 오버로딩했는데
	 * 사실 CommonMart, ConvenientStore, DepartmentStore 구분없이
	 * 상위 타입인 Store를 인자로 받아와야 할것같음
	 * 그런데 자세히 보면 로직이 조금씩 다름
	 * 일반 마트는 포인트, 할인 이런게 없고
	 * 편의점은 포인트
	 * 백화점은 각 등급에 따른 포인트, 할인이 존재한다.
	 * 이런경우에는 포인트, 할인과 관련없는 CommonMart에서도 포인트 상수, 할인 상수를 사용해야 하는가?
	 * 아니면 그냥 instanceof로 분기를 나눠야 되는건지
	 * 아니면 그냥 store 클래스의 givePoint 메서드에서 instanceof로 분기해서
	 * 그 리턴 값을 이용하는게 좋은지
	 */
	public void buy (NormalMart commonMart, Product product, int productCount) {
		int totalPrice = product.getProductPrice() * productCount;
		if (this.getAccount() >= product.getProductPrice() * productCount) {
			System.out.println(commonMart.getStoreName() + "에서 " +
								product.getProductName() + "을 구매하였습니다." +
								"가격은 " + totalPrice + "원 입니다.");
			commonMart.refund(totalPrice, this.account);
			return ;
		}
		System.out.println("돈이 부족해서 물품을 구매할 수 없습니다.");
	}
	
	public void buy (ConvenienceStore convenientStore, Product product, int productCount) {
		int totalPrice = product.getProductPrice() * productCount;
		// 일단 포인트가 있으면 모든 포인트 소모한다고 가정해.
		if (this.point >= 100) {
			totalPrice -= this.point;
			this.point = 0;
		}
		this.point += (convenientStore.getPoint() * product.getProductPrice() * productCount) / 100;
		System.out.println(this.point);
		if (this.getAccount() >= product.getProductPrice() * productCount) {
			System.out.println(convenientStore.getStoreName() + "에서 " +
								product.getProductName() + "을 구매하였습니다." +
								"가격은 " + totalPrice + "원 입니다.");
			convenientStore.refund(totalPrice, this.account);
			return ;
		}
		System.out.println("돈이 부족해서 물품을 구매할 수 없습니다.");
	}
	
	public void buy (DepartmentStore departmentStore, Product product, int productCount) {
		int totalPrice = product.getProductPrice() * productCount;
		totalPrice -= (int) (totalPrice * departmentStore.getSalePercent(this.customerGrade) / 100); 
		// 일단 포인트가 있으면 모든 포인트 소모한다고 가정해.
		if (this.point >= 10000) {
			totalPrice -= this.point;
			this.point = 0;
		}
		this.point += (departmentStore.getPointPercent(this.grade) * product.getProductPrice() * productCount) / 100;
		System.out.println(this.point);
		if (this.getAccount() >= product.getProductPrice() * productCount) {
			System.out.println(departmentStore.getStoreName() + "에서 " +
								product.getProductName() + "을 구매하였습니다." +
								"가격은 " + totalPrice + "원 입니다.");
			departmentStore.refund(totalPrice, this.account);
			return ;
		}
		System.out.println("돈이 부족해서 물품을 구매할 수 없습니다.");
	}
}
