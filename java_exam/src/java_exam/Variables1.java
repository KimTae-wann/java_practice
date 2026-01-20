package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중요한 타입 (int, long, float, double, boolean)
		// 나이가 몇살인지 구해보는 나이 계산기
		// 현재 연도 - 나의 생년
		System.out.println(2026 - 1997 + 1);

		// Variable naming Convention
		// 첫 번째 단어의 첫 번째 글자는 소문자로 작성
		// 첫 번째 이후의 단어의 첫 번째 글자는 모두 대문자로 작성
		// 특수 기호나 숫자로 시작할 수 없다
		//	사용 가능한 특수기호 ( _ ) -> 권장하지 않음.
		// CamelCase

		{
			int currentYear = 2026;
			int myBirth = 1997;
			int myAge = currentYear - myBirth + 1;
			System.out.println(myAge);
		}
		
		long price = 1000;
		long buildingPrice = 10_000_000_000L;
		float ratio = 5.111f;
		double doubleRatio = 3.123212312313211312;
		

		// 명시적 형변환
		long bigNumber = Integer.MAX_VALUE + 1L;
		int normalNumber = (int) bigNumber;		
		System.out.println(bigNumber);
		System.out.println(normalNumber);
		
		int num = 2147483647;
		num += 1;
		System.out.println(num);
		
		byte bNumber = 127;
		byte bNum = 1;
		//bNumber = bNumber + bNum; // 상수 리터럴 때문에 안됨
		//bNumber = bNumber + (byte) 1; // 상수 리터럴 때문에 안된다/
		bNumber = (byte) (bNumber + 1); 
		System.out.println(bNumber);
		System.out.println(1000000000000000000L + 3.5f);
		System.out.println("3 + 7의 결과는 " + (3 + 7));
		System.out.println((double)10 / 3);
		System.out.println(10 / (double)3);
		
		System.out.println(10f / 3);
		System.out.println(10 / 3f);
		
		
		System.out.println("계산 끝났습니다.");
	}
	
}


