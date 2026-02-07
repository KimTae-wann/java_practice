package fp.basic.stream.calc;

import java.util.function.BiFunction;

public class Calculator {

	public int calc(int num1, int num2, BiFunction<Integer, Integer, Integer> function) {
		return function.apply(num1, num2);
	}
}