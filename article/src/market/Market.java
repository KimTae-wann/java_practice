package market;

import java.util.Scanner;

import market.customer.Customer;
import market.seller.Seller;

public class Market {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Seller seller = new Seller(100, 2000);
		Customer customer1 = new Customer(1, 60000, 100000, seller.getProductPrice(), seller.getStockWeight());
		Customer customer2 = new Customer(2, 60000, 25000, seller.getProductPrice(), seller.getStockWeight());
		Customer[] customers = {customer1, customer2};
		
		while (true) {
			if (seller.getStock() <= 0) {
				break;
			}
			
			System.out.print("몇 번 고객이 상품을 구매하나요? (1 or 2): ");
			int customerNum = sc.nextInt();
			for (Customer customer : customers) {
				if (customer.getCustomerNum() == customerNum) {
					System.out.print(customerNum + "번 고객이 상품을 몇 개 구매하나요?: ");
					int productNum = sc.nextInt();
					if(customer.buy(productNum)) {
						seller.sell(productNum);
					}
				}
			}
		}
		System.out.println("모든 상품이 품절되었습니다\n상품 구매 & 판매가 끝났습니다.");
	}
}
