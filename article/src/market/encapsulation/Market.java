package market.encapsulation;

import java.util.*;
import market.encapsulation.seller.*;
import market.encapsulation.customer.*;
import market.encapsulation.product.*;


public class Market {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Seller seller1 = new Seller(new Product(1000, 500), 100, 0);
		Seller seller2 = new Seller(new Product(2000, 1000), 50, 0);		
		Seller[] sellers = {seller1, seller2};
		
		Customer customer1 = new Customer(1, 50000, 100000);
		Customer customer2 = new Customer(2, 50000, 50000);
		Customer[] customers = {customer1, customer2};
		
		while(true) {
			System.out.print("몇 번 고객이 상품을 구매하나요? (1 or 2 / 종료 : 0): ");
			int customerNum = sc.nextInt();
			Customer customer = findCustomer(customers, customerNum);
			if (customer == null) {
				System.out.println(customerNum + "구매자는 없습니다.");
				continue;
			}
			
			System.out.print("몇 번 판매자에게 상품을 구매하나요? (1 or 2): ");
			int sellerNum = sc.nextInt();
			Seller seller = findSeller(sellers, sellerNum);
			if (seller == null) {
				System.out.println(sellerNum + "판매자는 없습니다.");
				continue;
			}
			
			// 이제 구매 & 판매 할 수 있음
		}
	}
	
	private static Seller findSeller(Seller[] sellers, int sellerNum) {
		for (Seller seller : sellers) {
			if (seller.getSellerNum() == sellerNum) {
				return seller;
			}
		}
		return null;
	}
	
	private static Customer findCustomer(Customer[] customers, int customerNum) {
		for (Customer customer : customers) {
			if (customer.getCustomerNum() == customerNum) {
				return customer;
			}
		}
		return null;
	}
	

}
