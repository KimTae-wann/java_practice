package oop.coffeeshop;

public class MyCoffeeMain {
	
	public static void main(String[] args) {
		MyCoffee iceAmericano = new MyCoffee("아이스 아메리카노", 2000);
		MyCoffee hotLatte = new MyCoffee("따듯한 라떼", 3000);
		MyCoffee iceVanilaLatte = new MyCoffee("아이스 바닐라라떼", 4000);
		MyCoffee iceAmericano2 = new MyCoffee("아이스 아메리카노", 2000);
		
		MyCoffeeShop myCoffeeShop = new MyCoffeeShop();
		myCoffeeShop.addCoffeeMenu(iceAmericano);
		myCoffeeShop.addCoffeeMenu(iceVanilaLatte);		
		myCoffeeShop.addCoffeeMenu(hotLatte);
		myCoffeeShop.addCoffeeMenu(iceAmericano2);
		
		myCoffeeShop.orderCoffee("아이스 아메리카노", 10);
		myCoffeeShop.orderCoffee("따듯한 라떼", 5);
		myCoffeeShop.orderCoffee("아이스 바닐라라떼", 3);
	}
}
