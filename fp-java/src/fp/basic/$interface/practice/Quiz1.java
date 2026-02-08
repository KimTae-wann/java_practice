package fp.basic.$interface.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz1 {

	public static void main(String[] args) {
		List<Student> applicants = Arrays.asList(
				new Student("김철수", 85, "Java"),
			    new Student("이영희", 92, "Python"),
			    new Student("박지성", 78, "Java"),
			    new Student("김철수", 85, "Java"), // 중복 데이터
			    new Student("최호날두", 95, "JavaScript"),
			    new Student("강백호", 88, "Java"),
			    new Student("서태웅", 91, "Java"),
			    new Student("송태섭", 82, "Java")
				);
		
		List<String> resList = applicants.stream()
										.distinct()
										.filter(student -> student.getMajor().equals("Java"))
										.filter(student -> student.getScore() >= 80)
										//.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
										.sorted(Comparator.comparing(Student::getScore).reversed())
										.limit(3)
										.map(student -> student.getName() + "[합격]")
										.collect(Collectors.toList());
		
		resList.stream()
				.forEach(System.out::println);
	}
}
