package oop.restaurant_practice;

public class Restaurant {
	
	public String restaurantName;
	public boolean isOpen = false;
	public int nowCustomer = 0; 						// 현재 손님 수
	public final int fullSit = 15; 						// 좌석 갯수
	public int menuNum = 0; 							// 현재 메뉴 수
	public String[] menuList = new String[10]; 			// 메뉴 판
	
	public Restaurant (String name) {
		restaurantName = name;
	}
	
	public void addMenu(String name) {
		if(menuNum >= menuList.length) {		// 메뉴판에 공간이 없다면
			System.out.println("메뉴판이 꽉찼습니다. 메뉴를 추가할 수 없습니다.");
		}
		else {
			menuList[menuNum++] = name; 		//메뉴 추가
		}
	}
	
	public void openRestaurant() {
		if (!isOpen) {
			isOpen = true;
			nowCustomer = 0;
			System.out.println(restaurantName + "영업 시작합니다.");
		}
		else {
			System.out.println(restaurantName + "은 이미 영업중입니다.");
		}
	}
	
	public void closeRestaurant() {
		if (isOpen) {
			isOpen = false;
			nowCustomer = 0;
			System.out.println(restaurantName + "영업 종료합니다.");
		}
		else {
			System.out.println(restaurantName + "은 이미 영업종료했습니다.");
		}
	}
	
	public void inCustomer(int customer) {
		if (nowCustomer + customer > fullSit) {
			System.out.println("자리가 꽉찼습니다." + customer + "명을 받을 수 없습니다. 조금만 기다려주세요");
		}
		else {
			nowCustomer += customer;
			System.out.println("손님 " + customer + "명이 들어왔습니다. 현재 인원은 " + nowCustomer + "명 입니다.");
		}
	}
	
	public void outCustomer (int customer) {
		if (nowCustomer - customer < 0) {
			System.out.println("현재 손님은 " + nowCustomer +"명 뿐입니다.");
		}
		else {
			nowCustomer -= customer;
			System.out.println("손님 " + customer + "명이 나갔습니다. 현재 인원은 " + nowCustomer + "명 입니다.");
		}
	}
}
