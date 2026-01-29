package homework.q1_0128;

public class Main {

	public static void main(String[] args) {
	
		Customer customer1 = new Customer("Normal", 0, 100_000);
		Customer customer2 = new Customer("VIP", 5_000, 300_000);
		Customer customer3 = new Customer("VVIP", 10_000, 500_000);
		
		Customer[] customers = {customer1, customer2, customer3};
		
		Product product1 = new Product("마우스패드", 20_000);
		Product product2 = new Product("마우스", 40_000);
		Product product3 = new Product("키보드", 80_000);
		Product product4 = new Product("모니터", 100_000);
		
		Product[] products = {product1, product2, product3, product4};
		
//		CommonMart commonMart = new CommonMart(products);
//		customer1.buy(commonMart, product1, 3);
		
		ConvenientStore convenientStore = new ConvenientStore(products);
		customer2.buy(convenientStore, product2, 1);
		
	}
}
