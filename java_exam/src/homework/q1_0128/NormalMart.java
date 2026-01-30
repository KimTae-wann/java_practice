package homework.q1_0128;

/**
 * 일반마트는 진열한 상품을 판매만 합니다
 * 판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려줍니다.
 */

public class NormalMart extends BaseStore{
	
	@Override
	public void sell(Product product, int count, Customer customer, int pointToUse) {
		int finalPrice = product.getProductPrice() * count;
		int pointToDeduct = 0;
		
		// 1. 구매 가능 여부
		if (!super.canBuy(customer, finalPrice)) {
			return ;
		}

		// 2. 결제 진행 
		super.processPayment(customer, finalPrice, pointToDeduct);
		
		// 3. 포인트 계산
		int reward = 0;
		
		// 4. 영수증 출력
		super.printReceipt("일반마트", finalPrice, pointToDeduct, reward);
	}
}
