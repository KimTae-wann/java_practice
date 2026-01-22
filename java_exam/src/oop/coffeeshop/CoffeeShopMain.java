package oop.coffeeshop;

public class CoffeeShopMain {

	public static void main(String[] args) {
		Coffee iceAmericano = new Coffee("아이스 아메리카노", 1800);
		Coffee hotLatte = new Coffee("따듯한 라떼", 3000); 
		CoffeeShop coffeeShop = new CoffeeShop(iceAmericano, hotLatte);
		
		int iceAmericanoPrice = coffeeShop.orderCoffee(1, 5);
		System.out.println(iceAmericano.getCoffeeName() + "는 " + iceAmericanoPrice + "원 입니다");
		int hotLattePrice = coffeeShop.orderCoffee(2, 10);
		System.out.println(hotLatte.getCoffeeName() + "는 " + hotLattePrice + "원 입니다");
	}
}
