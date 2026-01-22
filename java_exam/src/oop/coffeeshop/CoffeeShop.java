package oop.coffeeshop;

public class CoffeeShop {
	private Coffee ice;
	private Coffee hot;
	
	public CoffeeShop(Coffee ice, Coffee hot) {
		this.ice = ice;
		this.hot = hot;
	}
	
	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			System.out.println(ice.getCoffeeName() + "음료를 " + quantity + "개 주문 받았습니다");
			return ice.getCoffeePrice() * quantity;
		}
		else if (menu == 2){
			System.out.println(hot.getCoffeeName() + "음료를 " + quantity + "개 주문 받았습니다");
			return hot.getCoffeePrice() * quantity;
		}
		else {
			System.out.println("존재하지 않는 음료입니다");
			return 0;
		}
	}
}
