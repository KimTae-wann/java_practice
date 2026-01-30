package exceptions;

public class ExceptionExam {
	
	private static void nullExam(String str) {
		// str이 비어있지 않으면 내용을 출력한다.
		if (str != null && !str.isEmpty()) { // 단락 회로 평가 (순서 바뀌면 nullPointerException 뜸)
			System.out.println(str + "출력");
		}
	}
	
	private static void arrayIndexExam(String[] arr, int index) {
		if (arr != null && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}
	}
	
	private static void numberFormatExam(String str) {
		if (str == null) {
			System.out.println(0);
			return ;
		}
		str = str.replace("_", "");
		
		// 숫자를 정수로 변경
		if (str.matches("^[0-9]+${1,10}")) {
			long tempNum = Long.parseLong(str);
			if (tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}
			int num = (int) tempNum;
			System.out.println(num);
		} else {
			System.out.println(0);
		}
	}
	
	public static void main(String[] args) {
//		nullExam("sdas");
//		nullExam(" ");
//		nullExam("");
//		nullExam(null);
		
		arrayIndexExam(new String[] {"a", "b"}, 0);
		arrayIndexExam(new String[] {"a", "b"}, 1);
		arrayIndexExam(new String[] {"a", "b"}, 2);
		arrayIndexExam(new String[] {"a", "b"}, 3);
		arrayIndexExam(null, -1); // 에러 안나지 index가 넘어섰으니까
		arrayIndexExam(null, 0); // 에러 나지 index는 안넘어섰는데 접근하려고 함
		
		numberFormatExam("10");
		numberFormatExam("2000");
		numberFormatExam("3_000_000");
		numberFormatExam("3000000000");
		numberFormatExam("1.2312312");
		numberFormatExam(null);
		
	}
}
