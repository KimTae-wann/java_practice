package oop.coffeeshop;

import java.util.*;

public class MyCoffeeShop {
	private List<MyCoffee> coffeeMenus;
	
	public MyCoffeeShop() {
		coffeeMenus = new ArrayList<>();
	}

	public void orderCoffee(String coffeeName, int quantity) {
		for (MyCoffee coffee : coffeeMenus) {
			if (coffee.getMyCoffeeName().equals(coffeeName)) {
				System.out.println(coffee.getMyCoffeeName() + "을(를) " + quantity + "개 주문 받았습니다");
				System.out.println("총 가격은 " + coffee.getMyCoffeePrice() * quantity + "원 입니다");
				return ;
			}
		}
		System.out.println(coffeeName + "은(는) 존재하지 않는 음료입니다");
		return ;
	}
	
	public void addCoffeeMenu(MyCoffee addMenu) {
		for (MyCoffee coffee : coffeeMenus) {
			if (coffee.getMyCoffeeName().equals(addMenu.getMyCoffeeName())) {
				System.out.println(addMenu.getMyCoffeeName() + "은(는) 이미 존재하는 메뉴입니다");
				return ;
			}
		}
		System.out.println(addMenu.getMyCoffeeName() + "이(가) 메뉴에 추가되었습니다");
		coffeeMenus.add(addMenu);
	}
}
