package homework.q1_0128;

/**
 * 백화점은 진열한 상품을 판매하고 구매자에게 판매금액의 0.5%의 포인트를 지급합니다.
 * 또 고객의 등급에 따라 차등 할인 혜택을 제공합니다.
 * 고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 지급받습니다.
 * 고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
 * 고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
 * 고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
 * - 포인트는 전액을 사용하거나 일부만 사용할 수도 있습니다.
 */

public class DepartmentStore extends BaseStore{

	private final double[] DISCOUNT_RATES = {0.1, 0.03, 0};
	private final double[] POINT_RATES = {0.03, 0.0, 0.005};
	private final int POINT_THRESHOLD = 10_000;
	
	@Override
	public void sell(Product product, int count, Customer customer, int pointToUse) {
		// 1. 기본 가격 계산
		int originalPrice = product.getProductPrice() * count;
		String grade = customer.getGrade();
		
		// 2. 최종 금액 & 사용 포인트 계산
		int priceAfterDiscount = calculateDiscountPrice(originalPrice, grade);		
		int pointToDeduct = calculateUsePoint(customer.getPoint(), pointToUse, priceAfterDiscount);
		int finalPrice = priceAfterDiscount - pointToDeduct;
		
		// 3. 잔액 확인
		if (!canBuy(customer, finalPrice)) {
			return ;
		}
		
		// 4. 거래 실행
		processPayment(customer, finalPrice, pointToDeduct);
		
		// 5. 적립 (초기값 기준 적립)
		int reward = calculateReward(originalPrice, grade);
		giveReward(customer, reward);
		
		printReceipt("백화점", finalPrice, pointToDeduct, reward);
	}
	
	private int calculateDiscountPrice(int price, String grade) {
		double rate = 0.0;
		if ("VVIP".equals(grade)) {
			rate = DISCOUNT_RATES[0];
		} else if ("VIP".equals(grade)) {
			rate = DISCOUNT_RATES[1];
		} else {
			rate = DISCOUNT_RATES[2];
		}
		return price - (int) (price * rate);
	}
	
	private int calculateUsePoint(int userPoint, int requestPoint, int price) {
		if (userPoint < POINT_THRESHOLD) {
			return 0;
		}
		// 사용 요청한 포인트와 실제 포인트 중 더 작은 값 사용
		int availablePoint = Math.min(userPoint, requestPoint);
		// 상품 가격보다 많이 쓸 수 없음
		return Math.min(availablePoint, price); 
	}
	
	private int calculateReward(int originalPrice, String grade) {
		double rate = 0.0;
		if ("VVIP".equals(grade)) {
			rate = POINT_RATES[0];
		} else if ("VIP".equals(grade)) {
			rate = POINT_RATES[1];
		} else {
			rate = POINT_RATES[2];
		}
		return (int) (originalPrice * rate);
	}
}
