package homework.q1_0128_re;

/**
 * 백화점은 진열한 상품을 판매하고 구매자에게 판매금액의 0.5%의 포인트를 지급합니다.
 * 또 고객의 등급에 따라 차등 할인 혜택을 제공합니다.
 * 고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 지급받습니다.
 * 고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
 * 고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
 * 고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
 * - 포인트는 전액을 사용하거나 일부만 사용할 수도 있습니다.
 */

public class DepartmentStore implements Store{

	@Override
	public void sell(Customer customer, Product product, int moneyPaid, int pointPaid) {
	}
	
	
}
