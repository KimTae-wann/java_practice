package homework.q1_0128;

/**
 * 일반마트는 진열한 상품을 판매만 합니다
 * 판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려줍니다.
 */

public class CommonMart{
	
	private final String storeName = "일반 마트";
	private Product[] products;
	private final double point = 0;
	
	public CommonMart(Product[] products) {
		this.products = products;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public int refund(int totalPrice, int account) {
		System.out.println(account + "원을 지불하였습니다.");
		System.out.println("거스름돈은 " + (account - totalPrice) + "원 입니다.");
		return account - totalPrice;
	}
}
