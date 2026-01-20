package exam.method;

public class MethodQuiz11 {

	public static void main(String[] args) {
		char c;
		c = nextChar('a');
		System.out.println(c);
		c = nextChar('c');
		System.out.println(c);
	}
	
	private static char nextChar(char a) {
		int code = a;
		code += 1;
		return (char) code;
	}
}
