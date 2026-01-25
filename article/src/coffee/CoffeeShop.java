package coffee;

public class CoffeeShop {
	private Coffee ice;
	private Coffee hot;
	
	public CoffeeShop(Coffee ice, Coffee hot) {
		this.ice = ice;
		this.hot = hot;
	}
	
	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			if (ice.getCoffeeStock() - quantity < 0) {
				System.out.println(ice.getCoffeeName() + "를 " + quantity + "만큼 구매할 수 업습니다.");
				return 0;
			}
			else {
				System.out.println(ice.getCoffeeName() + "음료를 " + quantity + "개 주문 받았습니다");
				ice.setCoffeeStock(ice.getCoffeeStock() - quantity);
				return ice.getCoffeePrice() * quantity;
			}
			
		}
		else if (menu == 2){
			if (hot.getCoffeeStock() - quantity < 0) {
				System.out.println(hot.getCoffeeName() + "는 " + quantity + "잔 보다 적게 남았습니다.");
				return 0;
			}
			System.out.println(hot.getCoffeeName() + "음료를 " + quantity + "개 주문 받았습니다");
			
			hot.setCoffeeStock(ice.getCoffeeStock() - quantity);
			return hot.getCoffeePrice() * quantity;
		}
		else {
			System.out.println("존재하지 않는 음료입니다");
			return 0;
		}
	}
}
