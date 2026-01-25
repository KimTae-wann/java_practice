
public class Account {

	private String id;
	private long amount;

	public Account(String id, long amount) {
		this.id = id;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}


	public long getAmount() {
		return amount;
	}
	
	
	public void chargeAccount(int amount) {
		System.out.println(amount + "원 입금했습니다");
		this.amount += amount;
		System.out.println("현재 계좌에는 " + this.amount + "원 있습니다.");
	}
	
	public void withdraw(int amount) {
		if (this.amount - amount < 0) {
			System.out.println(amount + "원을 출금할 수 없습니다.");
			return ;
		}
		this.amount -= amount;
		System.out.println(amount + "원 출금했습니다.\n남은 금액은 " + this.amount + "원 입니다.");
	}
}
