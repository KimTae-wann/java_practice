package market.seller;

public class MySeller {
	private final int sellerNum;
	private final int productPrice;			// 상품 금액
	private final int stockWeight;			// 상품 무게
	private int stock;						// 상품 재고
	private int capital;					// 자본금

	public MySeller(int sellerNum, int productPrice, int stockWeight, int stock, int capital) {
		this.sellerNum = sellerNum;
		this.productPrice = productPrice;
		this.stockWeight = stockWeight;
		this.stock = stock;
		this.capital = capital;
	}

	public int getSellerNum() {
		return sellerNum;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
	public int getStockWeight() {
		return stockWeight;
	}
	
	public int getStock() {
		return stock;
	}
	
	public boolean canSell() {
		return stock > 0;
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
		System.out.println(sellerNum + "번 판매원의 상품은 " + stock + "개 남았습니다.\n판매원은 " +
							capital + "원의 자본금을 가지고 있습니다.");
	}
}
