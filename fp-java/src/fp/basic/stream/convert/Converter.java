package fp.basic.stream.convert;

import java.util.function.Function;

public class Converter {

	public void printConvertResult(String str, Function<String, Integer> function) {
		
		int result = function.apply(str);
		System.out.println(result);
	}
	
}
