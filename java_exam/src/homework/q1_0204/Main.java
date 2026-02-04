package homework.q1_0204;

import homework.q1_0204.mart.Item;
import homework.q1_0204.mart.Store;

public class Main {
	
	public static void main(String[] args) {
		Store store = new Store();
		
		store.add( new Item("A", "2027-01-01"));
		store.add( new Item("B", "2030-11-01"));
		store.add( new Item("C", "2028-05-16"));
		store.add( new Item("D", "2026-02-04")); // 오늘까지
		store.add( new Item("E", "2030-02-04"));
		store.add( new Item("F", "2026-02-07")); // 3일 남음
		store.add( new Item("G", "2026-01-30"));
		store.add( new Item("H", "2024-02-01"));
		
		store.sell(1);
		store.sell(2);
		store.sell(3);
		store.sell(4);
		store.sell(5);
		store.sell(6);
		store.sell(7);
		store.sell(8);
		
	}
}
