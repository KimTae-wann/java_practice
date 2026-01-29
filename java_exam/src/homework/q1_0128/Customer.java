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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	
	/*
	 * 아래 buy 메서드는 구매자가 구매하는 행위를 오버로딩했는데
	 * 사실 CommonMart, ConvenientStore, DepartmentStore 구분없이
	 * 상위 타입인 Store를 인자로 받아와야 할것같음
	 * 그런데 자세히 보면 로직이 조금씩 다름
	 * 일반 마트는 포인트, 할인 이런게 없고
	 * 편의점은 포인트
	 * 백화점은 각 등급에 따른 포인트, 할인이 존재한다.
	 * 이런경우에는 포인트, 할인과 관련없는 CommonMart에서도 포인트 상수, 할인 상수를 사용해야 하는가?
	 * 아니면 그냥 instanceof로 분기를 나눠야 되는건지
	 * 아니면 그냥 store 클래스의 givePoint 메서드에서 instanceof로 분기해서
	 * 그 리턴 값을 이용하는게 좋은지
	 */
	public void buy (CommonMart commonMart, Product product, int productCount) {
		int totalPrice = product.getProductPrice() * productCount;
		if (this.getAccount() >= product.getProductPrice() * productCount) {
			System.out.println(commonMart.getStoreName() + "에서 " +
								product.getProductName() + "을 구매하였습니다." +
								"가격은 " + totalPrice + "원 입니다.");
			commonMart.refund(totalPrice, this.account);
			return ;
		}
		System.out.println("돈이 부족해서 물품을 구매할 수 없습니다.");
	}
	
	public void buy (ConvenientStore convenientStore, Product product, int productCount) {
		int totalPrice = product.getProductPrice() * productCount;
		// 일단 포인트가 있으면 모든 포인트 소모한다고 가정해.
		if (this.point >= 100) {
			totalPrice -= this.point;
			this.point = 0;
		}
		this.point += (convenientStore.getPoint() * product.getProductPrice() * productCount) / 100;
		System.out.println(this.point);
		if (this.getAccount() >= product.getProductPrice() * productCount) {
			System.out.println(convenientStore.getStoreName() + "에서 " +
								product.getProductName() + "을 구매하였습니다." +
								"가격은 " + totalPrice + "원 입니다.");
			convenientStore.refund(totalPrice, this.account);
			return ;
		}
		System.out.println("돈이 부족해서 물품을 구매할 수 없습니다.");
	}
	
	public void buy (DepartmentStore departmentStore, Product product, int productCount) {
		int totalPrice = product.getProductPrice() * productCount;
		totalPrice -= (int) (totalPrice * departmentStore.getSalePercent(this.grade) / 100); 
		// 일단 포인트가 있으면 모든 포인트 소모한다고 가정해.
		if (this.point >= 10000) {
			totalPrice -= this.point;
			this.point = 0;
		}
		this.point += (departmentStore.getPointPercent(this.grade) * product.getProductPrice() * productCount) / 100;
		System.out.println(this.point);
		if (this.getAccount() >= product.getProductPrice() * productCount) {
			System.out.println(departmentStore.getStoreName() + "에서 " +
								product.getProductName() + "을 구매하였습니다." +
								"가격은 " + totalPrice + "원 입니다.");
			departmentStore.refund(totalPrice, this.account);
			return ;
		}
		System.out.println("돈이 부족해서 물품을 구매할 수 없습니다.");
	}
}
