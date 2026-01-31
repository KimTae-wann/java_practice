package exceptions;

public class TryExam {
	
	public static void handleException() {
		try {
			Class.forName("com.ktdsuniversity.edu.exceptions.TryExam");
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스 못찾음");
		}
		// forName은 결국 Exception 클래스를 상속받고 있어서 try-catch를 안쓰면 에러 뜬다.
		// RuntimeException 클래스는 try-catch는 선택인데, 일반적으로 if로만 처리한다.
		// 근데 결국 RuntimeException 클래스도 Exception을 상속받는데 얘는 왜 try-catch안씀?
		//0130.txt에 나와있는 것들은 꼭 써줘야됨
	}
	
	public static void numberFormatExam(String str) {
		if (str != null) {
			int value = 0;
			try {
				System.out.println("변환 전!");
				value = Integer.parseInt(str); // 예외 발생 가능성 높음
				System.out.println("변환 후!");
			}
			catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				e.printStackTrace(); // 에러가 발생하게 된 원인들을 모두 출력 (Call stack을 모두 출력)
			}
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		numberFormatExam("100000");
		numberFormatExam("12313124149141");
		numberFormatExam("asdasdasd");
		numberFormatExam("3000000");
	}

}
