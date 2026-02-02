package generics.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

	public static void main(String[] args) {
		Map<Integer, List<Student>> classes = new HashMap<>();
		
		classes.put(1, new ArrayList<>());
		classes.put(2, new ArrayList<>());
		
		classes.get(1).add(new Student(1, "김범수"));
		classes.get(1).add(new Student(2, "나얼"));
		classes.get(1).add(new Student(3, "박효신"));
		classes.get(1).add(new Student(4, "이수"));
		
//		System.out.println(classes);
//		System.out.println(classes.size());
		
//		// 하지마
//		for (Integer key : classes.keySet()) {
//			System.out.println(classes.get(key));
//		}
		printStudents(classes, 1);
		
		
	}
	
	private static void printStudents(Map<Integer,
									List<Student>> classes,
									int classNum) {
		List<Student> students = classes.get(classNum);
		
		for (Student student : students) {
			System.out.println(classNum + "반의 학생 " + student);
		}
	}
}
