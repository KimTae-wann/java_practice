package homework.q1_0128;

public class Customer {
	
	private String grade;
	private int point;
	private int account;
	
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
		// 일단 포인트가 있으면 모든 포인트 소모한다고 가정해.
		if (this.point >= 100) {
			totalPrice -= this.point;
			this.point = 0;
		}
		this.point += (departmentStore.getPoint() * product.getProductPrice() * productCount) / 100;
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
	*/
}
