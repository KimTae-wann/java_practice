package market.encapsulation.seller;

import market.encapsulation.product.Product;

public class Seller {
	private Product product;	// 상품 객체
	private int sellerNum;		
	private int stock;			// 상품 재고
	private int capital;		// 자본금
	
	public Seller(Product product, int stock, int capital) {
		this.product = product;
		this.stock = stock;
		this.capital = capital;
	}

	public Product getProduct() {
		return product;
	}
	
	public int getSellerNum() {
		return sellerNum;
	}

	public void setSellerNum(int sellerNum) {
		this.sellerNum = sellerNum;
	}

	public int getStock() {
		return stock;
	}
	
	public int getCapital() {
		return capital;
	}

	public void sell(int amount) {
		if (stock >= amount) {
			stock -= amount;
		}
	}
}
