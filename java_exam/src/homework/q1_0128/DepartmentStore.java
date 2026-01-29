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

public class DepartmentStore {

	private final String storeName = "백화점";
	private Product[] products;
	private final double[] salePercent = {0, 3, 10};
	private final double[] pointPercent = {0.5, 0, 3};
		
	public DepartmentStore(Product[] products) {
		this.products = products;
	}
	
	public String getStoreName() {
		return storeName;
	}

	public double getSalePercent(String grade) {
		double salePercent = 0;
		if (grade.equals("Normal")) {
			salePercent = this.salePercent[0];
		}
		else if (grade.equals("VIP")) {
			salePercent = this.salePercent[1];
		}
		else if (grade.equals("VVIP")) {
			salePercent = this.salePercent[2];			
		}
		return salePercent;
	}

	public double getPointPercent(String grade) {
		double pointPercent = 0;
		if (grade.equals("Normal")) {
			pointPercent = this.pointPercent[0];
		}
		else if (grade.equals("VIP")) {
			pointPercent = this.pointPercent[1];
		}
		else if (grade.equals("VVIP")) {
			pointPercent = this.pointPercent[0];			
		}
		return pointPercent;
	}

	public int refund(int totalPrice, int account) {
		System.out.println(account + "원을 지불하였습니다.");
		System.out.println("거스름돈은 " + (account - totalPrice) + "원 입니다.");
		return account - totalPrice;
	}	
}
