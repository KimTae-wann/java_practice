package homework.q1_0128;

/**
 * 편의점은 진열한 상품을 판매하고 구매자에게 판매금액의 0.1%의 포인트를 지급합니다.
 * 판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려줍니다.
 * 동시에, 구매자에게 구매금액의 0.1% 만큼의 포인트를 지급합니다.
 * 구매자의 포인트가 100점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
 * 단, 포인트는 전액 사용해야 합니다. (상품 금액이 포인트보다 작을 때에도 전액 사용해야합니다.)
 * 예를 들어, 구매자에게 2000의 포인트가 있고 5000원 상당의 상품을 구매할 때, 구매자는 3000원만 지불합니다. 그리고 구매자는 5000원의 0.1%만큼의 포인트를 지급받습니다
 * 또 다른 구매자에게는 3000의 포인트가 있고 7000원 상당의 상품을 구매할 때, 15000원을 지불하면 판매자는 15000 - (7000-3000)만큼을 거슬러 줍니다.
 * 그리고 구매자는 7000원의 0.1%만큼의 포인트를 지급받습니다.
 */

public class ConvenienceStore extends BaseStore{
	
	private final double POINT_RATE = 0.001;
	private final int POINT_THRESHOLD = 100;
	
	@Override
	public void sell(Product product, int count, Customer customer, int pointToUse) {
		int originalPrice = product.getProductPrice() * count;
		int finalPrice = originalPrice;
		int pointToDeduct = 0;
		
		// 1. 포인트 & 최종 금액 계산
		pointToDeduct = calculateUsePoint(customer.getPoint(), originalPrice);
		finalPrice = originalPrice - pointToDeduct;
		if (finalPrice < 0) {
			finalPrice = 0;
		}
		
		// 2. 구매 가능 여부
		if (!super.canBuy(customer, finalPrice)) {
			return ;
		}
		
		// 3. 결제 진행
		super.processPayment(customer, finalPrice, pointToDeduct);

		
		// 4. 적립 (초기 상품값의 0.1%)
		int reward = (int) (originalPrice * POINT_RATE);
		super.giveReward(customer, reward);
		
		printReceipt("편의점", finalPrice, pointToDeduct, reward);
 	}
	
	public int calculateUsePoint (int userPoint, int price) {
		if (userPoint >= POINT_THRESHOLD) {
			return userPoint;
		} else {
			return 0;
		}
	}
}
