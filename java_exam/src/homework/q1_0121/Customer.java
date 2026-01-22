package homework.q1_0121;

public class Customer {
	
	private int customerNum;
	private static final int stockWeight = 500;	// 상품 무게
	private final int productPrice;			// 상품 가격
	private int boughtStock;				// 구매한 상품
	private int capital;					// 자본금
	private int canLift;					// 들 수 있는 장바구니 무게
	public boolean canBuy = true;
	
	public Customer(int customerNum, int capital, int canLift, int productPrice) {
		boughtStock = 0;
		this.customerNum = customerNum;
		this.capital = capital;
		this.canLift = canLift; // 사람마다 다르다.
		this.productPrice = productPrice;
	}
	
	public boolean buy(int productNum) {
		if (canLift < (boughtStock + productNum) * stockWeight) {
			canBuy = false;
			System.out.println(customerNum +"번 고객은 더 이상 장바구니를 들 수 없습니다.");
			return false;
		}
		
		if ((boughtStock + productNum) * productPrice > capital) {
			canBuy = false;
			System.out.println("돈이 부족합니다");
			return false;
		}
		
		canLift -= productNum * stockWeight;
		capital -= productNum * productPrice;
		return true;
	}
}
