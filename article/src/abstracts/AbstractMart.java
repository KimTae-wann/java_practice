package abstracts;

/**
 * public class Name : 인스턴스로 생성할 수 있는 일반 클래스 정의.
 * public abstract class Name : 인스턴스로 생성할 수 없는 추상 클래스 정의.
 */
public abstract class AbstractMart {

	private int safe;
	private int productPrice;
	/** 고객에게 거슬러 줄 돈 */
	private int remainMoney;
	
	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void sell(Guest guest, int sellCount, int money) {
		this.remainMoney = money;
		
		int guestPoint = this.usePoint(guest);
		
		// 판매가격
		int amount = sellCount * this.productPrice;
		final int firstPrice = amount;
		if (guestPoint >= amount) {
			guest.addPoint(guestPoint - amount);
			guestPoint = amount;
		}
		
		// 할인
		amount -= this.discount(guest, firstPrice); // 할인을 받아
		
		if (money + guestPoint < amount) {
			System.out.println("돈이 모자랍니다. 구매가격: " + amount + ", 손님이 낸 돈: " + money);
			return;
		}
		
		// 손님이 마트에 돈을 지불.
		guest.pay(money);
		
		this.givePoint(guest, firstPrice);
		
		if (amount > guestPoint) {
			this.remainMoney -= amount - guestPoint;
		}
		
		this.safe += money - this.remainMoney;
		System.out.println("매출액: " + this.safe);
		System.out.println("거슬러 줄 돈: " + this.remainMoney);
		
		// 마트가 손님에게 거슬러 준다.
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;
		
	}
	
	public abstract int usePoint(Guest guest);
	
	public abstract void givePoint(Guest guest, int amount);
	
	public abstract int discount(Guest guest, int amount);
	
}
