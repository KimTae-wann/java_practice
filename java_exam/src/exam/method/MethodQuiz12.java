package exam.method;

public class MethodQuiz12 {

	public static void main(String[] args) {
		String res = getCharacters('가', '나');
		System.out.println(res);
	}
	
	private static String getCharacters(char a, char b) {
		String returnString = "";
		for (int i = a; i <= b; i++) {
			returnString += String.valueOf((char)i);
		}
		return returnString;
	}
}
