package oop.restaurant_practice;

public class RestaurantMain {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant("순대국집");
		restaurant.addMenu("순대국");
		restaurant.addMenu("뼈해장국");
		
		restaurant.openRestaurant();
		restaurant.inCustomer(5);
		restaurant.inCustomer(6);
		restaurant.inCustomer(7);
		
		restaurant.outCustomer(4);
		restaurant.outCustomer(3);
		restaurant.outCustomer(10);
		
		restaurant.closeRestaurant();
	}
}
