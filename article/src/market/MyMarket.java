package market;

import java.util.Scanner;

import market.customer.Customer;
import market.customer.MyCustomer;
import market.seller.MySeller;

public class MyMarket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MySeller seller1 = new MySeller(1, 1000, 500, 100, 2000);
		MySeller seller2 = new MySeller(2, 2000, 1000, 50, 2000);
		MyCustomer customer1 = new MyCustomer(1, 60000, 100000);
		MyCustomer customer2 = new MyCustomer(2, 60000, 25000);
		
		MySeller[] sellers = {seller1, seller2};
		MyCustomer[] customers = {customer1, customer2};
		
		boolean canSell = true;
		while (canSell) {
			System.out.print("몇 번 고객이 상품을 구매하나요? (1 or 2): ");
			int customerNum = sc.nextInt();
			System.out.print("몇 번 판매상한테 상품을 구매하나요? (1 or 2): ");
			int sellerNum = sc.nextInt();
			
			for (MyCustomer customer : customers) {
				if (customer.getCustomerNum() == customerNum) {
					for (MySeller seller : sellers) {
						if(seller.getSellerNum() == sellerNum) {
							System.out.print(customerNum + "번 고객이 상품을 몇 개 구매하나요?: ");
							int productNum = sc.nextInt();
							if(customer.buy(productNum, seller.getStockWeight(), seller.getProductPrice())) {
								seller.sell(productNum);
							}
						}
					}
				}
			}
			canSell = false;
			for (MySeller seller : sellers) {
				if (seller.canSell()) {
					canSell = true;
				}
			}
		}
		System.out.println("모든 상품이 품절되었습니다\n상품 구매 & 판매가 끝났습니다.");
	}
}
