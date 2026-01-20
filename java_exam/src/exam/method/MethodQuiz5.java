package exam.method;

public class MethodQuiz5 {
	
	public static void main(String[] args) {
		String num;
		num = getFizzBuzz(9);
		System.out.println(num);
		num =  getFizzBuzz(10);
		System.out.println(num);
		num = getFizzBuzz(15);
		System.out.println(num);
		num = getFizzBuzz(7);
		System.out.println(num);
	}
	
	private static String getFizzBuzz (int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		else if (number % 3 == 0) {
			return "Fizz";
		}
		else if (number % 5 == 0) {
			return "Buzz";
		}
		else {
			return String.valueOf(number);
		}
	}

}
