package abstracts;

public class MartTest {

	public static void main(String[] args) {
		
//		Guest guest = new Guest(200_000, 0); // money, point
//		Guest guest2 = new Guest(50_000, 300);
//		Guest guest3 = new Guest(0, 12_000);
//		
//		AbstractMart mart = new ConvenienceStore(1500); // productPrice
//		mart.sell(guest, 5, 10000); // Guest, sellCount, inputMoney 
//		System.out.println();
//		
//		mart.sell(guest2, 5, 7200);
//		System.out.println();
//		
//		mart.sell(guest2, 5, 7500);
//		System.out.println();
//		
//		mart.sell(guest3, 5, 0);
//		System.out.println();
//		
//		System.out.println(guest);
//		System.out.println(guest2);
//		System.out.println(guest3);
		
		Guest guest = new Guest(200_000, 0); // money, point
		Guest guest2 = new VIP(50_000, 300);
		Guest guest3 = new VVIP(0, 12_000);
		
		AbstractMart mart = new DepartmentStore(1500);
		mart.sell(guest, 5, 10000);
		System.out.println();
		
		mart.sell(guest2, 5, 7200);
		System.out.println();
		
		mart.sell(guest2, 5, 7500);
		System.out.println();
		
		mart.sell(guest3, 5, 0);
		System.out.println();
		
		System.out.println(guest);
		System.out.println(guest2);
		System.out.println(guest3);
		
	}
	
}
