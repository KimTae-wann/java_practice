package market.customer;

public class MyCustomer {
	
	private final int customerNum;
	private int boughtStock;					// 구매한 상품
	private int capital;						// 자본금
	private int canLift;						// 들 수 있는 장바구니 무게
	
	public MyCustomer(int customerNum, int capital, int canLift) {
		boughtStock = 0;
		this.customerNum = customerNum;
		this.capital = capital;
		this.canLift = canLift; // 사람마다 다르다.
	}
	
	public boolean buy(int productNum, int stockWeight, int productPrice) {
		if (productNum == 0) {
			System.out.println("1개 이상부터 구매 가능합니다.");
			return false;
		}
		if (canLift < (boughtStock + productNum) * stockWeight) {
			System.out.println(customerNum +"번 고객은 더 이상 장바구니를 들 수 없습니다.");
			return false;
		}
		
		if ((boughtStock + productNum) * productPrice > capital) {
			System.out.println("돈이 부족합니다");
			return false;
		}
		
		canLift -= productNum * stockWeight;
		capital -= productNum * productPrice;
		return true;
	}
	
	public int getCustomerNum() {
		return customerNum;
	}
}
