package string;

public class Immutable {

	
	public static void main(String[] args) {
		
		long startTime1 = System.currentTimeMillis();
		String s1 = "";
		for (int i = 0; i < 10000; i++) {
			s1 += " ";
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("String : " + (endTime1 - startTime1) + "ms");
		
		long startTime2 = System.currentTimeMillis();
		StringBuffer s2 = new StringBuffer("");
		for (int i = 0; i < 10000; i++) {
			s2.append(" ");
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("StringBuffer : " + (endTime2 - startTime2) + "ms");
	}
}
