package fp.basic.$interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice {

	public static void main(String[] args) {
		// input<T> output boolean Type
		Predicate<Integer> isEven = n -> n % 2 == 0;
		// Predicate.test() return true or false
		System.out.println(isEven.test(4));
		
		// only consume input<T> no output
		Consumer<String> printer = s -> System.out.println("출력: " + s);
		// Consumer.accept() only accept
		printer.accept("Hello World");
		
		// input<T> output<R>
		Function<String, Integer> strLen = s -> s.length();
		// Function.apply() apply an input to function logic
		System.out.println(strLen.apply("Kim Taewan"));
		
		// no input only output
		Supplier<Double> randomNum = () -> Math.random();
		// Supplier.get() means get 
		System.out.println(randomNum.get());
		
		List<Student> students = Arrays.asList(
				new Student("kim", 85),
				new Student("lee", 70),
				new Student("park", 90)
		);
		
		// Stream API
		// 성적이 80점 이상인 학생 이름만 대문자로 출력하기
		students
		.stream()
		.filter(student -> student.getScore() >= 80)
		.map(student -> student.getName().toUpperCase())
		.forEach(System.out::println);
	}
}
