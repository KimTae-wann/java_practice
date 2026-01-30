package exceptions;

public class RandomExtractNumbers {

	private String[] numbers;

	public RandomExtractNumbers() {
		this.numbers = new String[100];
	
		int index = 0;
		for (int i = 0; i < 10; i++) {
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = String.valueOf((int)( Math.random() * 1_000_000));
		}
		
		for (int i = 0; i < 10; i++) {
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = String.valueOf((char) ((int) (Math.random() * 26) + 97));
		}
	}
	
	private void printNumber(int index) {
		
		// this.numbers 의 index에 존재하는 값을 출력한다.
		// 값이 숫자인 경우 그대로 출력하고
		// 숫자가 아닌 경우 0을 출력한다.
		if (index < 0 || index > 99) {
			System.out.println("Index: " + index + " - Out of range - Result: 0");
		} else {
			String str = numbers[index];
			if (str == null) {
				System.out.println("Index: " + index + ", Value: null");
				return ;
			}
			if (str.matches("^[0-9]+$")) {
				System.out.println("Index: " + index + ", Value: " + str);
			} else {
				System.out.println("Index: " + index + ", Value: " + str);
				System.out.println("Index: " + index + " - Not number format - Result: 0");
			}
			
		}
	}
	
	public static void main(String[] args) {
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		
		for (int i = 0; i < 50; i++) {
			index = (int) (Math.random() * 200);
			ren.printNumber(index);
		}
	}
	
}
