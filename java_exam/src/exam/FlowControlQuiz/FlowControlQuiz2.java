package exam.FlowControlQuiz;

public class FlowControlQuiz2 {
	
	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int sum = 0;
		if (father >= 19) {
			sum += adultOneWayFlightFare;
		}
		else {
			sum += kidOneWayFlightFare;
		}
		if (mother >= 19) {
			sum += adultOneWayFlightFare;
		}
		else {
			sum += kidOneWayFlightFare;
		}
		if (daughter >= 19) {
			sum += adultOneWayFlightFare;
		}
		else {
			sum += kidOneWayFlightFare;
		}
		
		if (money < sum) {
			System.out.println("다음에 가자");
		}
		else {
			System.out.println("여행 가자!");
		}
	}
}
