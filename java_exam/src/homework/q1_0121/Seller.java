package homework.q1_0121;

public class Seller {
	private final int productPrice = 1000;	// 상품 금액
	public int stock;						// 상품 재고
	private int capital;					// 자본금
	
	public Seller(int stock, int capital) {
		this.stock = stock;
		this.capital = capital;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
	public void sell(int productNum) {
		if (productNum > stock) {
			System.out.println(productNum + "만큼 물품을 구매 할 수 없습니다.");
			return ;
		}
		if (stock == 0) {
			System.out.println("품절되었습니다.");
			return ;
		}
		stock -= productNum;
		capital += productNum * productPrice;
		System.out.println("판매원의 상품은 " + stock + "개 남았습니다.\n판매원은 " +
							capital + "원의 자본금을 가지고 있습니다.");
	}
}
