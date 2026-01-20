package java_exam;

public class MethodExam {
	
	public static void main(String[] args) {
//		System.out.println("제 이름은 김태완 입니다.");
//		System.out.println("제 이름은 땡땡땡 입니다.");
//		System.out.println("제 이름은 000 입니다.");

		
		String[] names = {"김태완", "땡땡땡", "000"};
		printMyName(names);
		System.out.println(computeAdd(5, 10));
	}
	
	private static void printMyName (String names[]) {
		for (String name : names) {
			System.out.println("제 이름은 " + name + " 입니다.");
		}
	}
	
	private static int computeAdd(int number1, int number2) {
		return number1 + number2;
	}
}
