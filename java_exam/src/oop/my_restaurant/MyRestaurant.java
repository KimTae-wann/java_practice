package oop.my_restaurant;

import java.util.*;

public class MyRestaurant {
	
	private String restaurantName;
	private boolean isOpen = false;
	private List<Menu> menuList = new ArrayList<>(); 
	
	public MyRestaurant (String name) {
		this.restaurantName = name;
	}
	
	// 주소
	// 정적 중첩 클래스
	public static class Address {
		private String city;
		private String dong;
		
		public Address(String city, String dong) {
			this.city = city;
			this.dong = dong;
		}
		
		public void printAddress() {
			System.out.println("위치: " + city + " " + dong);
		}
	}
	
	// 메뉴
	// 내부 클래스
	public class Menu {
		private String name;
		private int price;
		
		public Menu(String name, int price) {
			this.name = name;
			this.price = price;
			menuList.add(this);
		}		
	}
	
	public void showMenuList() {
		for (Menu menu : menuList) {
			System.out.println("[" + restaurantName + "] 메뉴: " + menu.name+ ", 가격: " + menu.price);
		}
	}
	
	// 레스토랑 오픈
	public void openRestaurant() {
		isOpen = true;
		
		// 지역 클래스
		class OpeningEvent {
			void announce() {
				System.out.println("알림: " + restaurantName + "이 영업을 시작했습니다!!!!!\n");
			}
		}
		OpeningEvent event = new OpeningEvent();
		event.announce();
	}
	
	// 레스토랑 마감
	public void closeRestaurant() {
		isOpen = false;
		System.out.println("알림: " + restaurantName + "이 영업을 종료했어용");
		
	}
	

	// 주문
	public void takeOrder (String menuName) {
		// 익명 클래스
		DiscountPolicy discountPolicy = new DiscountPolicy() {
			@Override
			public int applyDiscount(int price) {
				System.out.println(restaurantName + "입니다!!!\n오픈 기념 10% 할인해용. 다들 잡솨보소");
				return (int) (price * 0.9);
			}
		};
	
		for (Menu menu : menuList) {
			if (menu.name.equals(menuName)) {
				int finalPrice = discountPolicy.applyDiscount(menu.price);
				System.out.println("주문해주셔서 감사함다!! " + menuName + "은 할인 적용해서 "  + finalPrice + "원 임다!!!!\n");
				return ;
			}
		}
		System.out.println(menuName + "는 메뉴판에 없는데용???\n");
	}
}
