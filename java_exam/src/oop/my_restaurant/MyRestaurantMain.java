package oop.my_restaurant;

public class MyRestaurantMain {
	
	public static void main(String[] args) {
		
		MyRestaurant restaurant = new MyRestaurant("순대국집");
		MyRestaurant.Address address = new MyRestaurant.Address("서울", "방배동");
		address.printAddress();
		
		MyRestaurant.Menu soondae = restaurant.new Menu("순대국", 8000);
		MyRestaurant.Menu sooyuk = restaurant.new Menu("수육", 10000);
		MyRestaurant.Menu haejangguk = restaurant.new Menu("뼈해장국", 9000);
		restaurant.showMenuList();
		
		restaurant.openRestaurant();
		
		restaurant.takeOrder("순대국");
		restaurant.takeOrder("수육");
		restaurant.takeOrder("뼈해장국");
		restaurant.takeOrder("얼큰 순대국");
		
		restaurant.closeRestaurant();
	}
}
