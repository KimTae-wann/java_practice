package coffee;

import java.util.List;

public class CoffeeShop {
	
	private List<Coffee> coffeeMenus;
	
	public CoffeeShop(List<Coffee> coffeeMenus) {
		this.coffeeMenus = coffeeMenus;
	}
	
	public void orderCoffee(String order, int quantity) {
		for (Coffee coffee : coffeeMenus) {
			if (order.equals(coffee.getCoffeeName())) {
				if (coffee.getCoffeeStock() - quantity < 0) {
					System.out.println(coffee.getCoffeeName() + "를 " + quantity + "만큼 구매할 수 업습니다.");
					System.out.println(coffee.getCoffeeName() + "은 " + coffee.getCoffeeStock() + "잔 남았습니다");
					return ;
				}
				else {
					System.out.println(coffee.getCoffeeName() + "음료를 " + quantity + "개 주문 받았습니다");
					System.out.println(coffee.getCoffeeName() + "은 " + coffee.getCoffeeStock() + "잔 남았습니다");
					System.out.println(coffee.getCoffeeName() + "는 총 " + (coffee.getCoffeePrice() * quantity) + "원 입니다");
					coffee.setCoffeeStock(coffee.getCoffeeStock() - quantity);
					return ;
				}
			}
		}
		System.out.println("그런 메뉴는 없습니다.");
		return ;
	}
}
