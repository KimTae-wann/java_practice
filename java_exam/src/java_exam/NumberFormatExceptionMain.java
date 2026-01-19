package java_exam;

public class NumberFormatExceptionMain {
	
	public static void main(String[] args) {
		// Case1. 숫자형이 아닌 문자열인 경우
		String codeA = "123o";
		System.out.println(Integer.parseInt(codeA));
		
		// Case2. 변경하는 자료형 보다 범위가 큰 경우
		String codeB = "123123123123123123123";
		System.out.println(Integer.parseInt(codeB));
		
		// Case3. null 입력시
		String codeC = "null";
		System.out.println(Integer.parseInt(codeC));
		
		// Case4. 문자 앞뒤로 공백이 있는경우
		String codeD = " 123o ";
		System.out.println(Integer.parseInt(codeD));
	}

}
