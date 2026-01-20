package java_exam;

public class CompareExam {
	public static void main(String[] args) {
		int age = 10;
		
		System.out.println("10대에요? : " + (age >= 10 && age < 20));
		System.out.println("20대에요? : " + (age >= 20 && age < 30));
		
		int customerAge = 15;
		int customerWallet = 3000;
		
		// A가게는 19세 이상의 고객만 방문할 수 있다
		// A가게에서 판매하는 모든 제품의 가격은 1500원이다.
		// 고객은 가게에서 제품을 구매할 수 있냐
		System.out.println("A가게 제품 구매 가능 하냐? : " + (customerAge >= 19 && customerWallet >= 1500));

		// B가게는 19세 이상의 고객만 방문할 수 있다
		// B가게에서 판매하는 모든 제품의 가격은 2000원이다.
		// B가게는 특별이벤트로 고객의 나이가 3의 배수이면 돈이 모자라더라도 구매할 수 있다.
		customerAge = 23;
		customerWallet = 1300;
		
		System.out.println("B가게 제품 구매 가능하냐 : " + (customerAge >= 19 &&
														(customerWallet >= 2000 ||
														customerAge % 3 ==0)));
		// 복잡한 
		
	}
}
