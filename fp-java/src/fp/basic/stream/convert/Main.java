package fp.basic.stream.convert;

public class Main {
	
	public static void main(String[] args) {
		
		Converter converter = new Converter();
		
		converter.printConvertResult("10", str -> Integer.parseInt(str));
		converter.printConvertResult("10", Integer::parseInt);
		converter.printConvertResult("fff", str -> Integer.parseInt(str));
		
		// 1. static 메서드일 떄는 반환 타입, 파라미터가 동일해야됨
		// 2. 일반 메서드일 때는 파라미터의 타입이 중요하다. -> 참조를 하기 때문임.
		converter.printConvertResult("qwerasdf", str -> str.length());
		converter.printConvertResult("qwerasdf", String::length);
		
		
	}
}
