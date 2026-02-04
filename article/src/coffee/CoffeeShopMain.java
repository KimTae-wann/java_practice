package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShopMain {

	public static void main(String[] args) {
		Coffee iceAmericano = new Coffee(CoffeeType.ICE, "iceAmericano", 2000, 100);
		Coffee hotLatte = new Coffee(CoffeeType.HOT, "hotLatte", 3000, 60); 
		List<Coffee> coffeeMenus = new ArrayList<>();
		coffeeMenus.add(iceAmericano);
		coffeeMenus.add(hotLatte);
		CoffeeShop coffeeShop = new CoffeeShop(coffeeMenus);
		
		coffeeShop.orderCoffee("iceAmericano", 101);
		coffeeShop.orderCoffee("hotLatte", 10);
		coffeeShop.orderCoffee("hotVanliaLatte", 10);
	}
}
