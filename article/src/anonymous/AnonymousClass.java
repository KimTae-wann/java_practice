package anonymous;

import abstracts.*;

public class AnonymousClass {
	
	public static void main(String[] args) {
		AbstractMart mart = new ConvenienceStore(1500) {
			@Override
			public int usePoint(Guest guest) {
				return 0;
			}
			
			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(amount);
			}
			
			@Override
			public int discount(Guest guest, int amount) {
				return amount;
			}
		};
		Guest guest = new Guest(0, 0);
		
		mart.sell(guest, 10000, 0);
		System.out.println(mart.getClass());
	}
}
