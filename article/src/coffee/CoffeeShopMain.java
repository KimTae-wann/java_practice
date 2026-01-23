package coffee;

public class CoffeeShopMain {

	public static void main(String[] args) {
		Coffee iceAmericano = new Coffee("아이스 아메리카노", 2000, 100);
		Coffee hotLatte = new Coffee("따듯한 라떼", 3000, 60); 
		CoffeeShop coffeeShop = new CoffeeShop(iceAmericano, hotLatte);
		
		int iceAmericanoPrice = coffeeShop.orderCoffee(1, 101);
		System.out.println(iceAmericano.getCoffeeName() + "은 " + iceAmericano.getCoffeeStock() + "잔 남았습니다");
		System.out.println(iceAmericano.getCoffeeName() + "는 총 " + iceAmericanoPrice + "원 입니다");
		int hotLattePrice = coffeeShop.orderCoffee(2, 10);
		System.out.println(hotLatte.getCoffeeName() + "은 " + hotLatte.getCoffeeStock() + "잔 남았습니다");
		System.out.println(hotLatte.getCoffeeName() + "는 총 " + hotLattePrice + "원 입니다");
	}
}
