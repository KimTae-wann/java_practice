package homework.q1_0121;

import java.util.Scanner;

public class SellingBuyingMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Seller seller = new Seller(100, 2000);
		Customer customer1 = new Customer(1, 40000, 100000);
		Customer customer2 = new Customer(2, 60000, 50000);
		
		while(true) {
			if ((!customer1.canBuy && !customer2.canBuy) || seller.stock <= 0) break;
			System.out.print("몇 번 고객이 상품을 구매하나요? (1 or 2): ");
			int customerNum = sc.nextInt();
			if (customerNum != 1 && customerNum != 2) {
				System.out.println(customerNum + "번 고객은 없습니다.");
				continue;
			}
			System.out.print(customerNum + "번 고객이 상품을 몇 개 구매하나요?: ");
			int productNum = sc.nextInt();
			if (customerNum == 1) {
				if (customer1.buy(productNum)) {
					seller.sell(productNum);
				}
			}
			else if (customerNum == 2) {
				if (customer2.buy(productNum)) {
					seller.sell(productNum);
				}
			}
		}
		System.out.println("상품 구매 & 판매가 끝났습니다.");
	}
}
