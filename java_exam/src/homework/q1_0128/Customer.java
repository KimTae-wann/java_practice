package homework.q1_0128;

public class Customer {
	
	private String grade;	// 이 grade는 DepartmentStore 클래스에서만 사용함
	private int point;		// 모든 마트(일반 마트, 편의점, 백화점)은 포인트를 공유한다.
	private int account;	// 보유 금액
	
	public Customer(String grade, int point, int account) {
		this.grade = grade;
		this.point = point;
		this.account = account;
	}
	
	// Store Interface 사용
	public void buy(Store store, Product product, int count, int pointToUse) {
		// 가게에게 요청 (자신을 인자로 넘김)
		store.sell(product, count, this, pointToUse);
	}
	
	// 가게가 돈을 가져감
	public void pay(int amount) {
		this.account -= amount;
	}
	
	// 가게가 포인트를 줌
	public void addPoint(int point) {
		this.point += point;
	}
	
	// 가게가 포인트를 사용함
	public void usePoint(int point) {
		this.point -= point;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}

	public int getAccount() {
		return account;
	}
}
