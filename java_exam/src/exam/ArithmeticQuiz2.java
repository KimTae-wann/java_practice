package exam;

public class ArithmeticQuiz2 {

	public static void main(String[] args) {
		int minute = 60;
		
		int time = 140;
		System.out.println(time + "초는 " + (time / minute) + "분" + (time % minute) +  "초 입니다.");
	}
}
