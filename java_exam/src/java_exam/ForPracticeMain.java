package java_exam;

public class ForPracticeMain {

	public static void main(String[] args) {
		// practice 1
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// practice 2
		sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		// practice 3
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			else if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		// practice 4
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
}
