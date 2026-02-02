package generics;

import java.util.Arrays;

public class ScoreListTest {

	public static void main(String[] args) {
		
		ScoreList objectList = new ScoreList<>(); // 이렇게 작성하면 Type에 Object 클래스가 들어간다.
		// 원래 인스턴스에도 <Integer>를 명시해줬어야 하는데
		// java 1.7 부터는 생략 가능함 (컴파일시점에 알아서 넘겨줌)
		ScoreList<Integer, Integer> list = new ScoreList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// 익명 클래스 사용
		Reducer<Integer, Integer> listReducer = new Reducer<> () {
			@Override
			public Integer reduce(Integer input, Integer output) {
				return input + output;
			}
		};
		int sum = list.sum(listReducer, 0);
		System.out.println(sum); 
		
		// 람다 사용
		int lambdaSum = list.sum((input, output) -> input + output, 0);
		System.out.println(lambdaSum);
		
		ScoreList<String, String> strList = new ScoreList<>();
		strList.add("asdfgh");
		strList.add("zxcvbn");
		//System.out.println(strList.getScore(0));		
		
		ScoreList<String[], String> strArrayList = new ScoreList<>();
		strArrayList.add(new String[] {"asdfgh", "zxcvbn"});
		strArrayList.add(new String[] {"1", "2"});
		System.out.println(Arrays.toString(strArrayList.getScore(1)));
		
//		String arrayConcat = "";
//		for (int i = 0; i < 2; i++) {
//			arrayConcat += Arrays.toString(strArrayList.getScore(i));
//		}
		Reducer<String[], String> arrayReducer = new Reducer<>() {
			@Override
			public String reduce(String[] input, String output) {
				for (int i = 0; i < input.length; i++) {
					output += input[i];
				}
				return output;
			}
		};
		String arrayResult = strArrayList.sum(arrayReducer, "");
		// 스트림 사용
		System.out.println(arrayResult);
		
		
	}
}