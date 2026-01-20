package exam.method;

public class MethodQuiz14 {

	public static void main(String[] args) {
		char returnChar;
		returnChar = convertUpperCase('a');
		System.out.println(returnChar);
		returnChar = convertUpperCase('c');
		System.out.println(returnChar);
		returnChar = convertUpperCase('1');
		System.out.println(returnChar);
		returnChar = convertUpperCase('A');
		System.out.println(returnChar);
		returnChar = convertUpperCase('^');
		System.out.println(returnChar);
	}
	
	private static char convertUpperCase(char a) {
		if (a < 'a' || a > 'z') {
			return ' ';
		}
		return (char)(a - 32);
	}
}
