package exam.method;

public class MethodQuiz13 {

	public static void main(String[] args) {
		char resChar;
		resChar = getLowerCaseAlpha('a', 25);
		System.out.println(resChar);
		resChar = getLowerCaseAlpha('a', 1);
		System.out.println(resChar);
		resChar = getLowerCaseAlpha('a', 0);
		System.out.println(resChar);
		resChar = getLowerCaseAlpha('a', -1);
		System.out.println(resChar);
		resChar = getLowerCaseAlpha('a', 26);
		System.out.println(resChar);
	}
	
	private static char getLowerCaseAlpha(char a, int num) {
		int resCode = a + num;
		if (num < 0 || num > 25) {
			System.out.println("유효하지 않은 값입니다.");
			return ' ';
		}
		if (resCode > 123) {
			System.out.println("OutOfBounds");
		}
		return (char)resCode;
	}
}
