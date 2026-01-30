package homework.q1_0128;

public abstract class BaseStore implements Store{
	// canBuy (구매 여부 검증)
	protected boolean canBuy(Customer customer, int price) {
		if (customer.getAccount() < price) {
			System.out.println("[구매 실패] 잔액이 부족합니다. (필요: " + price + "원)");			
			return false;
		} else {
	        return true;
		}
	}
	// processPayment (실제 결제)
	protected void processPayment(Customer customer, int cashAmount, int pointAmount) {
		if (pointAmount > 0) {
            customer.usePoint(pointAmount);
        }
        if (cashAmount > 0) {
            customer.pay(cashAmount);
        }
	}
	// giveReward (포인트적립)
	protected void giveReward(Customer customer, int pointToAdd) {
		if (pointToAdd > 0) {
			customer.addPoint(pointToAdd);
		}
	}
	// printReceipt (영수증출력)
	protected void printReceipt(String storeName, int finalPrice, int usedPoint, int reward) {
		System.out.println("[" + storeName + "]" + " 구매 완료.");
		System.out.println(" - 사용 포인트: " + usedPoint + "점");
		System.out.println(" - 실 결제액: " + finalPrice + "원");
		System.out.println(" - 적립 포인트: " + reward + "점");
	}
}
